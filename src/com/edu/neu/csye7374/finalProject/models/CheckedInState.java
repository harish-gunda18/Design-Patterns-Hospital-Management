package com.edu.neu.csye7374.finalProject.models;

public class CheckedInState implements VisitStateAPI {
    Visit visit;

    @Override
    public String toString() {
        return "CheckedInState {" +
                "visit id:" + visit.getVisitId() +
                " patient id:" + visit.getPatientId() +
                " doctor id:" + visit.getDoctorId()+
                '}';
    }

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
        System.out.println(visit.getState());

    }

    @Override
    public void inProgress() {
        visit.setState(visit.getInProgress());
        System.out.println(visit.getState());
    }

    @Override
    public void completed() {
        System.out.println("Cannot switch from checkedIn to completed state");
    }
}
