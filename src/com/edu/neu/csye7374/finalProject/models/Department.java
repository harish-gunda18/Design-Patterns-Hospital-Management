    package com.edu.neu.csye7374.finalProject.models;

import java.util.ArrayList;
import java.util.List;

public class Department {
    String adminId;
    String departmentName;
    String departmentManager;

    private List<Person> listOfDoctors = new ArrayList<Person>();



    public Department(DepartmentBuilder departmentBuilder) {
        super();
        this.adminId = departmentBuilder.adminId;
        this.departmentName =  departmentBuilder.departmentName;
        this.departmentManager =  departmentBuilder.departmentManager;
        this.listOfDoctors = departmentBuilder.listOfDoctors;
    }

    public String getAdminId() {
        return adminId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public String getDepartmentManager() {
        return departmentManager;
    }

    public List<Person> getListOfDoctors() {
        return listOfDoctors;
    }

    public static class DepartmentBuilder{
        String adminId;
        String departmentName;
        String departmentManager;
        List<Person> listOfDoctors = new ArrayList<Person>();

        public DepartmentBuilder setAdminId(String adminId) {
            this.adminId = adminId;
            return this;
        }

        public DepartmentBuilder setDepartmentName(String departmentName) {
            this.departmentName = departmentName;
            return this;
        }

        public DepartmentBuilder setDepartmentManager(String departmentManager) {
            this.departmentManager = departmentManager;
            return this;
        }

        public DepartmentBuilder setListOfDoctors(List<Person> docters) {
            this.listOfDoctors = docters;
            return this;
        }

        public Department build() {
            return new Department(this);
        }
    }
}
