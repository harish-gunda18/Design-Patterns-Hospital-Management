package com.edu.neu.csye7374.finalProject.models;

public class Doctor extends Person{
	String specialization;
	int doctor_id;
	static int id = 0;
	
	private Doctor(DoctorBuilder builder) {
		this.firstName = builder.firstName;
		this.lastName = builder.lastName;
		this.age = builder.age;
		this.mobile = builder.mobile;
		this.address = builder.address;
		this.gender = builder.gender;
		this.address = builder.address;
		this.doctor_id = builder.doctor_id;
		this.email = builder.email;
		this.doctor_id = Doctor.id;
		Doctor.id = Doctor.id+1;
	}

	public String getSpecialization() {
		return specialization;
	}

	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}

	public int getDoctor_id() {
		return doctor_id;
	}

	public void setDoctor_id(int doctor_id) {
		this.doctor_id = doctor_id;
	}
	
	
	
	public static class DoctorBuilder {
		private String firstName;
		private String lastName;
		private String gender;
		private String address;
		private String mobile;
		private int age;
		private String email;
		String specialization;
		int doctor_id;
		
		public DoctorBuilder(String firstName, String lastName) {
			this.firstName = firstName;
			this.lastName = lastName;
		}
		
		public DoctorBuilder mobile(String mobile) {
			this.mobile = mobile;
			return this;
		}
		
		public DoctorBuilder address(String address) {
			this.address = address;
			return this;
		}
		
		public DoctorBuilder email(String email) {
			this.email = email;
			return this;
		}
		
		public DoctorBuilder specialization(String specialization) {
			this.specialization = specialization;
			return this;
		}
		
		public DoctorBuilder age(int age) {
			this.age = age;
			return this;
		}
		
		public DoctorBuilder doctor_id(int doctor_id) {
			this.doctor_id = doctor_id;
			return this;
		}
		
		public DoctorBuilder gender(String gender) {
			this.gender = gender;
			return this;
		}
		
		public Doctor build() {
			Doctor doctor =  new Doctor(this);
			return doctor;
		}
	}



	public int getPatient_id() {
		// TODO Auto-generated method stub
		return 0;
	}

	public void setPatient_id(int patient_id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public InsuraceStrategyAPI getPatientInsurance() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setPatientInsurance(InsuraceStrategyAPI insuraceStrategyAPI) {
		// TODO Auto-generated method stub
		
	}

	
}
