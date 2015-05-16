package com.proxym.cron;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.monotoring.sagem.client.EjbRemoteClient;
import com.sagem.monotoring.entity.Printer;
import com.sagem.monotoring.session.MonotoringSessionBean;
import com.sagem.monotoring.session.MonotoringSessionRemote;

/**
 * this class is responsible for watching the values in the print state and call
 * the remote ejb to update .
 * 
 * @author Achref.
 * @version 1.0 .
 * 
 */
@Component
@EnableScheduling
public class CronPrintwatch {

	/**
	 * The logger instance . All log messages from this class are routed through
	 * this member.
	 */
	private final static Logger LOGGER = LoggerFactory
			.getLogger(CronPrintwatch.class);

	/**
	 * Check if there is
	 * 
	 * @throws MessagingException
	 *             indicates there is messaging mail problem.
	 * @throws GestionResourceException
	 *             indicate there is processing problem.
	 */
	@Scheduled(cron = "0/5 * * * * ?")
	public void sendUserEmail() throws Exception {

		LOGGER.info("search print values");
		MonotoringSessionRemote monotoringSessionRemote = EjbRemoteClient
				.GetEjbReference();

		String s = "";
		String val = "";
		Process p = Runtime
				.getRuntime()
				.exec("wmic printer get PrintProcessor,PrinterStatus,PrinterState,KeepPrintedJobs,Status,StatusInfo,AveragePagesPerMinute,PortName,DeviceID,CapabilityDescriptions,DefaultPriority");
		BufferedReader stdInput = new BufferedReader(new InputStreamReader(
				p.getInputStream()));

		BufferedReader stdError = new BufferedReader(new InputStreamReader(
				p.getErrorStream()));
		while ((s = stdInput.readLine()) != null) {
			if (!s.equals(""))
				val = val + s + "##\n";

		}

		String valtab[] = val.split("##\n");
		List<Printer> printers = new ArrayList<Printer>();

		if (valtab.length > 1) {
			for (int i = 1; i < valtab.length; i++) {
				String[] values = valtab[i].split("\\s{2,}+");
				Printer printer = new Printer();
				printer.setAveragePagesPerMinute(Integer.parseInt(values[0]));
				printer.setCapabilityDescriptions(values[1]);
				printer.setDefaultPriority(Integer.parseInt(values[2]));
				printer.setDeviceID(values[3]);
				printer.setKeepPrintedJobs(Boolean.getBoolean(values[4]));
				printer.setPortName(values[5]);
				printer.setPrinterState(Integer.parseInt(values[6]));
				printer.setPrinterStatus(values[7]);
				printer.setPrintProcessor(values[8]);
				printer.setStatus(values[9]);
				printers.add(printer);
			}
			monotoringSessionRemote.addPrinter(printers);
			System.out.println(printers.toString());

		}

	}

}
