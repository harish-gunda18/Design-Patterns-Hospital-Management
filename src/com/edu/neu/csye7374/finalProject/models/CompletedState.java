package com.edu.neu.csye7374.finalProject.models;

public class CompletedState implements VisitStateAPI{
    Visit visit;

    @Override
    public String toString() {
        return "CompletedState {" +
                "visit id:" + visit.getVisitId() +
                " patient id:" + visit.getPatientId() +
                " doctor id:" + visit.getDoctorId()+
                '}';
    }

    public CompletedState(Visit visit){
        this.visit = visit;
    }

    @Override
    public void checkedIn() {
        System.out.println("Cannot switch from Completed to checkedIn state");
    }

    @Override
    public void waiting() {
        System.out.println("Cannot switch from Completed to Waiting state");
    }

    @Override
    public void inProgress() {
        System.out.println("Cannot switch from Completed to InProgress state");
    }

    @Override
    public void completed() {
        System.out.println("Already in completed state");
    }
}
