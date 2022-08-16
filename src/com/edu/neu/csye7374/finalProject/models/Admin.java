package com.edu.neu.csye7374.finalProject.models;


import com.edu.neu.csye7374.finalProject.factories.DoctorFactory;
import com.edu.neu.csye7374.finalProject.factories.PatientFactory;
import com.edu.neu.csye7374.finalProject.factories.PersonFactory;

import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;

public class Admin {
    String hospitalId;
    String adminName;
     String post;
     List<Patient> listOfPatients = new ArrayList<Patient>();
     List<Department> listOfDepartments = new ArrayList<Department>();



    public static void  demo(){
         PersonFactory patientFactory = PatientFactory.getInstance();
         PersonFactory doctorFactory = DoctorFactory.getInstance();
         Person patient1= patientFactory.getObject("John", "Doe", "M", "test Address", "1231221234", 25, "abc@gmail.com", "specialization");
         Person patient2= patientFactory.getObject("Jacob", "Doe", "M", "test2 Address", "12231234", 22, "abc@yahoo.com", "specialization");
         Person patient3= patientFactory.getObject("Joseph", "Doe", "M", "test3 Address", "7192396312", 23, "gta@yahoo .com", "specialization");
         Person patient4= patientFactory.getObject("Jackson", "Doe", "M", "test4 Address", "126342124", 24, "nvd@yahoo .com", "specialization");
         Person patient5= patientFactory.getObject("Jayden", "Doe", "M", "test5 Address", "524243413", 28, "asf@yahoo .com", "specialization");

         //TODO
        patient2.setPatientInsurance(new InsuranceBluecrossStrategy());
        patient1.setPatientInsurance(new InsuranceBluecrossStrategy());
        patient3.setPatientInsurance(new InsuranceBluecrossStrategy());
        patient4.setPatientInsurance(new InsuranceBluecrossStrategy());
        patient5.setPatientInsurance(new InsuranceBluecrossStrategy());

        Person doctor1 = doctorFactory.getObject("James", "Dick", "M", "test6 Address", "9382732812", 35, "ngl@gmail.com", "specialization");
        Person doctor2 = doctorFactory.getObject("Joey", "Dick", "M", "test7 Address", "4328310923", 32, "tbh@gmail.com", "specialization");
        Person doctor3 = doctorFactory.getObject("Jenson", "Dick", "F", "test8 Address", "123783211", 38, "lol@gmail.com", "specialization");

         


         List<Person> patients= new ArrayList<Person>();
         patients.add(patient1);
         patients.add(patient2);
         patients.add(patient3);
         patients.add(patient4);
         patients.add(patient5);

         List<Person> docters = new ArrayList<Person>();
         docters.add(doctor1);
         docters.add(doctor2);
         List<Person> docters2 = new ArrayList<Person>();
         docters2.add(doctor1);
         docters2.add(doctor3);

         List<Person> docters3 = new ArrayList<Person>();
         docters3.add(doctor3);

         Department CardioDept = new Department.DepartmentBuilder().setAdminId("001").setDepartmentName("Cardio").setDepartmentManager("Dr. Heart").setListOfDoctors(docters).build();
         Department PsychoDept = new Department.DepartmentBuilder().setAdminId("002").setDepartmentManager("Pyshco").setDepartmentName("Dr. Brain").setListOfDoctors(docters2).build();
         Department OrthoDept = new Department.DepartmentBuilder().setAdminId("003").setDepartmentManager("Ortho").setDepartmentName("Dr. Bones").setListOfDoctors(docters3).build();

         List<Department> departmentsList = new ArrayList<Department>();
         departmentsList.add(CardioDept);
         departmentsList.add(PsychoDept);
         departmentsList.add(OrthoDept);


		 System.out.println("---------------------------------------Flow 1-------------------------------------------------------------------------------");
         // ################################ 1st example ################################
         
         // appointment creation
         AppointmentCheckerAPI appointmentCheckerAPI = new AppointmentChecker();
		 AppointmentAPI appointmentAdapter = new AppointmentAdapter(appointmentCheckerAPI);
		 List<Appointment> appointments = new ArrayList<Appointment>();
		 Appointment appointment1 = appointmentAdapter.createAppoinment(doctor1.getDoctor_id(), patient1.getPatient_id(), LocalDateTime.of(2022, 8, 16, 11, 0), "pain in the chest", appointments);
		 appointments.add(appointment1);
		 
		 // Visit creation
		 Visit visit1 = new Visit.VisitBuilder()
                 .setDaignosis("ill")
                 .setDate(OffsetDateTime.now())
                 .setDoctorId(doctor1.getDoctor_id())
                 .setPatientId(patient1.getPatient_id())
                 .setReference("reference")
                 .build();
		 appointment1.setVisit(visit1);
		 visit1.waiting();
		 visit1.inProgress();
		 
		 // prescription
		 PrescriptionDecorator prescription1 = new Prescription.PrescriptionBuilder().setQuantity(1).build();
		 PrescriptionDecorator prescriptionDecorator = new ParacetemolDecorator(prescription1);
		 prescriptionDecorator.addMedicine();
		 visit1.setPrescription(prescription1);
		 
		 // Insurance strategy
		 InsuraceStrategyAPI insuraceStrategyAPI1 = new InsuranceBluecrossStrategy();
		 patient1.setPatientInsurance(insuraceStrategyAPI1);
		
         //Bill Generation Sample(Insurance Strategy Applied via patient)
         Bill bill1 = new Bill.BillBuilder().setDoctorCharge(300).setLabCharge(250).setPatient(patient1).setVisit(visit1).build();
		visit1.setBill(bill1);

		// visit complete
         visit1.completed();
		System.out.println("----------------------------------------------------------------------------------------------------------------------");

		System.out.println("-------------------------------Flow 2--------------------------------------------------------------------------------------");


		// ################################ 2nd example ################################
		// appointment creation
		 Appointment appointment2 = appointmentAdapter.createAppoinment(doctor2.getDoctor_id(), patient2.getPatient_id(), LocalDateTime.of(2022, 8, 16, 11, 30), "pain in the leg", appointments);
		 appointments.add(appointment2);
		 
		 // Visit creation
		 Visit visit2 = new Visit.VisitBuilder()
                 .setDaignosis("fracture in tibula")
                 .setDate(OffsetDateTime.now())
                 .setDoctorId(doctor2.getDoctor_id())
                 .setPatientId(patient2.getPatient_id())
                 .setReference("reference")
                 .build();
		 appointment2.setVisit(visit2);
		 visit2.inProgress();
		 
		// prescription
		 PrescriptionDecorator prescription2 = new Prescription.PrescriptionBuilder().setQuantity(2).build();
		 prescriptionDecorator = new IbuprofenDecorator(prescription2);
		 prescriptionDecorator.addMedicine();
		 visit2.setPrescription(prescription2);
		 
		 // Insurance strategy
		 InsuraceStrategyAPI insuraceStrategyAPI2 = new InsuranceAnthemStrategy();
		 patient2.setPatientInsurance(insuraceStrategyAPI2);
		
         //Bill Generation Sample(Insurance Strategy Applied via patient)
         Bill bill2 = new Bill.BillBuilder().setDoctorCharge(400).setLabCharge(350).setPatient(patient2).setVisit(visit2).build();
		visit2.setBill(bill2);

		// visit complete
		visit2.completed();
		System.out.println("----------------------------------------------------------------------------------------------------------------------");

		System.out.println("----------------------------------- Flow 3----------------------------------------------------------------------------------");
		// ################################ 3rd example ################################
			// appointment creation
			 Appointment appointment3 = appointmentAdapter.createAppoinment(doctor3.getDoctor_id(), patient3.getPatient_id(), LocalDateTime.of(2022, 8, 16, 12, 30), "pain in the stomach", appointments);
			 appointments.add(appointment3);
			 
			 // Visit creation
			 Visit visit3 = new Visit.VisitBuilder()
	                 .setDaignosis("gall bladder leak")
	                 .setDate(OffsetDateTime.now())
	                 .setDoctorId(doctor3.getDoctor_id())
	                 .setPatientId(patient3.getPatient_id())
	                 .setReference("reference")
	                 .build();
			 appointment3.setVisit(visit3);
			 visit3.waiting();
			 visit3.inProgress();

			// prescription
			 PrescriptionDecorator prescription3 = new Prescription.PrescriptionBuilder().setQuantity(3).build();
			 prescriptionDecorator = new HydrocodoneDecorator(prescription3);
			 prescriptionDecorator.addMedicine();
			 visit3.setPrescription(prescription3);
			 
			 // Insurance strategy
			 InsuraceStrategyAPI insuraceStrategyAPI3 = new InsuranceUnitedHealthStrategy();
			 patient3.setPatientInsurance(insuraceStrategyAPI3);
			
	         //Bill Generation Sample(Insurance Strategy Applied via patient)
	         Bill bill3 = new Bill.BillBuilder().setDoctorCharge(500).setLabCharge(450).setPatient(patient3).setVisit(visit3).build();
			visit3.setBill(bill3);

	         // visit complete
	         visit3.completed();
		System.out.println("----------------------------------------------------------------------------------------------------------------------");

	}




}
