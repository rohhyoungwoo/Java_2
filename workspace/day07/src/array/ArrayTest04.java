package array;

import java.util.Scanner;

public class ArrayTest04 {
   public static void main(String[] args) {
      // 1. 1부터 10까지의 값을 배열에 넣고 출력
      // 1) 배열 선언 및 생성 => 값을 알 때
//      int[] number1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
//      int[] number2 = { 1, 2, 3, 4, 5 };

      // 배열명.length : 배열의 길이, 배열의 길이에서 -1이 인덱스 끝 번호

//      //2) 배열의 출력
//      for(int i = 0; i < number1.length; i++) {
//         System.out.println(number1[i]);
//      }
//      
//      for(int i = 0; i < number2.length; i++) {
//         System.out.println(number2[i]);
//      }

      // 1. 1부터 10까지의 값을 배열에 넣고 출력
      // 1) 배열 선언 및 생성(값을 모를 때)
      int[] number3 = new int[5]; // 10칸짜리 배열을 생성하면 인덱스번호는 0~9까지
      // 2) for문(초기식 int i = 0 (인덱스 번호는 0부터 시작);
      // 조건식 i < 배열명.length; (배열의 길이보다 작을 동안 반복)
      // 증감식 i++){
      // 3) 값 대입 배열명[i] = i + 1;
      // 4) 출력 배열명[i] }
//      number3[0] = 1;
//      number3[1] = 2;
//      number3[2] = 3;
//      number3[3] = 4;
//      number3[4] = 5;
//      number3[5] = 6;
//      number3[6] = 7;
//      number3[7] = 8;
//      number3[8] = 9;
//      number3[9] = 10;
//
//      for (int i = 0; i < number3.length; i++) {
//         number3[i] = i + 1;
//      }
     Scanner sc = new Scanner(System.in);
      for (int i = 0; i < number3.length; i++) {
    	  int num = sc.nextInt();
    	  number3[i] = num;
    	  System.out.println(number3[i]);
      }

//      for (int i = 0; i < number3.length; i++) {
//         System.out.println(number3[i]);
//      }

//      System.out.println(number3); //참조값
//      System.out.println(number3[0]);
//      System.out.println(number3[9]);

      // 5부터 1까지의 값을 배열에 담고 출력하기
      // 조건1) 칸수를 알 때로 선언한다
      // 조건2) 값을 대입하는 반복문, 값을 출력하는 반복문을 따로 작성한다

      // 로직구성
      // 1) 배열 선언
      // 2) 값을 대입하는 반복문(for문)
      // 초기식 => int i = 0;
      // 조건식 => i < 배열명.length;
      // 증감식 => i++ {
      // 3) 값을 출력하는 반복문(for문)

//      int[] ar1 = new int[5];
//
//      for (int i = 0; i < ar1.length; i++) {
//         ar1[4 - i] = i + 1;
//         ar1[i] = 5 - i;
//      }
//
//      for (int i = 0; i < ar1.length; i++) {
//         System.out.println(ar1[i]);
//      }
//
//      // 2번째방법) 초기식을 5로 시작
//      // int i = 5;
//      // i > 5 - 배열명.length; //5
//      // i--
//      for (int i = 5; i > (5 - ar1.length); i--) {
//         ar1[5 - i] = i;
//      }
//      // i = 5; 5 > 5 - 5; t i-- i = 4
//      // i = 4; 4 > 5 - 5; t i-- i = 3
//      // i = 3; 3 > 5 - 5; t i-- i = 2
//      // i = 2; 2 > 0; t i-- i =1
//      // i = 1; 1 > 0; t i-- i = 0
//      // i = 0; 0 > 0; f
//
//      // 배열의 값 출력(0번째부터 순서대로 출력)
////      System.out.println();
//      for (int i = 0; i < ar1.length; i++) {
//         System.out.println(ar1[i]);
//      }
//
//      // 초기식 int i = 5;
//      // 조건식 i > 5 - ar1.length;
//      // 증감식 i--
//      // 출력 ar1[5 - i]
////      for (int i = 5; i > 5 - ar1.length; i--) {
////         System.out.println(ar1[5 - i]);
////      }
//      
//      //빠른 for문
//      for(int data : ar1) {
//    	  System.out.println("값 : " + data);
//      }
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
   }
}
