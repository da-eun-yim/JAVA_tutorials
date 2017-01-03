package com.yimdaeun.javatutorials.P1;

/*하나의 정수를 입력받아 그 수가 소수인지 판단하는 프로그램을 작성하라 */
import java.util.Scanner;

public class P1_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter input positive integer: ");
		int user_input = sc.nextInt();
		int i;
		
		for( i=2; i<user_input; i++){
			if(user_input % i == 0)
				break;
		}
		
		if(i==user_input)
			System.out.println(user_input + "은 소수입니다.");
		else
			System.out.println(user_input + "은 소수가 아닙니다.");
		
		sc.close();
	}
}
