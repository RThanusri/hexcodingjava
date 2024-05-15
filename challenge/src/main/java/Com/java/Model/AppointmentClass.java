package Com.java.Model;

public class AppointmentClass {
	private static int appointmetId;
	private int patientId;
	private int doctorId;
	private String appointmentDate;
	private String description;
	
	public  AppointmentClass()
	{
		
	}

	public AppointmentClass(int appointmetId, int patientId, int doctorId, String appointmentDate, String description) {
		super();
		this.appointmetId = appointmetId;
		this.patientId = patientId;
		this.doctorId = doctorId;
		this.appointmentDate = appointmentDate;
		this.description = description;
	}

	public static int getAppointmetId() {
		return appointmetId++;
	}

	public void setAppointmetId(int appointmetId) {
		this.appointmetId = appointmetId;
	}

	public int getPatientId() {
		return patientId;
	}

	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}

	public int getDoctorId() {
		return doctorId;
	}

	public void setDoctorId(int doctorId) {
		this.doctorId = doctorId;
	}

	public String getAppointmentDate() {
		return appointmentDate;
	}

	public void setAppointmentDate(String appointmentDate) {
		this.appointmentDate = appointmentDate;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "AppointmentClass [appointmetId=" + appointmetId + ", patientId=" + patientId + ", doctorId=" + doctorId
				+ ", appointmentDate=" + appointmentDate + ", description=" + description + "]";
	}
	
	

}
