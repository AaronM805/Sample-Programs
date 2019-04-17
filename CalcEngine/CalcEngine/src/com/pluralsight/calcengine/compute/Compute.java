package com.pluralsight.calcengine.compute;

public abstract class Compute {
	
	private double leftValue;
	private double rightValue;
	
	public Compute() {
		
	}
	
	public Compute(double leftVal, double rightVal) {
		this.leftValue = leftVal;
		this.rightValue = rightVal;
	}
	
	public void setLeftValue(double leftVal) {
		leftValue = leftVal;
	}
	
	public double getLeftValue() {
		return leftValue;
	}
	
	public void setRightValue(double rightValue) {
		this.rightValue = rightValue;
	}
	
	public double getRightValue() {
		return rightValue;
	}
	
	public abstract double compute();
}
