package com.sagem.monotoring.session;

import javax.ejb.Remote;
import javax.ejb.Stateless;

import com.sagem.monotoring.entity.PrintJob;
import com.sagem.monotoring.entity.Printer;

@Remote
public interface MonotoringSessionRemote {

	public void addPrintJob(PrintJob printjob);

	public void updatePrintJob(PrintJob printjob);

	public PrintJob findPrintJob(int id);

	public void addPrinter(Printer printer);

	public void updatePrinter(Printer printer);

	public Printer findPrinter(int id);

	public String sayHello(String name);

}
