package com.edu.neu.csye7374.finalProject.models;

public class Medicine {
	
	public String getName() {
		return name;
	}

	public String getType() {
		return type;
	}

	public String getDescription() {
		return description;
	}

	public double getPrice() {
		return price;
	}


	String name;
	String type;
	String description;
	double price;

	public Medicine(MedicineBuilder medicineBuilder) {
		super();
		this.name = medicineBuilder.name;
		this.type =  medicineBuilder.type;
		this.description =  medicineBuilder.description;
		this.price =  medicineBuilder.price;
	}
	
	public static class MedicineBuilder{
		String name;
		String type;
		String description;
		double price;
		
		public MedicineBuilder setName(String name) {
			this.name = name;
			return this;
		}

		public MedicineBuilder setType(String type) {
			this.type = type;
			return this;
		}

		public MedicineBuilder setDescription(String description) {
			this.description = description;
			return this;
		}

		public MedicineBuilder setPrice(double price) {
			this.price = price;
			return this;
		}
		
		public Medicine build() {
			return new Medicine(this);
		}
	}
	
}
