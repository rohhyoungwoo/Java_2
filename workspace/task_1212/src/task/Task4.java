package task;

import java.util.InputMismatchException;
import java.util.Scanner;

//java.util.InputMismatchException

public class Task4 {
//	4. 사용자로부터 숫자를 입력받아, 입력받은 숫자가 3의 배수인 경우 "Fizz", 
//	5의 배수인 경우 "Buzz", 3과 5의 공배수인 경우 "FizzBuzz", 
//	그 외의 경우에는 입력받은 숫자를 출력하는 프로그램을 작성하세요. 
//	사용자가 문자열을 입력할 경우, "숫자가 아닌 문자열이 입력되었습니다"라는 예외 메시지를 출력하세요.

	// 로직구성
	// 스캐너 클래스 import
	// 변수 num 선언
	// 문자열 입력시 예외 메시지 출력
	// if문 사용
	// 공배수를 구하는 메소드 생성?
	// try catch사용 예외 메시지 출력 Exception
	public static void main(String[] args) {
		try {

			Scanner sc = new Scanner(System.in);
			System.out.println("숫자를 입력하세요 : ");
			int num = sc.nextInt();

			if ((num % 15 == 0)) {
				System.out.println("FizzBuzz");
			} else if (num % 5 == 0) {
				System.out.println("Buzz");
			} else if (num % 3 == 0) {
				System.out.println("Fizz");
			} else if (num >= 0) {
				System.out.println("입력된 숫자 : " + num);
			} else {

				throw new InputMismatchException();
			}
		} catch (InputMismatchException e) {
			System.out.println("숫자가 아닌 문자열이 입력되었습니다");
//			e.printStackTrace();
		}
	}

}
