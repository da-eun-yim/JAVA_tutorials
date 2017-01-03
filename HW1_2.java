package com.yimdaeun.javatutorials.HW1;

class Solver2 extends Solver{
	public void print_Result(int temp){
		int frequency;
		for(int i=0; i<how_many.length; i++){
			frequency = how_many[i];
			for(int j=0; j<frequency; j++)
				System.out.print("*");
			System.out.println("("+ i + ")");
		}
	}
}

public class HW1_2 {
	
	public static void main(String[] args) {
		Solver2 solver2 = new Solver2();	
		int temp;
		
		solver2.set_Array();
		temp = solver2.count_Array();
		solver2.print_Result(temp);
		
	}
}
