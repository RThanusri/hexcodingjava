package Com.java.Client;

import java.util.Scanner;

import Com.java.Exception.PatientNumberNotFoundException;
import Com.java.demo.Service.HospitalServicelayer;

public class Main {

	public static void main(String[] args) throws PatientNumberNotFoundException{
		HospitalServicelayer hsl=new HospitalServicelayer();
		Scanner sc=new Scanner (System.in);
		while(true) {
		System.out.println("1..Getappointment details using appointmentid");
		System.out.println("2..Getappointment details using patient id");
		System.out.println("3..Getappointment details using doctorid");
		System.out.println("4..Schedule new Appointment");
		System.out.println("5.Update Appointment");
		System.out.println("6..Cancel Appointment");
		System.out.println("7.Exiting");
		System.out.println("Enter your Choice");
		int ch=sc.nextInt();
		switch(ch)
		{
		case 1:
			 hsl.getappointment();
			 break;
		case 2:
			
				hsl.getAppointmentsForPatient();
			    break;
		case 3:
			hsl.getAppointmentsForDoctor();
			break;
			
		case 4:
			hsl.scheduleappointment();
			break;
		case 5:
			hsl.updateappointment();
			break;
		case 6:
			hsl.cancelAppointment();
			break;
		case 7:
			System.exit(0);
			break;
		default:
			System.out.println("Invalid choice");
			
		}
		
		
	
	
		}

	}

}
