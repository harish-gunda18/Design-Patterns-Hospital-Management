package com.edu.neu.csye7374.finalProject.models;
public class Patient extends Person {
	int patient_id;
	static int id = 0;
	private InsuraceStrategyAPI patientInsurance;

	public InsuraceStrategyAPI getPatientInsurance() {
		return patientInsurance;
	}

	public void setPatientInsurance(InsuraceStrategyAPI insuraceStrategyAPI) {
		this.patientInsurance = insuraceStrategyAPI;
	}

	public int getPatient_id() {
		return patient_id;
	}

	public void setPatient_id(int patient_id) {
		this.patient_id = patient_id;
	}
	
	private Patient(PatientBuilder builder) {
		this.firstName = builder.firstName;
		this.lastName = builder.lastName;
		this.age = builder.age;
		this.mobile = builder.mobile;
		this.address = builder.address;
		this.gender = builder.gender;
		this.address = builder.address;
		this.patient_id = builder.patient_id;
		this.email = builder.email;
		this.patient_id = Patient.id;
		Patient.id = Patient.id+1;
	}
	
	public static class PatientBuilder {
		private String firstName;
		private String lastName;
		private String gender;
		private String address;
		private String mobile;
		private int age;
		private String email;
		int patient_id;
		
		public PatientBuilder(String firstName, String lastName) {
			this.firstName = firstName;
			this.lastName = lastName;
		}
		
		public PatientBuilder mobile(String mobile) {
			this.mobile = mobile;
			return this;
		}
		
		public PatientBuilder address(String address) {
			this.address = address;
			return this;
		}
		
		public PatientBuilder email(String email) {
			this.email = email;
			return this;
		}
		
		
		public PatientBuilder age(int age) {
			this.age = age;
			return this;
		}
		
		public PatientBuilder gender(int patient_id) {
			this.patient_id = patient_id;
			return this;
		}
		
		public PatientBuilder gender(String gender) {
			this.gender = gender;
			return this;
		}
		
		public Patient build() {
			Patient patient =  new Patient(this);
			return patient;
		}
	}

	public String getSpecialization() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setSpecialization(String specialization) {
		// TODO Auto-generated method stub
		
	}

	public int getDoctor_id() {
		// TODO Auto-generated method stub
		return 0;
	}

	public void setDoctor_id(int doctor_id) {
		// TODO Auto-generated method stub
		
	}
}
