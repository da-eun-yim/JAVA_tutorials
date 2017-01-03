package com.yimdaeun.javatutorials.P5;


import java.io.File;
import java.io.IOException;
import java.util.Scanner;

class Solver{
	
	int classCount = 0, main = 0, sub = 0;
	int main_number=1, sub_number=0;
	int cnt[] = null;
	
	Solver(){}
	
	void FileRead(){
		File file = new File("data.txt");
		Scanner scin;
		
		if (file.exists()) {
			try {
				scin = new Scanner(file);
				classCount = scin.nextInt();
				main = scin.nextInt();
				sub = scin.nextInt();

				cnt = new int[classCount];
				for (int i=0; i<classCount; i++) {
					cnt[i] = scin.nextInt(); 
				} 
			} catch (IOException e) {}
		}
		else {
			System.out.println("data.txt not exist!!");
		}
	}
	
	void main_allocate(){
		int max_index=0;
		
		for(int i=1; i<classCount ; i++){
			if(cnt[max_index] < cnt[i])
				max_index = i;
		}
		
		//총감독관 배정은 가장 많은 사람이 있는 곳에 한 명
		cnt[max_index] -= main;
		
		
	}
	
	int howMany(){	
		for(int i=0; i<classCount; i++){
			if(cnt[i] % sub != 0)
				sub_number += cnt[i] / sub + 1;
			else
				sub_number += cnt[i] / sub;
		}
		
		return main_number + sub_number;
	}
}


public class P5_1 {
	

	public static void main(String[] args) {
		int answer=0;
		Solver solver = new Solver();
		solver.FileRead();
		solver.main_allocate();
		answer = solver.howMany();
		System.out.println(answer);	
	}

}
