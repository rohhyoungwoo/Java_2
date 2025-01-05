package oper;

import java.util.Scanner;

public class OperTask01 {
	public static void main(String[] args) {
		//정수 2개를 입력받아서 큰 수 출력하기 (삼항 연산자 이용)
		
		//1. 변수선언 int 2개, boolean 1개
		//2. 입력 클래스
		//3. 입력 메시지 출력
		//4. 입력 메소드 sc.nextInt()
		//5. 변수 삼항 연산자를 결과 대입(true, false)
		//6. 출력
		
		Scanner sc = new Scanner(System.in);
		int num1 = 0, num2 =0;
		String result = "";
		System.out.println("정수1 입력: ");
		num1 = sc.nextInt();
		System.out.println("정수2 입력: ");
		num2 = sc.nextInt();
		
//		result = 조건식 ? 참일 때의 값 : 거짓일 떄의 값;
//		result = num1 > num2 && num1 != num2 ? num1 : num2;
		result = num1 > num2 ? "큰 수는 : " + num1 == num2 ? "두수는 같습니다" : "수는 : " + num2;
		System.out.println(result);
		
		
	}
}
