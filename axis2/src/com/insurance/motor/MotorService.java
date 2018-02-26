package com.insurance.motor;

public class MotorService {

	public double getQuote(String type) {
		if("gold".equalsIgnoreCase(type)) {
			return 100.00;
		} else {
			return 50.00;
		}
	}
	
}
