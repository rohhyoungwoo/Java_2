package ex01_노형우;

import java.util.Scanner;

public class InputNumber {
	public static void main(String[] args) {
//	1. 사용자로부터 3개의 정수를 입력받아 아래 요구사항대로 구현하라
//		- 클래스명 : InputNumber
//		- 배열은 사용하면 안된다
//		1) 최소값과 최대값 출력
//		2) 5개 숫자의 평균을 소수점 2자리까지 출력
		
		//로직구성
		//1. 입력 받기 위해 입력 클래스 import
		//2. 입력 받을 정수형 변수를 3개 선언한다
		//3. 숫자 3개의 평균값을 저장해줄 실수형 변수 1개를 선언한다
		//4. 출력메소드를 이용하여 입력 하라는 메시지를 출력한다 (3개의 정수를 입력하세요(띄어쓰기로 구분) :)
		//5. 입력 메소드를 사용한다 (sc.nextInt();)
		//6. 입력한 숫자 3개의 최소값과 최대값을 구한다 (삼항연산자, if문(?))
		//삼항연산자 = num1 > num2 ? (true일때값) : (false일때값);
		//7. 입력 클래스 종료
		
		Scanner sc = new Scanner(System.in);
		int num1, num2, num3 = 0;
		double avg = 0;
		System.out.println("3개의 정수를 입력하세요(띄어쓰기로 구분) : ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();
		
		int max = ((num1 > num2) && (num1 > num3)) ? num1 : ((num2 < num3)? num3 : num2);
		int min = ((num1 < num2) && (num1 < num3)) ? num1 : ((num2 < num3) ? num2 : num3);
		System.out.println("최소값 : " + min);
		System.out.println("최대값 : " + max);
		avg = (num1 + num2 + num3)/3;
		System.out.printf("평균 : %.2f", avg);
		sc.close();
		
		
	}
}
