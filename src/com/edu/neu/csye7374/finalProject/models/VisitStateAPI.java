package com.edu.neu.csye7374.finalProject.models;

public interface VisitStateAPI {
    void checkedIn ();
    void waiting ();
    void inProgress ();
    void completed ();
}
