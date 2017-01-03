package com.yimdaeun.javatutorials.P7;

/*
 * �̹� ���α׷��� ������ ���� guessWords�� ����� �ܾ���� ���ߴ� �����̴�. 
 * ���� ����� ���� ���α׷��� �ϼ��Ͻÿ�. (����ǡ� ������ �ؽ�Ʈ ������) 
 * ���α׷��� �����ϸ� ��ǻ�ʹ� guessWords�� �ִ� �ܾ� �߿��� ������ �ܾ �����Ͽ� player�� ���ߴ����� ���� �����̴�. 
 �� guess�ؾ� �ϴ� ���ڿ��� ���̸�ŭ Ʋ���� guess�ϸ� �÷��̾ ���� �����̴�. 
  �� ���� ��Sorry you lose, the word was : guess�� ���ڿ������ �޽����� �������� �Ѵ�.
  �� guess�� �����ϸ�, ��YOU WIN!! :>�� ��� �޽����� �������� �Ѵ�.
*/

import java.io.IOException;


class GuessWords {
	
	String guessWords[] = {"algorithm", "university", "programming", "windows", "excel", "sogang"};
	char guessing[], answer[], letter_entered;
	int trial=0, letterNum=0, correctNum=0;
	boolean trial_success, game_over;
	
	//random problem and initialize guessing, number of correct guess
	void gameSet(){
		int random_num = (int)(Math.random()*6);
		trial = 0;
		letterNum = guessWords[random_num].length();
		guessing = new char[letterNum];
		answer = new char[letterNum];
		answer = guessWords[random_num].toCharArray();
		
		for(int i=0; i<letterNum;i++)
			guessing[i] = '-';
		
		game_over= false;
		
		System.out.println();
	}
	
	//get user's answer
	void getAnswer(){
		
		System.out.print("Guess a word : ");
		PrintGuessing(guessing);
		System.out.println();
		System.out.println("The number of correct guess : " + correctNum);
		System.out.println("Enter a guess character : " );
		try {
			letter_entered = (char)System.in.read();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
				//(char) sc.next().indexOf(0);
		//sc.skip("[\\r\\n]+");
		try {
			System.in.skip(2);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("letter entered : " + letter_entered);
		trial++;
		//sc.close();
	}
	
	//check the answer
	void checkAnswer(){
		int i;
		if(trial <= letterNum){
			for(i=0; i<letterNum ; i++){
				if(answer[i] == letter_entered){
					guessing[i] = letter_entered;
					correctNum++;
					trial_success = true;
				}
			}
		}
		else{
			//PrintResult();
		}
	}
	
	//print out the result
	
	void PrintResult(){
		if(trial > letterNum)
		{
			System.out.print("Sorry you lose, the word was : ");
			PrintGuessing(answer);
			System.out.println();
			game_over = true;
		}
		else if(trial_success)
		{
			System.out.println("Correct guess :>" );
			trial_success = false;
			if(correctNum == letterNum){
				System.out.println("You Win!! :>" );
				game_over = true;
			}
		}
		else
		{
			System.out.println("Sorry, wrong guess" );
		}
	}
	
	void PrintGuessing(char targetarray[]){
		for(int i=0; i<letterNum ; i++)
			System.out.print(targetarray[i]);
		
	}
	
}


public class P7_1 {
	public static void main(String[] args) {
		GuessWords guesswords = new GuessWords();
		
		guesswords.gameSet();
		while(guesswords.game_over == false){
			guesswords.getAnswer();
			guesswords.checkAnswer();
			guesswords.PrintResult();
			System.out.println();
		}
		
		
	}

}
