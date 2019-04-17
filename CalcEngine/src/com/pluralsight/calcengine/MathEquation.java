package com.pluralsight.calcengine;

public class MathEquation {
	
	private double leftValue;
	private double rightValue;
	private char opCode;
	private double result;
	
	public MathEquation(char opCode) {
		this.opCode = opCode;
	}
	
	public MathEquation(char opCode, double leftVal, double rightVal) {
		this(opCode);
		leftValue = leftVal;
		rightValue = rightVal;
	}
	
	public double getLeftValue() {
		return leftValue;
	}
	
	public void setLeftValue(double leftVal) {
		leftValue = leftVal;
	}
	
	public double getRightValue() {
		return rightValue;
	}
	
	public void setRightValue(double rightVal) {
		rightValue = rightVal;
	}
	
	public char getOpCode() {
		return opCode;
	}
	
	public void setOpCode(char opCode) {
		this.opCode = opCode;
	}
	
	public double getResult() {
		return result;
	}
	
	public void compute() {
		switch(opCode) {
			case 'a':
				result = leftValue + rightValue;
				break;
			case 's':
				result = leftValue - rightValue;
				break;
			case 'd':
				result = rightValue == 0.0 ? 0.0 : (leftValue / rightValue);
				break;
			case 'm':
				result = leftValue * rightValue;
				break;
			default:
				System.out.println("ERROR: This operation is not valid!");
				result = 0.0;
				break;
		}
	}
	
	public void compute(double leftVal, double rightVal) {
		setLeftValue(leftVal);
		setRightValue(rightVal);
		compute();
	}
	
	public void compute(int leftVal, int rightVal) {
		setLeftValue(leftVal);
		setRightValue(rightVal);
		compute();
		
		result = (int) result;
	}
}
