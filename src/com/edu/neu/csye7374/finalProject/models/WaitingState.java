package com.edu.neu.csye7374.finalProject.models;

public class WaitingState implements VisitStateAPI{
    Visit visit;

    @Override
    public String toString() {
        return "WaitingState {" +
                "visit id:" + visit.getVisitId() +
                " patient id:" + visit.getPatientId() +
                " doctor id:" + visit.getDoctorId()+
                '}';
    }

    public WaitingState(Visit visit){
        this.visit = visit;
    }

    @Override
    public void checkedIn() {
        System.out.println("Cannot switch from waiting to checkedIn state");
    }

    @Override
    public void waiting() {
        System.out.println("Already in waiting state");
    }

    @Override
    public void inProgress() {

        visit.setState(visit.getInProgress());
        System.out.println(visit.getState());
    }

    @Override
    public void completed() {
        System.out.println("Cannot switch from waiting to completed state");
    }
}
