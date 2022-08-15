package com.edu.neu.csye7374.finalProject;

import com.edu.neu.csye7374.finalProject.factories.singleton.AdminSingleton;
import com.edu.neu.csye7374.finalProject.models.Admin;

public class Demo {
    public static void demo() {
        Admin admin = AdminSingleton.getInstance();

    }
}