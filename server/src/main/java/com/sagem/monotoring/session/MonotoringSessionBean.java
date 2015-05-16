package com.sagem.monotoring.session;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.sagem.monotoring.entity.PrintJob;
import com.sagem.monotoring.entity.Printer;

@Stateless
public class MonotoringSessionBean implements MonotoringSessionRemote {

	@PersistenceContext
	EntityManager em;

	public void addPrintJob(PrintJob printjob) {
		em.persist(printjob);

	}

	public void updatePrintJob(PrintJob printjob) {
		em.persist(printjob);

	}

	public PrintJob findPrintJob(int id) {
		// TODO Auto-generated method stub
		return em.find(PrintJob.class, id);
	}

	public void addPrinter(List<Printer> printers) {
		for(Printer printer:printers) {
			em.persist(printer);
		}

		

	}

	public void updatePrinter(Printer printer) {

		em.persist(printer);

	}

	public Printer findPrinter(int id) {
		return null;
	}

	public String sayHello(String name) {
		return "Hello word " + name + " you are logged";
	}

}
