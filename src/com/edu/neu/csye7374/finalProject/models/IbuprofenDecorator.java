package com.edu.neu.csye7374.finalProject.models;

public class IbuprofenDecorator implements PrescriptionDecorator{
	Prescription prescription;
	
	
	public IbuprofenDecorator(PrescriptionDecorator prescription) {
		this.prescription = (Prescription) prescription;
	}
	@Override
	public void addMedicine() {
		prescription.getMedicines().add(new Medicine.MedicineBuilder().setName("Ibuprofen").setPrice(200).setDescription("normal ibuprofen").build());
	}
	

}
