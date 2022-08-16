package com.edu.neu.csye7374.finalProject.models;

public class Prescription {

	int id;
	public int getId() {
		return id;
	}
	public int getMedicineId() {
		return medicineId;
	}
	public int getVisitId() {
		return visitId;
	}
	public String getTimeFrame() {
		return timeFrame;
	}
	public String getQuantity() {
		return quantity;
	}
	public String getDosage() {
		return dosage;
	}
	
	public Prescription(PrescriptionBuilder prescriptionBuilder) {
		this.id = prescriptionBuilder.id;
		this.medicineId = prescriptionBuilder.medicineId;
		this.visitId = prescriptionBuilder.visitId;
		this.timeFrame = prescriptionBuilder.timeFrame;
		this.quantity = prescriptionBuilder.quantity;
		this.dosage = prescriptionBuilder.dosage;
	}

	int medicineId;
	int visitId;
	String timeFrame;
	String quantity;
	String dosage;
	
	public static class PrescriptionBuilder{
		int id;
		int medicineId;
		int visitId;
		String timeFrame;
		String quantity;
		String dosage;

		public Prescription build() {
			return new Prescription(this);
		}
		
		public PrescriptionBuilder setId(int id) {
			this.id = id;
			return this;
		}
		public PrescriptionBuilder setMedicineId(int medicineId) {
			this.medicineId = medicineId;
			return this;

		}
		public PrescriptionBuilder setVisitId(int visitId) {
			this.visitId = visitId;
			return this;

		}
	
		public PrescriptionBuilder setTimeFrame(String timeFrame) {
			this.timeFrame = timeFrame;
			return this;

		}
		public PrescriptionBuilder setQuantity(String quantity) {
			this.quantity = quantity;
			return this;

		}
		public PrescriptionBuilder setDosage(String dosage) {
			this.dosage = dosage;
			return this;
		}

	}
	
	
}
