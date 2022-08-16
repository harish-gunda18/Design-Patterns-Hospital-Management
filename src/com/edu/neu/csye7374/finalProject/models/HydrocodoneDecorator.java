package com.edu.neu.csye7374.finalProject.models;

public class HydrocodoneDecorator implements PrescriptionDecorator{
	Prescription prescription;
	
	
	public HydrocodoneDecorator(PrescriptionDecorator prescription) {
		this.prescription = (Prescription) prescription;
	}
	@Override
	public void addMedicine() {
		prescription.getMedicines().add(new Medicine.MedicineBuilder().setName("Hydrocodone").setPrice(300).setDescription("normal Hydrocodone").build());
	}
	

}
