package com.pluralsight.calcengine.compute;

public class Multiplier extends Compute {

	public Multiplier() {}
	
	public Multiplier(double leftVal, double rightVal) {
		super(leftVal, rightVal);
	}
	
	@Override
	public double compute() {
		return getLeftValue() * getRightValue();
	}
}
