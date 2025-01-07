package task;

import java.util.Scanner;

public class Task2 {
//	2. 문자열을 입력받아, 입력받은 문자열을 정수로 변환하여 출력하는 프로그램을 작성하세요. 
//	만약 입력받은 문자열이 숫자가 아닐 경우, NumberFormatException 예외가 발생하게 되며, 
//	"숫자가 아닌 문자열이 입력되었습니다"라는 메시지를 출력하세요.

	// 로직구성
	// 스캐너, 오류처리 import
	// 문자열을 정수로 변환하는 메소드 생성
	// String타입 변수 선언
	// 숫자를 입력하세요 출력, 문자열로 입력받기
	// try-catch문 사용
	// throw new NumberFormatException
	// 예외 발생 시 "숫자가 아닌 문자열이 입력되었습니다" 출력

	static void method1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요 : ");
		String number = sc.next();
		int num1 = Integer.parseInt(number);
		if (num1 >= 0) {
			System.out.println("입력받은 숫자 : " + num1);
		} else {
			throw new NumberFormatException();
		}
	}

	public static void main(String[] args) {
		try {
			method1();
		} catch (Exception e) {
			System.out.println("숫자가 아닌 문자열이 입력되었습니다");
		}
	}

}