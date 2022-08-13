package com.csye.finalProject.models;


public class Appointment {
	int patientId;
	int doctorId;
	String appointmentDate;
	String appointmentTime;
	String appointmentDescription;
	
	private Appointment(AppointmentBuilder builder) {
		this.patientId = builder.patientId;
		this.doctorId = builder.doctorId;
		this.appointmentDate = builder.appointmentDate;
		this.appointmentTime = builder.appointmentTime;
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
	public String getAppointmentDate() {
		return appointmentDate;
	}
	public void setAppointmentDate(String appointmentDate) {
		this.appointmentDate = appointmentDate;
	}
	public String getAppointmentTime() {
		return appointmentTime;
	}
	public void setAppointmentTime(String appointmentTime) {
		this.appointmentTime = appointmentTime;
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
		String appointmentDate;
		String appointmentTime;
		String appointmentDescription;
		
		public AppointmentBuilder(int patientId, int doctorId) {
			this.patientId = patientId;
			this.doctorId = doctorId;
		}
		
		public AppointmentBuilder appointmentDate(String appointmentDate) {
			this.appointmentDate = appointmentDate;
			return this;
		}
		
		public AppointmentBuilder appointmentTime(String appointmentTime) {
			this.appointmentTime = appointmentTime;
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
