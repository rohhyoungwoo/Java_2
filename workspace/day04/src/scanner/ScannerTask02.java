package scanner;

import java.util.Scanner;

//7번 : 입력메소드 실습
public class ScannerTask02 {
	public static void main(String[] args) {
		// 1. 사용자로부터 세 개의 숫자를 입력받아 합을 출력하는 프로그램
		// - 세개의 숫자를 각각 입력받기
		// - 세 숫자의 합을 계산하여 출력
		// - 세 숫자의 합은 00입니다 형식으로 출력하기
		
		Scanner sc = new Scanner(System.in);
		//1. 변수 선언(int)
		//2. 입력 클래스
		//3. 출력 메시지
		//4. 변수 .nextInt()
		//5. 출력 메시지
		//6. 변수 .nextInt()
		//7. 출력 메시지
		//8. 변수 .nextInt()
		//9. 출력 (세 숫자의 합은 00입니다)
		
//		int num1 = 0, num2 = 0, num3 = 0;
//		System.out.print("숫자 1 : 입력 ");
//		num1 = sc.nextInt();
//		System.out.print("숫자 2 : 입력 ");
//		num2 = sc.nextInt();
//		System.out.print("숫자 3 : 입력 ");
//		num3 = sc.nextInt();
//		System.out.println("세 숫자의 합은 " + (num1 + num2 + num3) + "입니다");
//		
		
		//2. 사용자로부터 일어난 시간(정수), 아침, 점심, 저녁에 할 일과 잠들 시간(정수)을 입력받아 출력하기
		// - 아침, 점심, 저녁에 할 일과 잠들 시간을 각각 입력받기
		// - 순서대로 입력받고 출력할것
		// - 출력 형식
		// 오늘 일어난 시간은 00시이고 잠들 시간은 00시 입니다
		// 아침 : 00하기
		// 점심 : 00하기
		// 저녁 : 00하기
		
		//1. 변수 선언 (일어난 시간, 잠들 시간 int), (아침, 점심, 저녁 String)
		//2. 입력클래스
		//3. 출력 메시지 일어난 시간(정수)
		//4. 입력메소드 .nextInt
		//5. 출력 메시지 아침 : 00하기
		//6. 입력메소드 .nextString
		//7. 출력 메시지 점심 : 00하기
		//8. 입력메소드 .nextString
		//9. 출력 메시지 저녁 : 00하기
		//10. 입력메소드 .nextString
		//11. 출력 메시지 잠들 시간(정수)
		//12. 입력메소드 .nextInt
		//13. 출력(오늘 일어난 시간은 00시이고 잠들 시간은 00시 입니다
		
		int wakeup = 0, sleep = 0;
//		String morning = "", launch = "", dinner = "";
		
//		System.out.print("일어난 시간 : ");
//		wakeup = sc.nextInt();
//		System.out.print("아침 : ");
//		String morning = sc.next();
//		System.out.print("점심 : ");
//		String launch = sc.next();
//		System.out.print("저녁 : ");
//		String dinner = sc.next();
//		System.out.print("잠들 시간 : ");
//		sleep = sc.nextInt();
//		
//		System.out.println("오늘 일어난 시간은 " + wakeup + "시이고 잠들 시간은 " + sleep + "시 입니다");
//		System.out.printf("아침 : %s하기\n점심 : %s하기\n 저녁 : %s하기", morning, launch, dinner);
		
		
		//3. 물건가격이 10000원이다. 사용자로부터 지불금액을 입력받아 거스름돈을 계산하기(뺄셈 - 이용)
		// 물건 가격은 10000원입니다 
		// 지불가격을 입력하세요 : 00
		// 거스름돈은 3000원입니다
		
		//1. 변수 선언(int)
		//2. 출력 메시지 (지불가격을 입력하세요 : )
		//3. 입력메소드 sc.nextInt();
		//4. 출력
		
		final int price1 = 10000;
		int price2 = 0;
		System.out.print("지불가격을 입력하세요 : ");
		price2 = sc.nextInt();
		System.out.printf("거스름돈은 %d원입니다", price2 - price1);
		
		
		
		
	}
}
