package com.mhk;

public class MexicoTaxCalculate implements TaxCalculate {

	@Override
	public double calculateTax(double amount) {
		
		return amount * 0.6;
	}

}
