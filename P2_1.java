package com.yimdaeun.javatutorials.P2;


public class P2_1 {

	public static void main(String[] args) {
		String toCalculate[] = new String[3];
		int i =0, result=0;
		
		for(String e: args){
			toCalculate[i++] = e;
		}
		
		int left = Integer.parseInt(toCalculate[0]);
		int right = Integer.parseInt(toCalculate[2]);
		
		switch(toCalculate[1]){
			case "+":
				result = left + right;
				break;
			case "-":
				result = left - right;
				break;
			case "/":
				result = left / right;
				break;
			case "%":
				result = left % right;
				break;
		}
		
		System.out.println(toCalculate[0] + " " + toCalculate[1] + " " + toCalculate[2] + " = " + result);

	}

}
