package com.edu.neu.csye7374.finalProject.models;
//import com.edu.neu.csye7374.finalProject.models.Appointment;
import java.time.LocalDateTime;
import java.util.List;

public interface AppointmentCheckerAPI {
	public boolean checkAppointment(List<Appointment> appointments, LocalDateTime dateTime, int doctorId);
}
