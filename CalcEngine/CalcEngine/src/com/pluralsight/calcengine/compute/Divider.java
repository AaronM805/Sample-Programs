package com.pluralsight.calcengine.compute;

public class Divider extends Compute {

	public Divider() {}
	
	public Divider(double leftVal, double rightVal) {
		super(leftVal, rightVal);
	}
	
	@Override
	public double compute() {
		return getLeftValue() / getRightValue();
	}
}
