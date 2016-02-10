package com.practicaljava.lesson5;

public class Tax {
	double grossIncome;
	String state;
	int dependents;
	
	public Tax(double gI, String st, int dep) {
		grossIncome = gI;
		state = st;
		dependents = dep;
	}
	
	public double calcTax() {
		double stateTax = 0;
		
		if (grossIncome < 30000) {
			stateTax = grossIncome * 0.05;
		} else {
			stateTax = grossIncome * 0.06;
		}
		return stateTax;
	}

}
