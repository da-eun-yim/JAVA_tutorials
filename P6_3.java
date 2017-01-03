package com.yimdaeun.javatutorials.P6;

/*
 * 하루에 한 번 산을 넘어가는 떡 장수는 호랑이에게 떡을 주어야 산을 넘어갈 수 있다. 
 * 호랑이는 어제 받은 떡의 개수와 그저께 받은 떡의 개수를 합한 개수만큼의 떡을 받아야만 떡 장수를 보내준다고 한다. 
 * 예를 들어, 첫째 날에 떡을 1개 주었고, 둘째 날에는 떡을 2개 주었다면 셋째 날에는 1+2=3개, 넷째 날에는 2+3=5개, 
 * 다섯째 날에는 3+5=8개, 여섯째 날에는 5+8=13개를 주어야만 떡 장수는 무사히 산을 넘어갈 수 있다. 
 * 우리는 떡 장수에게 물어서 오늘은 호랑이에게 떡을 준 지 X일째 되는 날이고 Y개의 떡을 주었다는 것을 알았다. 
 * X와 Y를 입력으로 받을 때, 떡 장수가 첫째 날 호랑이에게 준 떡의 개수(A)와 둘째 날 준 떡의 개수(B)를 구하는 프로그램을 작성하시오. 
 * (3≤X≤10, 1≤A≤B 이다.)
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
			System.out.println("첫째날: " + firstDay + "둘째날: " + secondDay);
		else
			System.out.println("떡의 개수를 정할 수 없습니다.");
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
