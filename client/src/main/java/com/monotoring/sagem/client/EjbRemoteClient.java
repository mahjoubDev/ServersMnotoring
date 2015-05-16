package com.monotoring.sagem.client;

import static javax.naming.Context.INITIAL_CONTEXT_FACTORY;
import static javax.naming.Context.PROVIDER_URL;
import static javax.naming.Context.URL_PKG_PREFIXES;

import java.util.Hashtable;
import java.util.Map;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import com.sagem.monotoring.session.MonotoringSessionRemote;

/**
 * Remote EJB Client.
 * 
 * @author achref
 * 
 */
public class EjbRemoteClient {

	/**
	 * Run example.
	 * 
	 * @param args
	 *            (not used)
	 */
	public static MonotoringSessionRemote GetEjbReference() {

		// Connection to Wildfly Server instance
		String host = "127.0.0.1";
		String port = "9080"; // Wildfly HTTP port

		Context remotingContext;
		try {
			remotingContext = createRemoteEjbContext(host, port);
		} catch (NamingException e) {
			System.err.println("Error setting up remoting context");
			e.printStackTrace();
			return null;
		}

		String ejbUrl = "ejb:/ejb-remote-server/MonotoringSessionBean!com.sagem.monotoring.session.MonotoringSessionRemote";

		MonotoringSessionRemote service;
		try {
			service = createEjbProxy(remotingContext, ejbUrl,
					MonotoringSessionRemote.class);
		} catch (NamingException e) {
			System.err.println("Error resolving bean");
			e.printStackTrace();
			return null;
		} catch (ClassCastException e) {
			System.err.println("Resolved EJB is of wrong type");
			e.printStackTrace();
			return null;
		}

		// Call remote method with parameter

		String toGreet = "World";

		String exampleResult;
		try {
			exampleResult = service.sayHello("mahjoub");
		} catch (Exception e) {
			System.err.println("Error accessing remote bean");
			e.printStackTrace();
			return null;
		}
		// Hello World!
		System.out.println("Example result: " + exampleResult);
		return service;

	}

	/**
	 * Create Remote EJB Context.
	 * 
	 * @param host
	 *            host to connect to (e.g. "127.0.0.1")
	 * @param port
	 *            port to connect to (wildfly HTTP port, e.g. 8080)
	 * @return remote EJB context
	 * @throws NamingException
	 *             if creating the context fails
	 */
	private static Context createRemoteEjbContext(String host, String port)
			throws NamingException {

		Hashtable<Object, Object> props = new Hashtable<>();

		props.put(INITIAL_CONTEXT_FACTORY,
				"org.jboss.naming.remote.client.InitialContextFactory");
		props.put(URL_PKG_PREFIXES, "org.jboss.ejb.client.naming");

		props.put("jboss.naming.client.ejb.context", false);
		props.put("org.jboss.ejb.client.scoped.context", true);

		props.put("endpoint.name", "client-endpoint");
		props.put(
				"remote.connectionprovider.create.options.org.xnio.Options.SSL_ENABLED",
				false);
		props.put("remote.connections", "default");
		props.put(
				"remote.connection.default.connect.options.org.xnio.Options.SASL_POLICY_NOANONYMOUS",
				false);

		props.put(PROVIDER_URL, "http-remoting://" + host + ":" + port);
		props.put("remote.connection.default.host", host);
		props.put("remote.connection.default.port", port);

		return new InitialContext(props);
	}

	/**
	 * Get a proxy for a remote EJB.
	 * 
	 * @param remotingContext
	 *            remote EJB context
	 * @param ejbUrl
	 *            URL of the EJB
	 * @param ejbInterfaceClass
	 *            class of the remote interface of the EJB
	 * @param <T>
	 *            type of the EJB remote interface
	 * @return EJB proxy
	 * @throws NamingException
	 *             if the name resolving fails
	 * @throws ClassCastException
	 *             if the EJB proxy is not of the given type
	 */
	@SuppressWarnings("unchecked")
	private static <T> T createEjbProxy(Context remotingContext, String ejbUrl,
			Class<T> ejbInterfaceClass) throws NamingException,
			ClassCastException {
		Object resolvedproxy = remotingContext.lookup(ejbUrl);
		return (T) resolvedproxy;
	}

}
