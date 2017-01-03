package com.yimdaeun.javatutorials.P6;

interface Instrument2 { 
	  int volume=0;

	  void play();
	  void volumeUp();
	  void volumeDown();
	}

class Piano2 implements Instrument2 {
	  int volume=0;
	  Piano2(){}
	  Piano2(int i){volume = i;}
	  public void play(){
		  
	  }
	  public void volumeUp(){
		  volume++;
	  }
	  public void volumeDown(){
		  volume--;
	  }
	  public void print(){
		  System.out.println("Piano volume: " + volume);
	  }
	  // 생성자와 메소드 추가
	}

class Flute2 implements Instrument2 {
	  int volume=0;
	  Flute2(){}
	  Flute2(int a){volume = a;}
	  public void play(){
		  
	  }
	  public void volumeUp(){
		  volume += 2;
	  }
	  public void volumeDown(){
		  volume--;
	  }
	  public void print(){
		  System.out.println("Flute volume: " + volume);
	  }
	  // 생성자와 메소드 추가
	}

public class P6_2 {

	public static void main(String[] args) {
		Piano2 p1 = new Piano2(10);
	    Piano2 p2 = new Piano2(20);
	    Flute2 f = new Flute2(100);
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