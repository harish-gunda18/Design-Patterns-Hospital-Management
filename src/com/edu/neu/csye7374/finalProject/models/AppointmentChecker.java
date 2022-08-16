package com.edu.neu.csye7374.finalProject.models;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

public class AppointmentChecker implements AppointmentCheckerAPI{

	public boolean checkAppointment(List<Appointment> appointments, LocalDateTime dateTime, int doctorId) {
		SimpleDateFormat parser = new SimpleDateFormat("HH:mm");
		
		Date ten = null;
		try {
			ten = parser.parse("10:00");
		} catch (ParseException e2) {
			e2.printStackTrace();
		}
		Date eighteen = null;
		try {
			eighteen = parser.parse("18:00");
		} catch (ParseException e1) {
			e1.printStackTrace();
		}

		try {
			String userTimeString = Integer.toString(dateTime.getHour())+":"+Integer.toString(dateTime.getMinute());
			System.out.println("user time string: "+userTimeString);
		    Date userDate = parser.parse(userTimeString);
		    if (userDate.before(ten) || userDate.after(eighteen)) {
		        return false;
		    }
		} catch (ParseException e) {
		    // Invalid date was entered
		}
		for (Appointment appointment:appointments) {
			if (doctorId==appointment.doctorId) {
				long minutes = Duration.between(appointment.appointmentDateTime, dateTime).toMinutes();
				if (minutes<60) {
					return false;
				}
			}
			
			
		}
		return true;
				
	}


	
	

}
