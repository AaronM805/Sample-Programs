package com.pluralsight.calcengine.compute;

public class Adder extends Compute{

	public Adder() {}
	
	public Adder(double leftVal, double rightVal) {
		super(leftVal, rightVal);
	}
	
	public double compute() {
		return getLeftValue() + getRightValue();
	}
}
