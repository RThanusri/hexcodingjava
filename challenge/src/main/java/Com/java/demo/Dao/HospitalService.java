package Com.java.demo.Dao;

import java.util.List;

import Com.java.Model.AppointmentClass;

public interface HospitalService {
	  AppointmentClass getAppointmentById(int appointmentId);
	  List<AppointmentClass> getAppointmentsForPatiet(int patientId);
	  List<AppointmentClass> getAppointmentsForDoctor(int doctorId);
	  boolean scheduleAppointment(AppointmentClass appointments);
	  boolean updateAppointment(AppointmentClass appointments) ;
	  boolean cancelAppointment(int appointmentId);
	  
	
	

}
