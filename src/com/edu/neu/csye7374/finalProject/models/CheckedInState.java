package com.edu.neu.csye7374.finalProject.models;

public class CheckedInState implements VisitStateAPI {
    Visit visit;

    public CheckedInState(Visit visit){
        this.visit = visit;
    }

    @Override
    public void checkedIn() {
        System.out.println("Patient already is checkedIn State");
    }

    @Override
    public void waiting() {
        visit.setState(visit.getWaiting());
    }

    @Override
    public void inProgress() {
        visit.setState(visit.getInProgress());
    }

    @Override
    public void completed() {
        System.out.println("Cannot switch from checkedIn to completed state");
    }
}
