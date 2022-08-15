package com.edu.neu.csye7374.finalProject.models;

public class InsuranceBluecrossStrategy implements InsuraceStrategyAPI {
	float INSURACE_RATE = 0.7f;

	public float calcuateBill(float preInsuranceBill) {
		// TODO Auto-generated method stub
		return preInsuranceBill*INSURACE_RATE;
	}
	

}
