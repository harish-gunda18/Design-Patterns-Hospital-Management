package com.edu.neu.csye7374.finalProject.models;

import java.util.ArrayList;
import java.util.List;

public class Prescription implements PrescriptionDecorator{

	int id;
	public int getId() {
		return id;
	}
	
	public List<Medicine> getMedicines() {
		return medicines;
	}
	
	
	
	public void setMedicines(List<Medicine> medicines) {
		this.medicines = medicines;
	}
	
	public double totalMedicineCharge() {
		double total = 0;
		for(Medicine medicine:medicines) {
			total+=medicine.getPrice();
		}
		return total*quantity;
	}

	public int getVisitId() {
		return visitId;
	}
	public String getTimeFrame() {
		return timeFrame;
	}
	public int getQuantity() {
		return quantity;
	}
	public String getDosage() {
		return dosage;
	}
	
	public Prescription(PrescriptionBuilder prescriptionBuilder) {
		this.id = prescriptionBuilder.id;
		this.visitId = prescriptionBuilder.visitId;
		this.timeFrame = prescriptionBuilder.timeFrame;
		this.quantity = prescriptionBuilder.quantity;
		this.dosage = prescriptionBuilder.dosage;
	}

	List<Medicine> medicines= new ArrayList<>();
	int visitId;
	String timeFrame;
	int quantity;
	String dosage;
	
	public static class PrescriptionBuilder{
		int id;
		int medicineId;
		int visitId;
		String timeFrame;
		int quantity;
		String dosage;

		public Prescription build() {
			return new Prescription(this);
		}
		
		public PrescriptionBuilder setId(int id) {
			this.id = id;
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
		public PrescriptionBuilder setQuantity(int quantity) {
			this.quantity = quantity;
			return this;

		}
		public PrescriptionBuilder setDosage(String dosage) {
			this.dosage = dosage;
			return this;
		}
		
		

	}

	@Override
	public void addMedicine() {
		
	}
	
	
}
