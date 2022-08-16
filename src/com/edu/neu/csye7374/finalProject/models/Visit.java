package com.edu.neu.csye7374.finalProject.models;

import java.time.OffsetDateTime;

public class Visit implements VisitStateAPI {
	private static int idTracker = 0;
	
	int visitId;
	int patientId;
	int doctorId;
	OffsetDateTime date;
	String diagnosis;
	String reference;

	public VisitStateAPI getCheckedIn() {
		return checkedIn;
	}

	public void setCheckedIn(VisitStateAPI checkedIn) {
		this.checkedIn = checkedIn;
	}

	public VisitStateAPI getWaiting() {
		return waiting;
	}

	public void setWaiting(VisitStateAPI waiting) {
		this.waiting = waiting;
	}

	public VisitStateAPI getInProgress() {
		return inProgress;
	}

	public void setInProgress(VisitStateAPI inProgress) {
		this.inProgress = inProgress;
	}

	public VisitStateAPI getCompleted() {
		return completed;
	}

	public void setCompleted(VisitStateAPI completed) {
		this.completed = completed;
	}

	public VisitStateAPI getState() {
		return state;
	}

	public void setState(VisitStateAPI state) {
		this.state = state;
	}

	private VisitStateAPI checkedIn;
	private VisitStateAPI waiting;
	private VisitStateAPI inProgress;
	private VisitStateAPI completed;
	private VisitStateAPI state;

	
	public Visit(VisitBuilder visitBuilder) {
		this.visitId = visitBuilder.visitId;
		this.patientId = visitBuilder.patientId;
		this.doctorId = visitBuilder.doctorId;
		this.date = visitBuilder.date;
		this.diagnosis = visitBuilder.diagnosis;
		this.reference = visitBuilder.reference;
		this.checkedIn = new CheckedInState(this);
		this.waiting = new WaitingState(this);
		this.inProgress = new InProgressState(this);
		this.completed = new CompletedState(this);
		this.state = new CheckedInState(this);

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

	@Override
	public void checkedIn() {
		this.state.checkedIn();
	}

	@Override
	public void waiting() {
		this.state.waiting();
	}

	@Override
	public void inProgress() {
		this.state.inProgress();
	}

	@Override
	public void completed() {
		this.state.completed();
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
