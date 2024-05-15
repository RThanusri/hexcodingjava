package Com.java.demo.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Com.java.Model.AppointmentClass;
import Com.java.demo.Dao.HospitalService;
import Com.java.demo.Dao.HospitalServiceImpl;



public class HospitalServicelayer {
	
	Scanner sc;
	 HospitalServiceImpl hs;
	 List<AppointmentClass> apc = new ArrayList<AppointmentClass>();
	
	public HospitalServicelayer()
	{
		sc= new Scanner(System.in);
		hs= new HospitalServiceImpl();
	}
	public void getappointment() {
		AppointmentClass ap= new 	AppointmentClass();
		System.out.println("Enter AppointmentId");
		int aid=sc.nextInt();
		hs.getAppointmentById(aid);
		
		
	
	}
		public List<AppointmentClass> getAppointmentsForPatient() {
		    List<AppointmentClass> ps = new ArrayList<AppointmentClass>();
		    
		    	
		       System.out.println("enter patient id");
		       int patientId=sc.nextInt();
		       ps=hs.getAppointmentsForPatiet(patientId);
		    
		    return ps;
		}
		    
		    public List<AppointmentClass> getAppointmentsForDoctor() {
			    List<AppointmentClass> ds = new ArrayList<AppointmentClass>();
			    
			    	
			       System.out.println("Enter Doctor Id");
			       int doctorId=sc.nextInt();
			       ds=hs.getAppointmentsForDoctor(doctorId);
			    
			    return ds;
		    }
			    public void scheduleappointment()
			    {
			    	AppointmentClass app=new AppointmentClass();
			    	System.out.println("Enter Patient Id");
			    	int pid=sc.nextInt();
			    	app.setPatientId(pid);
			    	System.out.println("Enter Doctor Id");
			    	int did=sc.nextInt();
			    	sc.nextLine();
			    	app.setDoctorId(did);
			    	System.out.println("Enter Appointment Date");
			    	String appdate=sc.nextLine();
			    	app.setAppointmentDate(appdate);
			    	System.out.println("Enter Appointment Description");
			    	String desc=sc.nextLine();
			    	app.setDescription(desc);
			    	hs.scheduleAppointment(app);
			    	
			    }
			    public void updateappointment()
			    {
			    	AppointmentClass app=new AppointmentClass();
			    	System.out.println("Enter appointment Id");
			    	int aid=sc.nextInt();
			    	app.setAppointmetId(aid);
			    	sc.nextLine();
			    
			    	System.out.println("Enter Appointment Date");
			    	String appdate=sc.nextLine();
			    	app.setAppointmentDate(appdate);
			    	 
			        boolean success = hs.updateAppointment(app);
			          
			        if (success) {
			            System.out.println("Appointment updated successfully!");
			        } else {
			            System.out.println("Failed to update appointment. Appointment not found!");
			        }
			         }
			        
			    	
			    	
			    	
			   
			    public void cancelAppointment() {
			        System.out.println("Enter appointment Id");
			        int aid = sc.nextInt();
			        boolean success = hs.cancelAppointment(aid);
			        if (success) {
			            System.out.println("Appointment canceled successfully!");
			        } else {
			            System.out.println("Failed to cancel appointment. Appointment not found or an error occurred!");
			        }
			    }
	
	}
			
