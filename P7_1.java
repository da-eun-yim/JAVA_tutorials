package com.yimdaeun.javatutorials.P7;

/*
 * 이번 프로그램은 다음과 같이 guessWords에 저장된 단어들을 맞추는 게임이다. 
 * 실행 결과를 보고 프로그램을 완성하시오. (‘행맨’ 게임의 텍스트 버전임) 
 * 프로그램을 수행하면 컴퓨터는 guessWords에 있는 단어 중에서 임의의 단어를 선택하여 player가 맞추는지를 보는 게임이다. 
 ● guess해야 하는 문자열의 길이만큼 틀리게 guess하면 플레이어가 지는 게임이다. 
  이 때에 ‘Sorry you lose, the word was : guess한 문자열’라는 메시지가 나오도록 한다.
  ● guess가 성공하면, ‘YOU WIN!! :>’ 라는 메시지가 나오도록 한다.
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
