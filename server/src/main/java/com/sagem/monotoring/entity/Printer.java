package com.sagem.monotoring.entity;

/**
 *
 * @author Achref
 */
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;
import javax.persistence.Column;


import javax.persistence.Table;
@Entity
@Table(name = "PRINTER")
public class Printer implements Serializable{
    
    
            private int PrinterID;
            private String DeviceID;
            private String PrintProcessor;
            private String PrinterStatus;
            private int PrinterState;
            private boolean KeepPrintedJobs;
            private String Status;
            private String StatusInfo;
            private int AveragePagesPerMinute;
            private String PortName;
   
            
            private String CapabilityDescriptions;
            private int DefaultPriority;

            
            
    @Id
   @GeneratedValue(strategy=GenerationType.AUTO)        
    public int getPrinterID() {
        return PrinterID;
    }

    public void setPrinterID(int PrinterID) {
        this.PrinterID = PrinterID;
    }
            
            
            
            
            
            
   @Column( length=60000)
    public String getDeviceID() {
        return DeviceID;
    }

    public void setDeviceID(String DeviceID) {
        this.DeviceID = DeviceID;
    }
@Column( length=60000)
    public String getPrintProcessor() {
        return PrintProcessor;
    }

    public void setPrintProcessor(String PrintProcessor) {
        this.PrintProcessor = PrintProcessor;
    }

    @Column( length=60000)
    public String getPrinterStatus() {
        return PrinterStatus;
    }

    public void setPrinterStatus(String PrinterStatus) {
        this.PrinterStatus = PrinterStatus;
    }

    @Column( length=60000)
    public int getPrinterState() {
        return PrinterState;
    }

    public void setPrinterState(int PrinterState) {
        this.PrinterState = PrinterState;
    }

    @Column( length=60000)
     public boolean isKeepPrintedJobs() {
        return KeepPrintedJobs;
    }

    public void setKeepPrintedJobs(boolean KeepPrintedJobs) {
        this.KeepPrintedJobs = KeepPrintedJobs;
    }

    @Column( length=60000)
    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }

    @Column( length=60000)
    public String getStatusInfo() {
        return StatusInfo;
    }

    public void setStatusInfo(String StatusInfo) {
        this.StatusInfo = StatusInfo;
    }

    @Column( length=60000)
    public int getAveragePagesPerMinute() {
        return AveragePagesPerMinute;
    }

    public void setAveragePagesPerMinute(int AveragePagesPerMinute) {
        this.AveragePagesPerMinute = AveragePagesPerMinute;
    }

    @Column( length=60000)
    public String getPortName() {
        return PortName;
    }

    public void setPortName(String PortName) {
        this.PortName = PortName;
    }


    @Column( length=60000)
    public String getCapabilityDescriptions() {
        return CapabilityDescriptions;
    }

    public void setCapabilityDescriptions(String CapabilityDescriptions) {
        this.CapabilityDescriptions = CapabilityDescriptions;
    }

    @Column( length=60000)
    public int getDefaultPriority() {
        return DefaultPriority;
    }

    public void setDefaultPriority(int DefaultPriority) {
        this.DefaultPriority = DefaultPriority;
    }

    public Printer(String DeviceID, String PrintProcessor, String PrinterStatus, int PrinterState, boolean KeepPrintedJobs, String Status, String StatusInfo, int AveragePagesPerMinute, String PortName, String CapabilityDescriptions, int DefaultPriority) {
        this.DeviceID = DeviceID;
        this.PrintProcessor = PrintProcessor;
        this.PrinterStatus = PrinterStatus;
        this.PrinterState = PrinterState;
        this.KeepPrintedJobs = KeepPrintedJobs;
        this.Status = Status;
        this.StatusInfo = StatusInfo;
        this.AveragePagesPerMinute = AveragePagesPerMinute;
        this.PortName = PortName;
        this.CapabilityDescriptions = CapabilityDescriptions;
        this.DefaultPriority = DefaultPriority;
    }

	public Printer() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Printer [PrinterID=" + PrinterID + ", DeviceID=" + DeviceID
				+ ", PrintProcessor=" + PrintProcessor + ", PrinterStatus="
				+ PrinterStatus + ", PrinterState=" + PrinterState
				+ ", KeepPrintedJobs=" + KeepPrintedJobs + ", Status=" + Status
				+ ", StatusInfo=" + StatusInfo + ", AveragePagesPerMinute="
				+ AveragePagesPerMinute + ", PortName=" + PortName
				+ ", CapabilityDescriptions=" + CapabilityDescriptions
				+ ", DefaultPriority=" + DefaultPriority + "]";
	}
    
    

     



}