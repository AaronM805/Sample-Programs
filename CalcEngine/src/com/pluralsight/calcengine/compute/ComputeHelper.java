package com.pluralsight.calcengine.compute;

import com.pluralsight.calcengine.enums.MathOperation;

public class ComputeHelper {
	
	MathOperation operation;
	double leftVal;
	double rightVal;
	double result;
	
	/**
	 * This method processes
	 * @param formula
	 */
	public void process(String formula) {
		
		 /*  ComputeHelper class to process the text
		 *  	we need to parse string value to get operation and values to compute
		 *  	process(String formula)
		 *  		use delimiter to break down String
		 *  
		 *  "divide 100.0 50.0"
		 */
		
		String[] formulaTokens = formula.split(" ");
		
		String operation = formulaTokens[0];
		leftVal = Double.valueOf(formulaTokens[1]);
		rightVal = Double.valueOf(formulaTokens[2]);
		
		setCommandFromString(operation);
		
		Compute compute = null;
		compute = setComputeObject(compute);
		result = compute.compute();
		
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		sb.append(leftVal);
		sb.append(mathOperation());
		sb.append(rightVal);
		sb.append(" = ");
		sb.append(result);
		//100.0 / 50.0 = 2.0
		
		return sb.toString();
	}
	
	private void setCommandFromString(String command) {
		if(command.equalsIgnoreCase(MathOperation.Add.name())) {
			operation = MathOperation.Add;
		}
		else if(command.equalsIgnoreCase(MathOperation.Divide.name())) {
			operation = MathOperation.Divide;
		}
		else if(command.equalsIgnoreCase(MathOperation.Multiply.name())) {
			operation = MathOperation.Multiply;
		}
		else if(command.equalsIgnoreCase(MathOperation.Subtract.name())) {
			operation = MathOperation.Subtract;
		}
	}
	
	private Compute setComputeObject(Compute compute) {
		switch(this.operation) {
			case Add:
				compute = new Adder(leftVal, rightVal);
				break;
			case Divide:
				compute = new Divider(leftVal, rightVal);
				break;
			case Multiply:
				compute = new Multiplier(leftVal, rightVal);
				break;
			case Subtract:
				compute = new Subtracter(leftVal, rightVal);
				break;
			default:
				System.out.println("Invalid operation");
				break;
		}
		
		return compute;
	}
	
	private String mathOperation() {
		String mathOp = " ";
		switch(this.operation) {
			case Add:
				mathOp = " + ";
				break;
			case Divide:
				mathOp = " / ";
				break;
			case Multiply:
				mathOp = " * ";
				break;
			case Subtract:
				mathOp = " - ";
				break;
			default:
				System.out.println("Invalid operation");
				break;
		}
		
		return mathOp;
	}
}


