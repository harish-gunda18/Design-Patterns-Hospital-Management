package com.edu.neu.csye7374.finalProject.models;

import java.time.OffsetDateTime;

public class Visit {
	private static int idTracker = 0;
	
	int visitId;
	int patientId;
	int doctorId;
	OffsetDateTime date;
	String diagnosis;
	String reference;
	
	public Visit(VisitBuilder visitBuilder) {
		this.visitId = visitBuilder.visitId;
		this.patientId = visitBuilder.patientId;
		this.doctorId = visitBuilder.doctorId;
		this.date = visitBuilder.date;
		this.diagnosis = visitBuilder.diagnosis;
		this.reference = visitBuilder.reference;
	}
	
	public int getVisitId() {
		return visitId;
	}
	
	public int getPatientId() {
		return patientId;
	}

	public int getDoctorId() {
		return doctorId;
	}

	public OffsetDateTime getDate() {
		return date;
	}
	
	public String getDiagnosis() {
		return diagnosis;
	}

	public String getReference() {
		return reference;
	}

	
	public static class VisitBuilder{
		int patientId;
		int doctorId;
		int visitId;
		OffsetDateTime date;
		String diagnosis;
		String reference;
		

		public VisitBuilder setPatientId(int patientId) {
			this.patientId = patientId;
			return this;
		}
		
		public VisitBuilder setDoctorId(int doctorId) {
			this.doctorId = doctorId;
			return this;

		}

		public VisitBuilder setDate(OffsetDateTime date) {
			this.date = date;
			return this;

		}
		
		public VisitBuilder setDaignosis(String diagnosis) {
			this.diagnosis = diagnosis;
			return this;

		}
		
		public VisitBuilder setReference(String reference) {
			this.reference = reference;
			return this;
		}
		
		public Visit build() {
			idTracker++;
			this.visitId = idTracker;
			return new Visit(this);
		}
	}

}
