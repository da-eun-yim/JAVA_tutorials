package com.yimdaeun.javatutorials.P1;

import java.util.Scanner;

public class P1_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter input data: ");
		int user_input = sc.nextInt();
		
		int day_sec = 60*60*24, hour_sec = 60*60, minute_sec = 60;
		int days, hours, minutes, secs;
		
		days  = user_input / day_sec;
		user_input %= day_sec; // store left seconds after calculating preceding data
		
		hours = user_input / hour_sec;
		user_input %= hour_sec;
		
		minutes = user_input/minute_sec;
		user_input %= minute_sec;
		
		secs = user_input;
		
		System.out.println(days + "days "+ hours + "hours  " + minutes + "minutes " + secs + "seconds." );  
		sc.close();
	}

}
