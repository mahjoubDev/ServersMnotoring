package com.sagem.monotoring.entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;
import javax.persistence.Column;

import javax.persistence.Table;

@Entity
@Table(name = "PRINTJOB")
public class PrintJob implements Serializable {

	private int JobId;

	private String Caption; // Short description of the object
	private String Color; // ma te5demch 3al winserver2003
	private String DataType;// Format of the data for this print job
	private String Description;// Description of the object.
	private String Document;// Name of the print job.
	private String DriverName;// Name of the printer driver used for the print
								// job.
	private Date ElapsedTime;// Length of time that the job has been executing
	private String HostPrintQueue;// Name of the computer on which the print job
									// is created.
	private Date InstallDate;// Date and time the object is installed.
	private String JobStatus;// Free-form string that represents the job status.
	private String Name;// Name of the printer to which the print job is being
						// spooled followed by a comma and then the number of
						// the job.
	private String Notify;// User is to be notified when the job either
							// completes or fails
	private String Owner;// User that submitted the job
	private int PagesPrinted;// Number of pages that are printed. This value may
								// be 0 (zero) if the print job does not contain
								// page-delimiting information.
	private int PaperLength;// Tenths of a millimeter.)
	private String PaperSize;// Windows Server 2003: This property is not
								// available.
	private int PaperWidth;// Tenths of a millimeter.)
	private String Parameters;//
	private String PrintProcessor;//
	private int Priority;// Urgency or importance of job execution
	private int Size;// octet
	private Date StartTime;// Date and time that the job begins.
	private String Status;//
	private int StatusMask;//
	private Date TimeSubmitted;//
	private int TotalPages;// Number of pages required to complete the job. This
							// value may be 0 (zero) if the print job does not
							// contain page-delimiting information.
	private Date UntilTime;// Time when the job is invalid or should be stopped.

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public int getJobId() {
		return JobId;
	}

	public void setJobId(int JobId) {
		this.JobId = JobId;
	}

	@Column(length = 60000)
	public String getCaption() {
		return Caption;
	}

	public void setCaption(String Caption) {
		this.Caption = Caption;
	}

	@Column(length = 60000)
	public String getColor() {
		return Color;
	}

	public void setColor(String Color) {
		this.Color = Color;
	}

	@Column(length = 60000)
	public String getDataType() {
		return DataType;
	}

	public void setDataType(String DataType) {
		this.DataType = DataType;
	}

	@Column(length = 60000)
	public String getDescription() {
		return Description;
	}

	public void setDescription(String Description) {
		this.Description = Description;
	}

	@Column(length = 60000)
	public String getDocument() {
		return Document;
	}

	public void setDocument(String Document) {
		this.Document = Document;
	}

	@Column(length = 60000)
	public String getDriverName() {
		return DriverName;
	}

	public void setDriverName(String DriverName) {
		this.DriverName = DriverName;
	}

	@Column(length = 60000)
	public Date getElapsedTime() {
		return ElapsedTime;
	}

	public void setElapsedTime(Date ElapsedTime) {
		this.ElapsedTime = ElapsedTime;
	}

	@Column(length = 60000)
	public String getHostPrintQueue() {
		return HostPrintQueue;
	}

	public void setHostPrintQueue(String HostPrintQueue) {
		this.HostPrintQueue = HostPrintQueue;
	}

	@Column(length = 60000)
	public Date getInstallDate() {
		return InstallDate;
	}

	public void setInstallDate(Date InstallDate) {
		this.InstallDate = InstallDate;
	}

	@Column(length = 60000)
	public String getJobStatus() {
		return JobStatus;
	}

	public void setJobStatus(String JobStatus) {
		this.JobStatus = JobStatus;
	}

	@Column(length = 60000)
	public String getName() {
		return Name;
	}

	public void setName(String Name) {
		this.Name = Name;
	}

	@Column(length = 60000)
	public String getNotify() {
		return Notify;
	}

	public void setNotify(String Notify) {
		this.Notify = Notify;
	}

	@Column(length = 60000)
	public String getOwner() {
		return Owner;
	}

	public void setOwner(String Owner) {
		this.Owner = Owner;
	}

	@Column(length = 60000)
	public int getPagesPrinted() {
		return PagesPrinted;
	}

	public void setPagesPrinted(int PagesPrinted) {
		this.PagesPrinted = PagesPrinted;
	}

	@Column(length = 60000)
	public int getPaperLength() {
		return PaperLength;
	}

	public void setPaperLength(int PaperLength) {
		this.PaperLength = PaperLength;
	}

	@Column(length = 60000)
	public String getPaperSize() {
		return PaperSize;
	}

	public void setPaperSize(String PaperSize) {
		this.PaperSize = PaperSize;
	}

	@Column(length = 60000)
	public int getPaperWidth() {
		return PaperWidth;
	}

	public void setPaperWidth(int PaperWidth) {
		this.PaperWidth = PaperWidth;
	}

	@Column(length = 60000)
	public String getParameters() {
		return Parameters;
	}

	public void setParameters(String Parameters) {
		this.Parameters = Parameters;
	}

	@Column(length = 60000)
	public String getPrintProcessor() {
		return PrintProcessor;
	}

	public void setPrintProcessor(String PrintProcessor) {
		this.PrintProcessor = PrintProcessor;
	}

	@Column(length = 60000)
	public int getPriority() {
		return Priority;
	}

	public void setPriority(int Priority) {
		this.Priority = Priority;
	}

	@Column(length = 60000)
	public int getSize() {
		return Size;
	}

	public void setSize(int Size) {
		this.Size = Size;
	}

	@Column(length = 60000)
	public Date getStartTime() {
		return StartTime;
	}

	public void setStartTime(Date StartTime) {
		this.StartTime = StartTime;
	}

	@Column(length = 60000)
	public String getStatus() {
		return Status;
	}

	public void setStatus(String Status) {
		this.Status = Status;
	}

	@Column(length = 60000)
	public int getStatusMask() {
		return StatusMask;
	}

	public void setStatusMask(int StatusMask) {
		this.StatusMask = StatusMask;
	}

	@Column(length = 60000)
	public Date getTimeSubmitted() {
		return TimeSubmitted;
	}

	public void setTimeSubmitted(Date TimeSubmitted) {
		this.TimeSubmitted = TimeSubmitted;
	}

	@Column(length = 60000)
	public int getTotalPages() {
		return TotalPages;
	}

	public void setTotalPages(int TotalPages) {
		this.TotalPages = TotalPages;
	}

	@Column(length = 60000)
	public Date getUntilTime() {
		return UntilTime;
	}

	public void setUntilTime(Date UntilTime) {
		this.UntilTime = UntilTime;

	}

	public PrintJob(String Caption, String Color, String DataType,
			String Description, String Document, String DriverName,
			Date ElapsedTime, String HostPrintQueue, Date InstallDate,
			String JobStatus, String Name, String Notify, String Owner,
			int PagesPrinted, int PaperLength, String PaperSize,
			int PaperWidth, String Parameters, String PrintProcessor,
			int Priority, int Size, Date StartTime, String Status,
			int StatusMask, Date TimeSubmitted, int TotalPages, Date UntilTime) {
		super();

		this.Caption = Caption;
		this.Color = Color;
		this.DataType = DataType;
		this.Description = Description;
		this.Document = Document;
		this.DriverName = DriverName;
		this.ElapsedTime = ElapsedTime;
		this.HostPrintQueue = HostPrintQueue;
		this.InstallDate = InstallDate;
		this.JobStatus = JobStatus;
		this.Name = Name;
		this.Notify = Notify;
		this.Owner = Owner;
		this.PagesPrinted = PagesPrinted;
		this.PaperLength = PaperLength;
		this.PaperSize = PaperSize;
		this.PaperWidth = PaperWidth;
		this.Parameters = Parameters;
		this.PrintProcessor = PrintProcessor;
		this.Priority = Priority;
		this.Size = Size;
		this.StartTime = StartTime;
		this.Status = Status;
		this.StatusMask = StatusMask;
		this.TimeSubmitted = TimeSubmitted;
		this.TotalPages = TotalPages;
		this.UntilTime = UntilTime;
	}

}
