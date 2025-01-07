package Team;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Team01 {
	public static void main(String[] args) {
//		Team01. = new Team01();
//Team01.class
//		insertValue(int[0][0]);
		Scanner sc = new Scanner(System.in);
		System.out.println("두 수를 띄어쓰기로 구분해서 입력하세요 : ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int[][] ar1;
		ar1 = new int[10][10];
		Team01 iv = new Team01();
//		iv.insertValue(ar1);
//		System.out.println(ar1[0][0]);
//		iv.findMultiple(num1);
		System.out.println(iv.findMultiple(num1)+iv.findMultiple(num2));
		
		
		
	}
	//로직구성


		  //1번 배수들의 여러 값 구하기
	      
	      //스캐너 클래스 생성
	      //1~100까지의 수만 입력받아서 출력
	      //메소드에서 2차원배열 구성
	      //메인에서 입력받은 수들의 배수를 구해야합 겹치는 배수는 빼고
	      //배수들의 총 합을 메소드로 구현해서 출력
	      //배수들의 평균을 위에 총합 메소드명을 같이 써서 메소드 오버로딩을 통해 출력 (소수점 2번째 자리까지)
	      
		
		
		//2차원배열 값 저장 (1~100) 메소드
		int insertValue(int[][] ar1) {
		int value = 1;
		for(int i = 0; i < ar1.length; i++) {
			for(int j = 0; j < ar1[i].length; j++) {
					ar1[i][j] = value++;
			}
		}
		return count++;
	}
//		System.out.print(ar[i][j]);		
		//				int count = 1;
//				int[i][j]num = int count++;
//				System.out.println("i = " + i + "j = " + j);
//				System.out.println(ar1[i][j]);
		
		//배수의 개수 구하는 메소드
		int findMultiple(int num) {
			
		}
		
		//합을 구하는 메소드
		int findValue(int num1, int num2) {
			int sum = num1 + num2;
		
			
			
			return sum;
		}
		//평균을 구하는 메소드
		int findValue(int num1, int num2) {
			
		}
		
		
		
//	for(int[] i : ar) {
//		for(int data : i) {
//			System.out.println(data);
//		}
//	}
//		
		
	      
	      //2번 10 -> 2진수 변환기
	      
	      //스캐너 클래스 생성
	      //0~15범위 밖의 숫자를 입력받을 시 재입력받기
	      //for문을 통해서 10진수를 2진수로 변환
	      //메소드로 0출력 코드 , 1출력 코드 
	      
	      
	      //3번 교통비 청구서
	      
	      //상수 지정해서 택시, 버스, 지하철 가격을 지정
	      //스캐너클래스 생성
	      //"한달간~" 출력메시지
	      //한달간 대중교통을 탄 것을 스캐너클래스로 입력받는다
	      //if문을 대입해서 입금한 금액보다 적은 돈으로 대중교통을 이용 했으면 잔액표시
	      //입금한 금액보다 더 많은 돈을 사용 했다면 입금한 돈을 다 차감하고 다음달로 이월

//		final int TAXI = 5000;
//		final int BUS = 1500;
//		final int SUBWAY = 1200;
////		Scanner sc = new Scanner(System.in);
//		System.out.println("충전한 금액을 입력하세요");
//		int money = sc.nextInt();
//		System.out.println("한달간 택시, 버스, 지하철 이용횟수를 각각 입력하세요");
//		int num1 = sc.nextInt();
//		int num2 = sc.nextInt();
//		int num3 = sc.nextInt();
//		int pay = ((TAXI*num1)+(BUS*num2)+(SUBWAY*num3));
//
//		System.out.println("택시 : " + num1 + "번, 버스 : " + num2 + "번, 지하철 : " + num3 + "번");
//		//택시
//	if(money >= pay) {
//		System.out.printf("이번 달 교통대금은 %d원 입니다. 잔액은%d입니다" , pay,(money-pay));
//	}else {
//		System.err.printf("충전금액을 초과했습니다. 다음달 청구 금액은 %d원 입니다.", pay-money );
//	}
	
	
	

}