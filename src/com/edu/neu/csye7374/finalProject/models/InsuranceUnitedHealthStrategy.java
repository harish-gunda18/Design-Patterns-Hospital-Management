package com.edu.neu.csye7374.finalProject.models;

public class InsuranceUnitedHealthStrategy implements InsuraceStrategyAPI {
	float INSURACE_RATE = 0.8f;

	public double calcuateBill(double preInsuranceBill) {
		// TODO Auto-generated method stub
		return preInsuranceBill*INSURACE_RATE;
	}
	

}
