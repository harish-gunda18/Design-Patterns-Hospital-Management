package com.edu.neu.csye7374.finalProject.models;

public class Department {
    Admin admin;
    String departmentName;
    String departmentManager;

    public Department(DepartmentBuilder departmentBuilder) {
        super();
        this.admin = departmentBuilder.admin;
        this.departmentName =  departmentBuilder.departmentName;
        this.departmentManager =  departmentBuilder.departmentManager;
    }

    public Admin getAdmin() {
        return admin;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public String getDepartmentManager() {
        return departmentManager;
    }

    public static class DepartmentBuilder{
        Admin admin;
        String departmentName;
        String departmentManager;

        public DepartmentBuilder setAdmin(Admin admin) {
            this.admin = admin;
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

        public Department build() {
            return new Department(this);
        }
    }
}
