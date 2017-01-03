package com.yimdaeun.javatutorials.P6;

/*
 * �Ϸ翡 �� �� ���� �Ѿ�� �� ����� ȣ���̿��� ���� �־�� ���� �Ѿ �� �ִ�. 
 * ȣ���̴� ���� ���� ���� ������ ������ ���� ���� ������ ���� ������ŭ�� ���� �޾ƾ߸� �� ����� �����شٰ� �Ѵ�. 
 * ���� ���, ù° ���� ���� 1�� �־���, ��° ������ ���� 2�� �־��ٸ� ��° ������ 1+2=3��, ��° ������ 2+3=5��, 
 * �ټ�° ������ 3+5=8��, ����° ������ 5+8=13���� �־�߸� �� ����� ������ ���� �Ѿ �� �ִ�. 
 * �츮�� �� ������� ��� ������ ȣ���̿��� ���� �� �� X��° �Ǵ� ���̰� Y���� ���� �־��ٴ� ���� �˾Ҵ�. 
 * X�� Y�� �Է����� ���� ��, �� ����� ù° �� ȣ���̿��� �� ���� ����(A)�� ��° �� �� ���� ����(B)�� ���ϴ� ���α׷��� �ۼ��Ͻÿ�. 
 * (3��X��10, 1��A��B �̴�.)
 */

import java.util.Scanner;

class Solver2{
	int lastDay, lastCake;
	int FiboA[] = new int[100];
	int FiboB[] = new int[100];
	int firstDay, secondDay;
	Boolean success=false;
	
	Solver2(){
		FiboA[0] = 0;
		FiboA[1] = 1;
		FiboA[2] = 0;
		FiboB[0] = 0;
		FiboB[1] = 0;
		FiboB[2] = 1;
	}
	
	void Fibo_store(){
		int i;
		
		for(i=3; i<lastDay; i++){
			if(FiboA[i] == 0)
				break;
		}
	
		for(; i<=lastDay; i++){
			FiboA[i] = FiboA[i-1] + FiboA[i-2];
			FiboB[i] = FiboB[i-1] + FiboB[i-2];
		}
		
	}
	void Find_first_two(){
		int maximum=0, tmpCake=0, i; 
		maximum = lastCake / FiboA[lastDay];
		for( i=1; i<=maximum; i++){
			tmpCake = lastCake;
			tmpCake -= FiboA[lastDay] * i;
			if(tmpCake % FiboB[lastDay] == 0 && i<= tmpCake / FiboB[lastDay] && tmpCake / FiboB[lastDay] > 1){
				success = true;
				break;
			}
		}
		firstDay = i;
		secondDay = tmpCake / FiboB[lastDay];
	}
	void Print(){
		if(success == true)
			System.out.println("ù°��: " + firstDay + "��°��: " + secondDay);
		else
			System.out.println("���� ������ ���� �� �����ϴ�.");
		success = false;
	}
}

public class P6_3 {

	public static void main(String[] args) {
		Solver2 solver2 = new Solver2();
		Scanner sc = new Scanner(System.in);
		
		for(;;){
			System.out.println("Enter input data: ");
			solver2.lastDay = sc.nextInt();
			solver2.lastCake = sc.nextInt();
			
			solver2.Fibo_store();
			solver2.Find_first_two();
			solver2.Print();
			
			System.out.println("Enter 1 to go on / 0 to stop");
			if(sc.nextInt() == 0)
				break;
		}
		sc.close();

	}

}
