package com.edu.neu.csye7374.finalProject.models;

public class Bill {
    Person patient;

    @Override
    public String toString() {
        return "Bill{" +
                "patient=" + patient.firstName + " " + patient.lastName +
                ", doctorCharge=" + doctorCharge +
                ", medicineCharge=" + medicineCharge +
                ", labCharge=" + labCharge +
                ", totalCharge=" + totalCharge +
                '}';
    }

    double doctorCharge;
    double medicineCharge;
    double labCharge;
    private double totalCharge;

    public double getTotalCharge(){
        return this.totalCharge;
    }
    public Bill( BillBuilder billBuilder){
        super();
        this.patient = billBuilder.patient;
        this.doctorCharge = billBuilder.doctorCharge;
        this.medicineCharge = billBuilder.medicineCharge;
        this.labCharge = billBuilder.labCharge;
        this.totalCharge = billBuilder.totalCharge;
    }
    public Person getPatient () {
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
        Person patient;
        double doctorCharge;
        double medicineCharge;
        double labCharge;
        double totalCharge;

        public BillBuilder setPatient(Person patient1) {
            this.patient = patient1;
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

        public double calculateTotalCharge(){
            double totalPayable = new BillGenerationInvoker().execute(this.doctorCharge, this.medicineCharge, this.labCharge);
            return patient.getPatientInsurance().calcuateBill(totalPayable);
        }

        public Bill build() {
            this.totalCharge = calculateTotalCharge();
            return new Bill(this);
        }
    }

}
