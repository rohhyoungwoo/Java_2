package task;

import java.util.Scanner;

public class Task3 {
//	3. 사용자로부터 정수를 입력받아, 입력받은 정수가 0에서 100 사이의 값인 경우, 
//	입력받은 정수를 2배한 값을 출력하고, 그 외의 값이 입력될 경우 
//	"잘못된 입력입니다"라는 예외 메시지를 출력하세요.
	
	//로직구성
	//입력 클래스, 오류 클래스 import
	//입력되는 정수가 0~100 사이인경우 입력받은 정수에 2배한 값 출력되는 메소드 생성
	//입력받을 정수 선언, 입력 메소드 호출
	//if문 사용
	//Exception 예외처리
	//try-catch문사용
	
	public static void main(String[] args) {
	
		try {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요 : ");
		int num = sc.nextInt();
		
//		static void method1() {
			
		if(num >= 0 && num <= 100) {
			num = num*2;
			System.out.println("입력받은 정수의 2배한 값 : " + num);
		
		}else 
				throw new Exception("잘못된 입력입니다");
		} catch (Exception e) {
				System.out.println("에러 메시지 : " + e.getMessage());
//				e.printStackTrace(); // 빨간색에러메시지 출력
			}
}
}
//		sc.close();

//		}
	
		
			
//		}
	
	
	
	
	
	

