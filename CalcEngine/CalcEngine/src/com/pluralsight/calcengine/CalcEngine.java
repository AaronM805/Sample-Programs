package com.pluralsight.calcengine;

import com.pluralsight.calcengine.compute.Adder;
import com.pluralsight.calcengine.compute.Compute;
import com.pluralsight.calcengine.compute.Divider;
import com.pluralsight.calcengine.compute.Subtracter;
import com.pluralsight.calcengine.compute.Multiplier;

public class CalcEngine {
	
	public static void main(String[] args) {
		
		/*
		 * 1. Given an array of Strings, for each string value, process the string value and execute the corresponding
		 * 	  calculation, and print out the calculation
		 * 
		 * 2. "divide 100.0 50.0"
		 * 
		 *  	100.0 / 50.0 = 2.0
		 *  
		 *  3. Design/Alg/DS to solve problem - DON'T START CODING RIGHT AWAY
		 *  
		 *  Enum for Operation
		 *  	Add
		 *  	Divide
		 *  	Multiply
		 *  	Subtract
		 *  	
		 *  ComputeHelper class to process the text
		 *  	we need to parse string value to get operation and values to compute
		 *  	process(String formula)
		 *  		use delimiter to break down String
		 *  
		 *  a toString method in each of the operation classes
		 *  
		 */
		String[] statements = {
			"divide 100.0 50.0", // 100.0 / 50.0 = 2.0
			"add 45.0 60.0", // 45.0 + 60.0 = 105.0
			"subtract 100.0 25.0", // 100.0 - 25.0 = 75.0
			"multiply 35.0 15.0" // 35.0 * 15.0 = 525.0
		};	
	}
	
	public void useComputeOperations() {
		System.out.println("Using individual classes to compute results.");
		
		Compute[] computers = {
			new Adder(13.8, 45.2),
			new Divider(234.0, 80.0),
			new Multiplier(189.0, 34.0),
			new Subtracter(15.0, 8.0)
		};
		
		for(Compute computer : computers) {
			System.out.println(computer.compute());
		}
	}
	
	public void useMathEquation() {
		MathEquation[] equations = new MathEquation[4];
		
		equations[0] = new MathEquation('a', 18.0, 94.7);
		equations[1] = new MathEquation('m', 18.0, 94.7);
		equations[2] = new MathEquation('d', 18.0, 94.7);
		equations[3] = new MathEquation('s', 18.0, 94.7);
		
		for(MathEquation eq : equations) {
			
			eq.compute();
			System.out.println("result = " + eq.getResult());
		}
		
		System.out.println("Using overloaded compute with double.");
		MathEquation doubleEq = new MathEquation('m');
		
		doubleEq.compute(12.3, 45.8);
		System.out.println(doubleEq.getResult());
		
		System.out.println("Using overloaded compute with integer.");
		MathEquation intEq = new MathEquation('d');
		
		intEq.compute(45, 7);
		System.out.println(intEq.getResult());
	}
}
