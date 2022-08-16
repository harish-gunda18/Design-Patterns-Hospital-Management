package com.edu.neu.csye7374.finalProject.models;

import java.time.LocalDateTime;
import java.util.List;

import com.edu.neu.csye7374.finalProject.factories.AppointmentFactory;
import com.edu.neu.csye7374.finalProject.models.Appointment;
import com.edu.neu.csye7374.finalProject.models.AppointmentAPI;
import com.edu.neu.csye7374.finalProject.models.AppointmentCheckerAPI;

public class AppointmentAdapter implements AppointmentAPI{
	AppointmentCheckerAPI appointmentCheckerAPI;
	public AppointmentAdapter(AppointmentCheckerAPI appointmentCheckerAPI) {
		this.appointmentCheckerAPI = appointmentCheckerAPI;
	}
	
//	@Override
	public Appointment createAppoinment(int doctorId, int patientId, LocalDateTime appointmentDateTime, String appointmentDescription, List<Appointment> appointments) {
		
		if(appointmentCheckerAPI.checkAppointment(appointments, appointmentDateTime, doctorId)) {
			return AppointmentFactory.getInstance().getObject(doctorId, patientId, appointmentDateTime, appointmentDescription);
		}
		return null;
	}
}
