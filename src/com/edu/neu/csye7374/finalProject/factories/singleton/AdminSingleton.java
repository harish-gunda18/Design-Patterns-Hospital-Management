package com.edu.neu.csye7374.finalProject.factories.singleton;

import com.edu.neu.csye7374.finalProject.models.Admin;

public class AdminSingleton {
    private static Admin obj = null;

    private AdminSingleton() {

    }

    public static synchronized Admin getInstance() {
        if(obj == null) {
            obj = new Admin();
        }
        return obj;
    }
}