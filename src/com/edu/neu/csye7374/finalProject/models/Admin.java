package com.edu.neu.csye7374.finalProject.models;


import com.edu.neu.csye7374.finalProject.factories.DoctorFactory;
import com.edu.neu.csye7374.finalProject.factories.PatientFactory;
import com.edu.neu.csye7374.finalProject.factories.PersonFactory;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;

public class Admin {
    String hospitalId;
    String adminName;
     String post;
     List<Patient> listOfPatients = new ArrayList<Patient>();
     List<Department> listOfDepartments = new ArrayList<Department>();



    public static void demo(){
         PersonFactory patientFactory = PatientFactory.getInstance();
         PersonFactory doctorFactory = DoctorFactory.getInstance();
         Patient patient1= (Patient)patientFactory.getObject("John", "Doe", "M", "test Address", "1231221234", 25, "abc@gmail.com", "specialization");
         Patient patient2= (Patient)patientFactory.getObject("Jacob", "Doe", "M", "test2 Address", "12231234", 22, "abc@yahoo.com", "specialization");
         Patient patient3= (Patient)patientFactory.getObject("Joseph", "Doe", "M", "test3 Address", "7192396312", 23, "gta@yahoo .com", "specialization");
         Patient patient4= (Patient)patientFactory.getObject("Jackson", "Doe", "M", "test4 Address", "126342124", 24, "nvd@yahoo .com", "specialization");
         Patient patient5= (Patient)patientFactory.getObject("Jayden", "Doe", "M", "test5 Address", "524243413", 28, "asf@yahoo .com", "specialization");

         //TODO
        patient2.setPatientInsurance(new InsuranceBluecrossStrategy());
        patient1.setPatientInsurance(new InsuranceBluecrossStrategy());
        patient3.setPatientInsurance(new InsuranceBluecrossStrategy());
        patient4.setPatientInsurance(new InsuranceBluecrossStrategy());
        patient5.setPatientInsurance(new InsuranceBluecrossStrategy());

         Doctor doctor1 = (Doctor) doctorFactory.getObject("James", "Dick", "M", "test6 Address", "9382732812", 35, "ngl@gmail.com", "specialization");
         Doctor doctor2 = (Doctor) doctorFactory.getObject("Joey", "Dick", "M", "test7 Address", "4328310923", 32, "tbh@gmail.com", "specialization");
         Doctor doctor3 = (Doctor) doctorFactory.getObject("Jenson", "Dick", "F", "test8 Address", "123783211", 38, "lol@gmail.com", "specialization");

         Visit visit = new Visit.VisitBuilder()
                 .setDaignosis("ill")
                 .setDate(OffsetDateTime.now())
                 .setDoctorId(doctor1.getDoctor_id())
                 .setPatientId(patient1.getPatient_id())
                 .setReference("reference")
                 .build();


         List<Patient> patients= new ArrayList<Patient>();
         patients.add(patient1);
         patients.add(patient2);
         patients.add(patient3);
         patients.add(patient4);
         patients.add(patient5);

         List<Doctor> docters = new ArrayList<Doctor>();
         docters.add(doctor1);
         docters.add(doctor2);
         List<Doctor> docters2 = new ArrayList<Doctor>();
         docters2.add(doctor1);
         docters2.add(doctor3);

         List<Doctor> docters3 = new ArrayList<Doctor>();
         docters3.add(doctor3);

         Department CardioDept = new Department.DepartmentBuilder().setAdminId("001").setDepartmentName("Cardio").setDepartmentManager("Dr. Heart").setListOfDoctors(docters).build();
         Department PsychoDept = new Department.DepartmentBuilder().setAdminId("002").setDepartmentManager("Pyshco").setDepartmentName("Dr. Brain").setListOfDoctors(docters2).build();
         Department OrthoDept = new Department.DepartmentBuilder().setAdminId("003").setDepartmentManager("Ortho").setDepartmentName("Dr. Bones").setListOfDoctors(docters3).build();

         List<Department> departmentsList = new ArrayList<Department>();
         departmentsList.add(CardioDept);
         departmentsList.add(PsychoDept);
         departmentsList.add(OrthoDept);


         //Bill Generation Sample(Insurance Strategy Applied via patient)
        Bill bill1 = new Bill.BillBuilder().setDoctorCharge(300).setMedicineCharge(100).setLabCharge(250).build();
        System.out.println("Print Bill"+ bill1);

//         Admin admin = new Admin("H100", "Joseph Quinn", "H1n2", patients, departmentsList);
//         System.out.println(admin.getListOfDepartments());
     }


    public Admin(String hospitalId, String adminName, String post, List<Patient> listOfPatients, List<Department> listOfDepartments) {
        this.hospitalId = hospitalId;
        this.adminName = adminName;
        this.post = post;
        this.listOfPatients = listOfPatients;
        this.listOfDepartments = listOfDepartments;
    }

    public String getHospitalId() {
        return hospitalId;
    }

    public void setHospitalId(String hospitalId) {
        this.hospitalId = hospitalId;
    }

    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public List<Patient> getListOfPatients() {
        return listOfPatients;
    }

    public void setListOfPatients(List<Patient> listOfPatients) {
        this.listOfPatients = listOfPatients;
    }

    public List<Department> getListOfDepartments() {
        return listOfDepartments;
    }

    public void setListOfDepartments(List<Department> listOfDepartments) {
        this.listOfDepartments = listOfDepartments;
    }




}
