package com.yimdaeun.javatutorials.HW2;

/*학생아래 코드는 생성자, 
 * this, 메소드 오버로딩을 연습하기 위한 문제이다. main은 수정하지 말고, 
 * main의 결과가 나오도록 Student 클래스를 완성하시오. Applicant 클래스 멤버 변수들은 모두 private이다.
 */


public class HW2_1 {
	public static void main(String[] args) {
		
	}
}
//얘도 딱히 필요없을듯... ㅋㅋㅋㅋㅋ
/*
class Applicant {
	private int no;
	private String name;
	private int toeic;
	private double gpa;
	
	Applicant(){
		
	}
	Applicant(int no){
		this.no = no;
	}
	Applicant(int no, String name){
		this.no = no;
		this.name = name;
	}
	Applicant(int no, String name, int toeic){
		this.no = no;
		this.name = name;
		this.toeic = toeic;
	}
	Applicant(int no, String name, int toeic, double gpa){
		this.no = no;
		this.name = name;
		this.toeic = toeic;
		this.gpa = gpa;
	}
	
	void set(int no){
		this.no = no;
	}
	void set(int no, String name){
		this.no = no;
		this.name = name;
	}
	Applicant(int no, String name, int toeic){
		this.no = no;
		this.name = name;
		this.toeic = toeic;
	}
	Applicant(int no, String name, int toeic, double gpa){
		this.no = no;
		this.name = name;
		this.toeic = toeic;
		this.gpa = gpa;
	}
	
	void printall(){
		System.out.println(this.name + "(" + this.no + ") : toeic(" + toeic + "), gpa(" + this.gpa + ")");
	}
	
}


public class HW2_1 {
	public static void main(String[] args) {
		Applicant a1 = new Applicant();
		Applicant a2 = new Applicant(10); // no 초기화
		Applicant a3 = new Applicant(5, "Alice"); // no, name 초기화
		Applicant a4 = new Applicant(12, "Paul", 850); // no, name, toeic 초기화
		Applicant a5 = new Applicant(7, "David", 900, 2.9); // no, name, toeic, gpa 초기화
		
		a1.set(20); // int argument가 1개이면, no 값을 넣는다.
		a2.set("Cindy"); // String argument가 1개이면, name 값을 넣는다.
		a2.set(950, 3.8); // int, double 2개의 argument를 가지면, toeic과 gpa 값을 넣는다.
		a1.set("Robert", 910, 3.3); // String, int, double 3개의 argument를 가지면, name, toeic, gpa 값을 넣는다.
		a4.set(3.2); // double 1개의 argument를 가지면, gpa 값을 넣는다.
		a3.set(880, 3.5);
		
		a1.printAll();
		a2.printAll();
		a3.printAll();
		a4.printAll();
		a5.printAll();
	}
}
*/