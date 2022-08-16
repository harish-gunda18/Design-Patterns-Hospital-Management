package com.edu.neu.csye7374.finalProject.models;

public class ParacetemolDecorator implements PrescriptionDecorator{
	Prescription prescription;
	
	
	public ParacetemolDecorator(PrescriptionDecorator prescription1) {
		this.prescription = (Prescription) prescription1;
	}
	@Override
	public void addMedicine() {
		prescription.getMedicines().add(new Medicine.MedicineBuilder().setName("Paracetemol").setPrice(100).setDescription("normal paracetemol").build());
	}
	

}
