package com.pluralsight.calcengine.compute;

public class Subtracter extends Compute{

	public Subtracter() {}
	
	public Subtracter(double leftVal, double rightVal) {
		super(leftVal, rightVal);
	}
	
	public double compute() {
		return getLeftValue() - getRightValue();
	}
}
