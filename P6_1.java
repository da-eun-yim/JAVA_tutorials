package com.yimdaeun.javatutorials.P6;

abstract class Instrument { 
	  private int volume;

	  Instrument(){}

	  abstract void play();
	  abstract void volumeUp();
	  abstract void volumeDown();
	}

class Piano extends Instrument {
	  private int volume=0;
	  Piano(){}
	  Piano(int i){volume = i;}
	  void play(){
		  
	  }
	  void volumeUp(){
		  volume++;
	  }
	  void volumeDown(){
		  volume--;
	  }
	  void print(){
		  System.out.println("Piano volume: " + volume);
	  }
	  // 생성자와 메소드 추가
	}

class Flute extends Instrument {
	  private int volume=0;
	  Flute(){}
	  Flute(int a){volume = a;}
	  void play(){
		  
	  }
	  void volumeUp(){
		  volume += 2;
	  }
	  void volumeDown(){
		  volume--;
	  }
	  void print(){
		  System.out.println("Flute volume: " + volume);
	  }
	  // 생성자와 메소드 추가
	}

public class P6_1 {

	public static void main(String[] args) {
		Piano p1 = new Piano(10);
	    Piano p2 = new Piano(20);
	    Flute f = new Flute(100);
	    p1.volumeUp();
	    p2.volumeUp();
	    f.volumeUp();
	    p1.volumeUp();
	    f.volumeUp();
	    f.volumeUp();
	    p2.volumeDown();
	    p1.print();
	    p2.print();
	    f.print();
	}

}
