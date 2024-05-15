package Com.java.demo.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import Com.java.Connect.DataConnect;
import Com.java.Exception.PatientNumberNotFoundException;
import Com.java.Model.AppointmentClass;

public class HospitalServiceImpl implements HospitalService {

    private Connection con;
    private PreparedStatement stat;

    public HospitalServiceImpl() {
        con = DataConnect.getConnect();
    }

    public AppointmentClass getAppointmentById(int appointmentId) {
   
    	try {
    	    stat = con.prepareStatement("SELECT * FROM AppointmentClass WHERE appointmentId=?");
    	    stat.setInt(1, appointmentId);
    	    ResultSet rs = stat.executeQuery();

    	    if (rs.next()) {
    	        System.out.println("Appointment Details:");
    	        System.out.println("AppointmentId: " + rs.getInt("appointmentId"));
    	        System.out.println("PatientId: " + rs.getInt("patientId"));
    	        System.out.println("DoctorId: " + rs.getInt("doctorId"));
    	        System.out.println("Appointment Date: " + rs.getString("appointmentDate"));
    	        System.out.println("Description: " + rs.getString("description"));
    	    } else {
    	        System.out.println("Appointment not found!");
    	    }
    	} catch (Exception e) {
    	    System.out.println(e.getMessage()); 
    	}
		return null;
    }

	public List<AppointmentClass> getAppointmentsForPatiet(int patientId) {

		try {
		    stat = con.prepareStatement("SELECT * FROM AppointmentClass WHERE patientId=?");
		    stat.setInt(1, patientId);
		    ResultSet rs = stat.executeQuery();

		    if (rs.next()) {
		        System.out.println("Appointment Details:");
		        System.out.println("AppointmentId: " + rs.getInt("appointmentId"));
		        System.out.println("PatientId: " + rs.getInt("patientId"));
		        System.out.println("DoctorId: " + rs.getInt("doctorId"));
		        System.out.println("Appointment Date: " + rs.getString("appointmentDate"));
		        System.out.println("Description: " + rs.getString("description"));
		        
		    }
		    else
		    {
		    	System.out.println("Patient not found!");
		    	
		    }
		} catch (Exception e) {
			System.out.println(e.getMessage());
		
		    
        } 
		
		
		
		return null;
	}

	public List<AppointmentClass> getAppointmentsForDoctor(int doctorId) {

		try {
		    stat = con.prepareStatement("SELECT * FROM AppointmentClass WHERE doctorId=?");
		    stat.setInt(1, doctorId);
		    ResultSet rs = stat.executeQuery();

		    if (rs.next()) {
		        System.out.println("Appointment Details:");
		        System.out.println("AppointmentId: " + rs.getInt("appointmentId"));
		        System.out.println("PatientId: " + rs.getInt("patientId"));
		        System.out.println("DoctorId: " + rs.getInt("doctorId"));
		        System.out.println("Appointment Date: " + rs.getString("appointmentDate"));
		        System.out.println("Description: " + rs.getString("description"));
		        
		    }
		    else
		    {
		    	System.out.println("Doctor not found!");
		    	
		    }
		} catch (Exception e) {
			System.out.println(e.getMessage());
		    
        } 
		
		
		
		return null;
	}

	public boolean scheduleAppointment(AppointmentClass appointments) {
		try {
			stat = con.prepareStatement("INSERT INTO AppointmentClass VALUES (?, ?, ?, ?, ?)");
		        stat.setInt(1, AppointmentClass.getAppointmetId()); 
		        stat.setInt(2, appointments.getPatientId());
		        stat.setInt(3, appointments.getDoctorId());
		        stat.setString(4, appointments.getAppointmentDate());
		        stat.setString(5, appointments.getDescription());
		        stat.executeUpdate();
			    System.out.println("Appointment Scheduled");
		}
			catch (Exception e) {
				System.out.println(e.getMessage());
			    
	        } 
			
		
		return false;
	}

	public boolean updateAppointment(AppointmentClass appointments) {
		
		try {
			stat=con.prepareStatement("update AppointmentClass set appointmentDate=? where appointmentId=?");
			stat.setString(1, appointments.getAppointmentDate());
			stat.setInt(2, appointments.getAppointmetId());
			int rowsaffected =stat.executeUpdate();
			if(rowsaffected>0)
			{
				return true;
			}
			else
				return false;
			
		}
			catch (Exception e) {
				System.out.println(e.getMessage());
				return false;
			    
	        } 
			
			
		
		
	}

	public boolean cancelAppointment(int appointmentId) {
	
		
		    try {
		        stat = con.prepareStatement("delete from AppointmentClass where appointmentId=?");
		        stat.setInt(1, appointmentId);
		        int rowsaffected = stat.executeUpdate();
		        if(rowsaffected>0) {
		        	return true;
		        }
		        else
		        {
		        	return false;
		        }
		    } catch (Exception e) {
		        System.out.println(e.getMessage());
		        return false; 
		    }
		}

	



	
	}
		
	   
		
	
    
