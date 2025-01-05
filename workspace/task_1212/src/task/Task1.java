package task;

import java.util.InputMismatchException;
import java.util.Scanner;

//java.util.InputMismatchException
public class Task1 {
//	1. 숫자를 입력받아 1부터 입력받은 숫자까지의 합을 출력하는 프로그램을 만드세요. 
//	그리고 숫자가 아닌 값이 입력될 경우 "잘못된 입력입니다"라는 예외 메시지를 출력하고, 
//	프로그램을 종료하세요.

	// 스캐너 클래스, 오류 처리 import
	// 변수 선언 int num = 0;
	// (try catch, throw) 사용하여 1부터 입력받은 숫자끼리의 합을 출력하는 메소드;
	// for문 사용
	// if( num >= 1){
	//
	// }else ->
	// syso("잘못된 입력입니다")
	static void method1() throws NumberFormatException {
		System.out.println("숫자를 입력하세요 : ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int sum = 0;
		if (num > 0) {
			for (int i = 0; i <= num; i++) {
				sum += i;
			}
			System.out.println("1부터" + num + " 까지의 숫자의 합 : " + sum);
		} else {
			throw new InputMismatchException();
		}
	}

	public static void main(String[] args) {

		try {
			method1();
		} catch (InputMismatchException e) {
			System.out.println("잘못된 입력입니다");
		}

	}

}