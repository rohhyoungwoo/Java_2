package task;

import java.util.Scanner;

public class Team03 {
	public static void main(String[] args) {
		Team03 mt = new Team03();
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.println("국어, 수학, 역사의 점수를 입력 : ");
		int kor = sc.nextInt();
		int math = sc.nextInt();
		int history = sc.nextInt();
		int[] score = {kor, math, history};
		System.out.println("score");
		System.out.println(mt.grade(score));
		System.out.printf("%.2f" , mt.avg(mt.grade(score)));
		
	}
	//입력한 3개과목 점수의 총점과 평균을 구하시오.
	//* 조건1 3과목의 점수를 입력 받아 배열로 
	//로직구성
	//입력 클래스 import
	//과목의 점수를 입력하세요 메시지 출력
	//
	//학점의 합을 구하는 메소드
	//학점의 합 gradeSum 메소드	
	//학점의 평균을 구하는 메소드
	//학점의 평균 gradeAvg 메소드
	//입력 클래스 import, 입력 메소드, 출력 메소드, 
	
	//  4.5
		
	
	
	
	int grade(int[] arr) {
		
		int totalSum = 0;
		for(int data : arr) {
			totalSum+=data;
		}
		return totalSum;
	}
		
	double avg(double num) {
		
			double totalAvg = num/3;
			return totalAvg;
		}
	}