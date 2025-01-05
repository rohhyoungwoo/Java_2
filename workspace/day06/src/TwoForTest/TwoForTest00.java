package TwoForTest;

import java.nio.file.spi.FileSystemProvider;
import java.util.Scanner;

public class TwoForTest00 {
	public static void main(String[] args) {
		// 문제
		// 1. 점심메뉴를 보여준다.
		// 1-1. 메뉴 4개이다.
		// 1-2. 짜장(5000원) 돈까스(8000원) 피자(25000원) 햄버거(6000원)
		// 1-3. 4개의 메뉴중에 하나 입력시 가격과 메뉴 메시지 출력
		// 단, 문자열 비교시 ==이 아닌 equals를 활용할것
		// + 문제 while문을 활용한 동일한 값이 아닐 때 재입력을 통해 올바른 값이 나오게끔 진행

		// 로직구성
		// 1. 입력 클래스 import
		// 2. 가격 변수 선언과 초기화 int 4개
		// 3. 메뉴 입력을 위한 변수 String 1개
		// 4. 입력 메소드 sc.next();
		// 5. if문 사용 (equals 활용)
		// 문자열이 같을 시 가격 출력
		// + while문을 활용하여 동일한 값이 아닐 때 재입력을 나오게 출력

		Scanner sc = new Scanner(System.in);
		int food1 = 5000;
		int food2 = 8000;
		int food3 = 25000;
		int food4 = 6000;
		String menu = "";

		System.out.println("점심 메뉴 : 짜장, 돈까스, 피자, 햄버거");
		menu = sc.next();

		while (("짜장".equals(menu) || "돈까스".equals(menu) || "피자".equals(menu) || "햄버거".equals(menu)) == false) {
			// 거짓일시 재입력을 실행시키기위한 논리연산 진행
			System.out.println("재입력 : ");
			menu = sc.next();
		}
		if ("짜장".equals(menu)) {
			System.out.println(menu + ":" + food1);
		} else if ("돈까스".equals(menu)) {
			System.out.println(menu + ":" + food2);
		} else if ("피자".equals(menu)) {
			System.out.println(menu + ":" + food3);
		} else if ("햄버거".equals(menu)) {
			System.out.println(menu + ":" + food4);
		}

		// 먼저 Scanner 클래스를 import한다
		// A라는 문자를 입력 받으면 종료를 하고 싶어 출력 메시지로 A의 아스키코드인 65를 미리 알려준다
		// 출력 메시지를 통해 알고싶은 문자를 입력 해달라고 한다
		// Scanner를 통해 사용자로부터 원하는 문자를 입력받는다
		// 입력받는 문자를 아스키코드로 변환
		// 변환받은 값을 출력해 주고
		// 반복문을 사용해 사용자에게 다시 문자를 입력 받을 수 있게 출력메시지와 scanner를 통해 입력을 받음 물론 A를 입력 받으면 실행 종료
		// 사용자가 A라는 문자를 입력하지 않으면 반복문을 통해 계속 자신이 알고싶어하는 문자의 아스키코드를 알 수 있음.

		
		//로직구성
		//1. 입력 클래스 import
		//2. 출력 메시지 입력 "아스키 코드를 알고 싶은 문자 입력(A입력시 종료) : "
		//3. 입력 메소드 입력받는 문자를 아스키코드로 - 문자열 -> 문자형 -> 정수형 (형변환)
		//4. while문 사용
		//""다른 문자일 경우 다시 입력 받을 수 있는 출력메시지와 입력 메소드 입력 ,  "A"일 경우 종료
		
//	      Scanner sc = new Scanner(System.in);
		System.out.println("A의 아스키코드는 65입니다");
		System.out.print("아스키 코드를 알고 싶은 문자 입력(A입력시 종료) : ");
		
		String ch1 = sc.next();
		char ch2 = ch1.charAt(0);
		
//		char ch = sc.nextLine().charAt(0);
		int num1 = (int) ch2;

		while (ch2 != 'A') {
			System.out.println("입력하신 문자" + ch2 + "의 아스키 코드는 : " + num1);
			System.out.print("아스키 코드를 알고 싶은 문자 입력(A입력시 종료) : ");

//		ch = sc.nextLine().charAt(0);
		ch1 = sc.next();
		ch2 = ch1.charAt(0);
		num1 = (int) ch2;
		

		}

	}
}
