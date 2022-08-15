package com.edu.neu.csye7374.finalProject.models;

public class Bill {
    Patient patient;
    double doctorCharge;
    double medicineCharge;
    double labCharge;

    public Bill( BillBuilder billBuilder){
        super();
        this.patient = billBuilder.patient;
        this.doctorCharge = billBuilder.doctorCharge;
        this.medicineCharge = billBuilder.medicineCharge;
        this.labCharge = billBuilder.labCharge;
    }
    public Patient getPatient () {
        return patient;
    }

    public double getDoctorCharge() {
        return doctorCharge;
    }

    public double getMedicineCharge() {
        return medicineCharge;
    }

    public double getLabCharge() {
        return labCharge;
    }

    public static class BillBuilder {
        Patient patient;
        double doctorCharge;
        double medicineCharge;
        double labCharge;

        public BillBuilder setPatient(Patient patient) {
            this.patient = patient;
            return this;
        }
        public BillBuilder setDoctorCharge(double doctorCharge) {
            this.doctorCharge = doctorCharge;
            return this;
        }
        public BillBuilder setMedicineCharge(double medicineCharge) {
            this.medicineCharge = medicineCharge;
            return this;
        }
        public BillBuilder setLabCharge(double labCharge) {
            this.labCharge = labCharge;
            return this;
        }
        public Bill build() {
            return new Bill(this);
        }
    }

}
