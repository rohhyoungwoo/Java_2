package scanner;

import java.util.Scanner;

//4번 : 입력메소드 연습
public class ScannerTest04 {
	public static void main(String[] args) {
		
		//사용자로부터 주소를 입력받아 출력하기
		//3개의 next 메소드를 사용하며 서울시 강남구 역삼동으로 출력될 수 있도록 할 것
		
		//1. 입력클래스 import
		Scanner sc = new Scanner(System.in);
		//2. 출력 메시지(1번)
		System.out.println("주소 입력 : ");
		//3. 입력메소드(.next()) 3개
		String city = sc.next();	//입력값을 공백단위로 나누어서 처리한다
		String district = sc.next();
		String neighborhood = sc.next();
		//4. 출력
		System.out.println("입력한 주소는 " + city + " " + district + " " + neighborhood + "입니다");
		//5. Scanner 자원 해제
		sc.close();
		
	}
}
