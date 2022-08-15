package com.edu.neu.csye7374.finalProject.factories;

import com.edu.neu.csye7374.finalProject.models.Doctor;
import com.edu.neu.csye7374.finalProject.models.Person;

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
			String email,String specialization) {
		
		return new Doctor.DoctorBuilder(firstName, lastName).gender(gender).address(address).mobile(mobile).age(age).specialization(specialization).build();
	}

	

}
