package com.edu.neu.csye7374.finalProject;

import com.edu.neu.csye7374.finalProject.factories.singleton.AdminSingleton;
import com.edu.neu.csye7374.finalProject.models.Admin;

public class Demo {
    public static void HospitalOrchestratorDemo() {
        Admin admin = AdminSingleton.getInstance();
        System.out.print(admin);
        Admin.demo();
    }
}