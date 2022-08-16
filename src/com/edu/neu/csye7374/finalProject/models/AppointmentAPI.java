package com.edu.neu.csye7374.finalProject.models;

import java.time.LocalDateTime;
import java.util.List;

import com.edu.neu.csye7374.finalProject.models.Appointment;

public interface AppointmentAPI {
	public Appointment createAppoinment(int doctorId, int patientId, LocalDateTime appointmentDateTime, String appointmentDescription, List<Appointment> appointments);
}
