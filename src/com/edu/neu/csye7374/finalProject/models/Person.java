package com.edu.neu.csye7374.finalProject.models;

public abstract class Person {
	protected String firstName;
	protected String lastName;
	protected String gender;
	protected String address;
	protected String mobile;
	protected int age;
	protected String email;
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public abstract String getSpecialization();

	public abstract void setSpecialization(String specialization);

	public abstract int getDoctor_id();

	public abstract void setDoctor_id(int doctor_id);
	
	public abstract int getPatient_id();

	public abstract void setPatient_id(int patient_id);
	
	public abstract InsuraceStrategyAPI getPatientInsurance();
	public abstract void setPatientInsurance(InsuraceStrategyAPI insuraceStrategyAPI);
	
	
	

}
