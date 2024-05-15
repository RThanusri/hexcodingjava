package Com.java.Model;

public class Doctor {
	
	private int doctorId;
	private String firstname;
	private String lastname;
	private String specialization;
	private String contactNumber;
	
	public Doctor()
	{
		
	}

	public Doctor(int doctorId, String firstname, String lastname, String specialization, String contactNumber) {
		super();
		this.doctorId = doctorId;
		this.firstname = firstname;
		this.lastname = lastname;
		this.specialization = specialization;
		this.contactNumber = contactNumber;
	}

	public int getDoctorId() {
		return doctorId;
	}

	public void setDoctorId(int doctorId) {
		this.doctorId = doctorId;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getSpecialization() {
		return specialization;
	}

	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	@Override
	public String toString() {
		return "Doctor [doctorId=" + doctorId + ", firstname=" + firstname + ", lastname=" + lastname
				+ ", specialization=" + specialization + ", contactNumber=" + contactNumber + "]";
	}
	
	

}
