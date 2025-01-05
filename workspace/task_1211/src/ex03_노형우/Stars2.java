package ex03_노형우;

import java.util.Scanner;

public class Stars2 {
	public static void main(String[] args) {

		// (2) 사용자로부터 행을 입력받아 입력받은 숫자만큼 행으로 직각삼각형 출력
		// 로직구성
		// 입력 클래스 import
		// 행을 입력 받을 변수 선언
		// "숫자를 입력하세요" 메시지 출력
		// 입력 메소드 사용하여 숫자 입력 받기
		// for문 사용해서 입력받은 숫자만큼 직각삼각형 형태로 출력되게 하기

		Scanner sc = new Scanner(System.in);
		int num = 0;
		System.out.println("숫자를 입력하세요 : ");
		num = sc.nextInt();

		for (int i = 0; i < num; i++) {

			for (int j = 0; j < i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
