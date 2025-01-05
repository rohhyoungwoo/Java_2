package scanner;
//1번 : 입력 클래스(Scanner)

import java.util.Scanner;

public class ScannerTest01 {
	public static void main(String[] args) {
		
//		System.out.println();
		
//		String name = "노형우";
		
		//자동 import 단축키 : ctrl + shift + s + o
		Scanner sc = new Scanner(System.in);
		System.out.println("이름 입력 :");
		String name = sc.next(); //next() 메소드는 입력을 받고 받은 값을 String 타입으로 가져오는 기능을 한다
		System.out.println(name);
		System.out.println("오늘 날짜 입력 : ");
		String date = sc.next();
		System.out.println(date);
		
		
	}
}
