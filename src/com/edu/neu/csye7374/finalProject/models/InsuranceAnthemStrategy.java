package com.edu.neu.csye7374.finalProject.models;

public class InsuranceAnthemStrategy implements InsuraceStrategyAPI {
	float INSURACE_RATE = 0.75f;

	public double calcuateBill(double preInsuranceBill) {
		// TODO Auto-generated method stub
		return preInsuranceBill*INSURACE_RATE;
	}
	

}
