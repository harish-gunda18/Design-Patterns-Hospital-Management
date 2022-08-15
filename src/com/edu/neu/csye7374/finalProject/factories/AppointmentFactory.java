package com.edu.neu.csye7374.finalProject.factories;

import java.time.LocalDateTime;

import com.edu.neu.csye7374.finalProject.models.Appointment;

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


	public Appointment getObject(int doctorId, int patientId, LocalDateTime appointmentDateTime, String appointmentDescription) {
		
		return new Appointment.AppointmentBuilder(doctorId, patientId).appointmentDateTime(appointmentDateTime)
				.appointmentDescription(appointmentDescription).build();
	}
}
