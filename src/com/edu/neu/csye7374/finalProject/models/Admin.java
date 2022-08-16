package com.edu.neu.csye7374.finalProject.models;

import java.util.ArrayList;
import java.util.List;

public class Admin {
    String hospitalId;
    String adminName;
     String post;
     List<Patient> listOfPatients = new ArrayList<Patient>();
     List<Department> listOfDepartments = new ArrayList<Department>();

    public Admin(AdminBuilder adminBuilder){
        super();
        this.hospitalId = adminBuilder.hospitalId;
        this.adminName = adminBuilder.adminName;
        this.post = adminBuilder.post;
        this.listOfPatients = adminBuilder.listOfPatients;
        this.listOfDepartments = adminBuilder.listOfDepartments;
    }

    public String getHospitalId() {
        return hospitalId;
    }

    public String getAdminName() {
        return adminName;
    }

    public String getPost() {
        return post;
    }

    public List<Patient> getListOfPatients() {
        return listOfPatients;
    }

    public List<Department> getListOfDepartments() {
        return listOfDepartments;
    }

    public static class AdminBuilder {
         String hospitalId;
         String post;
        String adminName;

        private List<Patient> listOfPatients = new ArrayList<Patient>();

        private List<Department> listOfDepartments = new ArrayList<Department>();

        public AdminBuilder setHospitalId(String hospitalId) {
            this.hospitalId = hospitalId;
            return this;
        }

        public AdminBuilder setPost(String post) {
            this.post = post;
            return this;
        }

        public AdminBuilder setAdminName(String adminName) {
            this.adminName = adminName;
            return this;
        }

        public AdminBuilder setListOfDepartments(List<Department> listOfDepartments) {
            this.listOfDepartments = listOfDepartments;
            return this;
        }

        public AdminBuilder setListOfPatients(List<Patient> listOfPatients) {
            this.listOfPatients = listOfPatients;
            return this;
        }

        public Admin build() {
            return new Admin(this);
        }
    }


    }
