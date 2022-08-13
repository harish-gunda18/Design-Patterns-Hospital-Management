package com.csye.finalProject.factories;


import com.csye.finalProject.models.Doctor;
import com.csye.finalProject.models.Person;

public class DoctorFactory extends PersonFactory{
	private static DoctorFactory myInstance;
	private DoctorFactory() {
		myInstance = null;
	}
	
	
	public static synchronized DoctorFactory getInstance() {
		if(myInstance==null) {
			myInstance=new DoctorFactory();
		}
		return myInstance;
	}


	public Person getObject(String firstName, String lastName, String gender, String address, String mobile, int age,
			String email) {
		
		return new Doctor.DoctorBuilder(firstName, lastName).gender(gender).address(address).mobile(mobile).age(age).build();
	}

	

}
