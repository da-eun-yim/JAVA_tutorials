package com.yimdaeun.javatutorials.HW1;

/*
 * ũ�� 20�� ���� �迭 L�� 0���� 9������ ������ ���� �ֵ��� �Ѵ�. 
 * ������ ���� �ڵ����� �Էµǵ��� �Ѵ� (���� �ڷ� 3��, p.13 ����).
 * �迭 L�� ���� ���� ����� ���ڸ� ã�� ����Ѵ�. 
 * ���࿡ ���� ���� ����� ���ڰ� ���� ���̸� ���� ���� ���� ����ϵ��� �Ѵ�. ����� �� �迭 L�� ���� ����Ѵ�.
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
		System.out.println("�迭 L: " + Arrays.toString(L));
		System.out.println(temp + " - " + how_many[temp] + "ȸ ����");
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
