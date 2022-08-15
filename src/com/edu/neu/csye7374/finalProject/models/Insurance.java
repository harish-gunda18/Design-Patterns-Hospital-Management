package com.edu.neu.csye7374.finalProject.models;

public class Insurance {
    Patient patient;
    String publishDate;
    String expirationDate;
    String insuranceCompany;
    String insurancePlanId;

    public Insurance(InsuranceBuilder insuranceBuilder) {
        super();
        this.patient = insuranceBuilder.patient;
        this.publishDate = insuranceBuilder.publishDate;
        this.expirationDate = insuranceBuilder.expirationDate;
        this.insuranceCompany = insuranceBuilder.insuranceCompany;
        this.insurancePlanId = insuranceBuilder.insurancePlanId;
    }

    public Patient getPatient() {
        return patient;
    }
    public String getPublishDate() {
        return publishDate;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public String getInsuranceCompany() {
        return insuranceCompany;
    }

    public String getInsurancePlanId() {
        return insurancePlanId;
    }

    public static class InsuranceBuilder {
        Patient patient;
        String publishDate;
        String expirationDate;
        String insuranceCompany;
        String insurancePlanId;

        public InsuranceBuilder setPatient(Patient patient) {
            this.patient = patient;
            return this;
        }

        public InsuranceBuilder setPublishDate(String publishDate) {
            this.publishDate = publishDate;
            return this;
        }

        public InsuranceBuilder setExpirationDate(String expirationDate) {
            this.expirationDate = expirationDate;
            return this;
        }

        public InsuranceBuilder setInsuranceCompany (String insuranceCompany) {
            this.insuranceCompany = insuranceCompany;
            return this;
        }

        public InsuranceBuilder setinsurancePlanId (String insurancePlanId) {
            this.insurancePlanId = insurancePlanId;
            return this;
        }
    }
}
