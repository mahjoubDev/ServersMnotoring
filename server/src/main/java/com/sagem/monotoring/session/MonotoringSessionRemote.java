package com.sagem.monotoring.session;

import java.util.List;

import javax.ejb.Remote;

import com.sagem.monotoring.entity.PrintJob;
import com.sagem.monotoring.entity.Printer;

@Remote
public interface MonotoringSessionRemote {

	public void addPrintJob(PrintJob printjob);

	public void updatePrintJob(PrintJob printjob);

	public PrintJob findPrintJob(int id);

	public void addPrinter(List<Printer> printer);

	public void updatePrinter(Printer printer);

	public Printer findPrinter(int id);

	public String sayHello(String name);

}
