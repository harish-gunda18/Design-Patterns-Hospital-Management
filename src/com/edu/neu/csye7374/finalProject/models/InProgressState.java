package com.edu.neu.csye7374.finalProject.models;

public class InProgressState implements VisitStateAPI{
    Visit visit;

    @Override
    public String toString() {
        return "InProgressState {" +
                "visit id:" + visit.getVisitId() +
                " patient id:" + visit.getPatientId() +
                " doctor id:" + visit.getDoctorId()+
                '}';
    }

    public InProgressState(Visit visit){
        this.visit = visit;
    }

    @Override
    public void checkedIn() {
        System.out.println("Cannot switch from InProgress to checkedIn state");
    }

    @Override
    public void waiting() {
        System.out.println("Cannot switch from InProgress to checkedIn state");
    }

    @Override
    public void inProgress() {
        System.out.println("Already in Progress state");
    }

    @Override
    public void completed() {
        visit.setState(visit.getCompleted());
        System.out.println(visit.getState());
        System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
        System.out.println("Prescription:" + visit.getPrescription());
        System.out.println("Bill:" + visit.getBill());
        System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
    }
}
