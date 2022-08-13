package com.csye.finalProject.factories;

import com.csye.finalProject.models.Appointment;


public class AppointmentFactory {
	private static AppointmentFactory myInstance;
	private AppointmentFactory() {
		myInstance = null;
	}
	
	
	public static synchronized AppointmentFactory getInstance() {
		if(myInstance==null) {
			myInstance=new AppointmentFactory();
		}
		return myInstance;
	}


	public Appointment getObject(int doctorId, int patientId, String appointmentDate, String appointmentTime, String appointmentDescription) {
		
		return new Appointment.AppointmentBuilder(doctorId, patientId).appointmentDate(appointmentDate).
				appointmentTime(appointmentTime).appointmentDescription(appointmentDescription).build();
	}
}
