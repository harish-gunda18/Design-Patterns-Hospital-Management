package com.csye.finalProject.factories;

import com.csye.finalProject.models.Person;

public abstract class PersonFactory {
	public abstract Person getObject(String firstName, String lastName, String gender, String address, String mobile, int age, String email);

}
