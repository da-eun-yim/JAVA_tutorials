package com.yimdaeun.javatutorials.HW1;

/*
 * 크기 20인 정수 배열 L에 0부터 9까지의 임의의 수를 넣도록 한다. 
 * 임의의 수는 자동으로 입력되도록 한다 (강의 자료 3장, p.13 참조).
 * 배열 L에 가장 많이 저장된 숫자를 찾아 출력한다. 
 * 만약에 가장 많이 저장된 숫자가 여러 개이면 가장 작은 수를 출력하도록 한다. 출력할 때 배열 L도 같이 출력한다.
 */

import java.util.Arrays;
import java.util.Scanner;

class Solver{
	int L[];
	int how_many[] = new int[10];	
	
	public Solver() {
	}
	
	public  void  set_Array(){
		Scanner sc = new Scanner(System.in);
		int i;
		
		System.out.println("Enter input data: ");
		int user_input = sc.nextInt();
		L = new int[user_input];
		
		for( i=0; i<L.length; i++)
			L[i] = (int)(Math.random() * 10);
		
		sc.close();
	}
	
	public int count_Array(){
		int temp, i;
		
		//visiting all elements of L array data, increase each element's frequency in how_many arrays
		for( i=0; i<L.length; i++){
			temp = L[i]; //temp here, is for store temporary data of what data is in 
			how_many[temp]++;
		}
		
		temp = 0; //temp is here for biggest frequency
		for(i=1; i<how_many.length; i++){
			if(how_many[i] > how_many[temp])
				temp = i;			
		}
		
		return temp;
		
	}
	
	public void print_Result(int temp){
		System.out.println("배열 L: " + Arrays.toString(L));
		System.out.println(temp + " - " + how_many[temp] + "회 저장");
	}
}

public class HW1_1 {
	
	

	public static void main(String[] args) {
		Solver solver = new Solver();
		
		int temp;
		
		
		solver.set_Array();
		temp = solver.count_Array();
		solver.print_Result(temp);
		
	}

}
