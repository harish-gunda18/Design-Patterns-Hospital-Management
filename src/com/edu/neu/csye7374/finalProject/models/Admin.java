package com.edu.neu.csye7374.finalProject.models;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import com.edu.neu.csye7374.finalProject.factories.DoctorFactory;
import com.edu.neu.csye7374.finalProject.factories.PatientFactory;
import com.edu.neu.csye7374.finalProject.factories.PersonFactory;
import com.edu.neu.csye7374.finalProject.models.AppointmentAPI;
import com.edu.neu.csye7374.finalProject.models.AppointmentAdapter;
import com.edu.neu.csye7374.finalProject.models.AppointmentCheckerAPI;

public class Admin {
    private String hospitalId;
    private String post;
    private List<Patient> listOfPatients = new ArrayList<Patient>();
    
    
    public static void demo() {
    	AppointmentCheckerAPI appointmentCheckerAPI = new AppointmentChecker();
    	AppointmentAPI appointmentAdapter = new AppointmentAdapter(appointmentCheckerAPI);
    	PersonFactory docFactory = DoctorFactory.getInstance();
    	PersonFactory paFactory = PatientFactory.getInstance();
    	final List<Appointment> appointments = new ArrayList<Appointment>();
    	Person doc1 =  docFactory.getObject("Harish", "Gunda", "male", "address1", "8578691532", 26, "email", "orthopedist");
    	Person pat1 = paFactory.getObject("Anup", "Chiliveru", "male", "address1", "8578691533", 24, "email", null);
    	appointments.add(appointmentAdapter.createAppoinment(0, 0, LocalDateTime.now(), "pain in the chest", appointments));
    	System.out.println(appointments.get(0).getDoctorId());
    }

}
