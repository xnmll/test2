package com.mhk;

public class USTaxCalculate implements TaxCalculate {

	@Override
	public double calculateTax(double amount) {
		
		return amount * 0.2;
	}

}
