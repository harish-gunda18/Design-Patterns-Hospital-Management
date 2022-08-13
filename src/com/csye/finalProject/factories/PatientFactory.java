package com.csye.finalProject.factories;


import com.csye.finalProject.models.Patient;
import com.csye.finalProject.models.Person;

public class PatientFactory extends PersonFactory{
	private static PatientFactory myInstance;
	private PatientFactory() {
		myInstance = null;
	}
	
	
	public static synchronized PatientFactory getInstance() {
		if(myInstance==null) {
			myInstance=new PatientFactory();
		}
		return myInstance;
	}


	public Person getObject(String firstName, String lastName, String gender, String address, String mobile, int age,
			String email) {
		
		return new Patient.PatientBuilder(firstName, lastName).gender(gender).address(address).mobile(mobile).age(age).build();
	}

	

}
