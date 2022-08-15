package com.edu.neu.csye7374.finalProject.models;

//import com.edu.neu.csye7374.finalProject.factories.AppointmentFactory;
import com.edu.neu.csye7374.finalProject.factories.DoctorFactory;
import com.edu.neu.csye7374.finalProject.factories.PersonFactory;

public class Demo {
	public static void main(String[] args) {
		PersonFactory docFactory = DoctorFactory.getInstance();
		Person doctor1 = docFactory.getObject("Harish", "Gunda", "male", "address", "8578691532", 26, "gunda.sa@northeastern.edu");
		System.out.println(doctor1.getFirstName());
	}

}
