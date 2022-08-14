package com.edu.neu.csye7374.finalProject.models;
import java.time.LocalDateTime;

public class Appointment {
	int patientId;
	int doctorId;
	LocalDateTime appointmentDateTime;
	String appointmentDescription;
	
	private Appointment(AppointmentBuilder builder) {
		this.patientId = builder.patientId;
		this.doctorId = builder.doctorId;
		this.appointmentDateTime = builder.appointmentDateTime;
		this.appointmentDescription = builder.appointmentDescription;
	}
	
	public int getPatientId() {
		return patientId;
	}
	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}
	public int getDoctorId() {
		return doctorId;
	}
	public void setDoctorId(int doctorId) {
		this.doctorId = doctorId;
	}
	
	public LocalDateTime getAppointmentDateTime() {
		return appointmentDateTime;
	}

	public void setAppointmentDateTime(LocalDateTime appointmentDateTime) {
		this.appointmentDateTime = appointmentDateTime;
	}

	
	public String getAppointmentDescription() {
		return appointmentDescription;
	}
	public void setAppointmentDescription(String appointmentDescription) {
		this.appointmentDescription = appointmentDescription;
	}
	
	public static class AppointmentBuilder {
		int patientId;
		int doctorId;
		LocalDateTime appointmentDateTime;
		String appointmentDescription;
		
		
		public AppointmentBuilder(int patientId, int doctorId) {
			this.patientId = patientId;
			this.doctorId = doctorId;
		}
		
		public AppointmentBuilder appointmentDateTime(LocalDateTime appointmentDateTime) {
			this.appointmentDateTime = appointmentDateTime;
			return this;
		}
		
		
		public AppointmentBuilder appointmentDescription(String appointmentDescription) {
			this.appointmentDescription = appointmentDescription;
			return this;
		}
		
		
		
		public Appointment build() {
			Appointment appointment =  new Appointment(this);
			return appointment;
		}
	}

}
