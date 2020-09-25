package com.mhk;

public class CanadaTaxCalculate implements TaxCalculate {

	@Override
	public double calculateTax(double amount) {
		
		return amount * 0.3;
	}

}
