package com.yimdaeun.javatutorials.P1;

/*�ϳ��� ������ �Է¹޾� �� ���� �Ҽ����� �Ǵ��ϴ� ���α׷��� �ۼ��϶� */
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
			System.out.println(user_input + "�� �Ҽ��Դϴ�.");
		else
			System.out.println(user_input + "�� �Ҽ��� �ƴմϴ�.");
		
		sc.close();
	}
}
