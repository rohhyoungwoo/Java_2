package task;

import java.util.Scanner;

public class Team02 {
	 public static void main(String[] args) {

	      Team02 mt = new Team02();
	      Scanner sc = new Scanner(System.in);
	      System.out.print("행과 열을 입력 : ");
	      int row = sc.nextInt();
	      int col = sc.nextInt();

	      mt.twoArray(row, col);
	   }

	   // 문제 배운 내용을 토대로 작성

	   // 입력받은 정수로 2차원 배열을 만들고, 마지막칸에는 입력받은 숫자가 곱해져서 나와야한다
	   // 매개변수 o 리턴타입x
	   // 메소드명 : twoArray

	   // main
	   // 메소드 클래스 호출
	   // 스캐너 클래스 호출
	   // 출력 (행과 열 입력: )
	   // 스캐너 메소드를 선언 및 초기화
	   // 매개변수o, 리턴타입x 이므로 출력메소드를 사용하지 않고
	   // 메소드클래스 변수명.메소드명(정수 행, 정수 열);
	   
	   // 선언부
	   // 리턴타입 : void
	   // 메소드명 : twoArray
	   // 매개변수 : int num1, int num2

	   // 구현부
	   // for문 (int i = 0; i < num ; i++)
	   //    for(int j =0; k < num; j++)
	   //       if 조건문 -> 열의 마지막 칸이 참일때
	   //         if조건문 -> 행의 마지막 칸이 참일 때
	   //            매개변수의 값을 곱해서 마지막 칸에 print로 출력
	   //         else
	   //            배열 기호 출력
	   //      else 
	   //         배열 기호 출력
	   //   for문이 끝나면 줄바꿈
	   
	   

	   void twoArray(int num1, int num2) {
	      int num3 = 0;
	      for (int i = 0; i < num1; i++) {
	         for (int j = 0; j < num2; j++) {

	            if ((j == num2 - 1)) {
	               if((i == num1 - 1)) {
	                  System.out.println("[" + (num1 * num2) + "]");
	               }else {
	                  System.out.print("[] ");
	                  
	               }

	            } else {
	               System.out.print("[] ");

	               
	            }

	         }
	         System.out.println();

	      }

	   }
}
  