package com.edu.neu.csye7374.finalProject.factories;

import com.edu.neu.csye7374.finalProject.models.Person;

public abstract class PersonFactory {
	public abstract Person getObject(String firstName, String lastName, String gender, String address, String mobile, int age, String email);

}
