package task;

import java.util.Scanner;

public class MethodTask {
   public static void main(String[] args) {
      // 1. 음수를 양수로, 양수를 음수로 바꿔주는 메소드
      // 매개변수o, 리턴값o
      // 메소드명 : changeSign

	   
	   
      // 2. 이름과 정수를 받아와서 정수만큼 이름을 출력하는 메소드
      // 매개변수 o, 리턴값 o
      // 메소드명 : printName

	   
	   
	   
      // 3. 10이하의 숫자는 1로 10을 초과하는 숫자는 100으로 반환하는 메소드
      // 매개변수o, 리턴값o
      // 메소드명 : changeNumber

      // 4. 5개의 정수중 평균을 반환하는 메소드
      // 매개변수o(배열), 리턴값o
      // 메소드명 getAvg

      // 5. 정수 배열 중 최대값과 최소값을 출력하는 메소드
      // 매개변수o(배열),리턴값 x
      // 메소드명 printMinMax

      // 6. 소문자는 대문자로, 대문자는 소문자로 바꿔주는 메소드
      // BaNanA -> bAnANa
      // 메소드명 : changeCase
      // 매개변수와 리턴값 자유 => 단, 형변환 이용할 것

      // 7. 아이디와 비밀번호를 입력받아 로그인하기
      // 매개변수 o, 리턴값 o(boolean 타입)
      // 메소드명 : login
      // main메소드에서 id가 admin이고 비밀번호가 1234이면 관리자님 환영합니다 출력
      // 둘 중 하나라도 틀리면 잘못입력했습니다 출력

//   }
   //1.로직구성
   //매개변수o, 리턴값o 메소드
   //메소드명 :changeSign
   //음수를 양수로, 양수를 음수로 바꿔주는 메소드
   Scanner sc = new Scanner(System.in);
//   
//   double changeSign(double num) {
//	   System.out.println(num);
//	   double number = 0;
//	   double change = 0;
////	   double change1 = 0;
//	   System.out.println("숫자 입력 : ");
//	   number = sc.nextDouble();
//	   if(number >= 0) {
//		  number -= number*2;
//		  System.out.println("음수 -> 양수");
//	   }else(number < 0){
//		   number = number*2;
//		   System.out.println("양수 -> 음수");
	   }
	   //2.로직구성
   		//입력 클래스 import
	   //이름 변수, 정수 변수
	   //출력 메소드, 입력 메소드
	   // 메소드명 printName
	   void printName(int num) {
		   System.out.println(num);
		   int number = 0;
		   String name = "";
		   name = sc.next();
		   
		   for(int i = 1; i <=num; i++) {
			   
		   }
	   }

		   
   }

