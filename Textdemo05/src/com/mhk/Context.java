package com.mhk;

public class Context {
	
	private TaxCalculate taxCalculate;
	 
	public Context(TaxCalculate taxCalculate){
	   this.taxCalculate = taxCalculate;
	}
	 
	public double executeStrategy(double amount){
	   return taxCalculate.calculateTax(amount);
	}

}
