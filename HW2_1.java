package com.yimdaeun.javatutorials.HW2;

/*�л��Ʒ� �ڵ�� ������, 
 * this, �޼ҵ� �����ε��� �����ϱ� ���� �����̴�. main�� �������� ����, 
 * main�� ����� �������� Student Ŭ������ �ϼ��Ͻÿ�. Applicant Ŭ���� ��� �������� ��� private�̴�.
 */


public class HW2_1 {
	public static void main(String[] args) {
		
	}
}
//�굵 ���� �ʿ������... ����������
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
		Applicant a2 = new Applicant(10); // no �ʱ�ȭ
		Applicant a3 = new Applicant(5, "Alice"); // no, name �ʱ�ȭ
		Applicant a4 = new Applicant(12, "Paul", 850); // no, name, toeic �ʱ�ȭ
		Applicant a5 = new Applicant(7, "David", 900, 2.9); // no, name, toeic, gpa �ʱ�ȭ
		
		a1.set(20); // int argument�� 1���̸�, no ���� �ִ´�.
		a2.set("Cindy"); // String argument�� 1���̸�, name ���� �ִ´�.
		a2.set(950, 3.8); // int, double 2���� argument�� ������, toeic�� gpa ���� �ִ´�.
		a1.set("Robert", 910, 3.3); // String, int, double 3���� argument�� ������, name, toeic, gpa ���� �ִ´�.
		a4.set(3.2); // double 1���� argument�� ������, gpa ���� �ִ´�.
		a3.set(880, 3.5);
		
		a1.printAll();
		a2.printAll();
		a3.printAll();
		a4.printAll();
		a5.printAll();
	}
}
*/