package Task;

import java.util.Scanner;

public class TeamProject01 {
	public static void main(String[] args) {

//		I팀
//		1. 업다운문제
//		   초기 숫자 상수로 정하고 숫자 3회 입력
//		     > (상수 > 입력) : up 출력
//		     > (상수 < 입력) : down 출력
	//
		//로직구성
		//1.입력 클래스 import
		//2.변수 선언 int 1개 상수 선언 1개
		//3. 입력 메소드 상수, 변수
//		
//		
//		Scanner sc = new Scanner(System.in);
//		final int NUM = 20;
//		int num1 = 0;
//		System.out.println("초기 숫자를 입력하세요 : " + NUM);
//		
//		num1 = sc.nextInt();
//		
//		for(int = 20; ) {
//			System.out.println("업");
//		}
//			System.out.println("다운");
//		
		
        //1. 로직구성
        //scanner 입력메소드 
		//final로값 상수 지정 -출제자 
		//사용자한테 입력 받는 변수 
		//for문 사용하여 3회 반복문 작성
		//사용자가 보고 입력할 출력 메시지 " 얼마? : "
		//입력 메소드 
		//for문 안에 if~else if~else문 사용하여 출력
		// if(변수 ==상수) 일 경우 반복문 종료 메시지 " 정답 입니다 "
		// else if(num1 > NUM) 경우 다운 출력
		// 그외에 경우 업 출력
		
        Scanner sc = new Scanner(System.in);
        final int NUM = 27;
        int num1 = 0;
        for(int i = 0; i < 3 ; i++) {
           System.out.print("얼마? : " );
           num1 = sc.nextInt();
           if(num1 == NUM) {
        	   System.out.println("정답 입니다");
        	   break;
           }else if(num1 > NUM) {
              System.out.println("다운");
           }else {
              System.out.println("업");
           }
        }

//           System.out.println("정답은 " + NUM + "입니다");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		2. OX 퀴즈 (2문제만 존재함) 
//		   1번 못 맞추면 프로그램 종료
//		         1번 맞추면 2번 문제로 넘어가기
	//
//		1번문제) 아기화장품은 순해서 어른들이 사용해도 괜찮다? 정답 : X
//		2번문제) 독사가 자기 혀를 깨물면 죽는다? 정답 : O
	//
//		(모든 문제를 맞춘 경우)
//		1번문제를 맞힐경우 정답입니다 2번문제로 넘어갑니다 출력
//		2번문제도 맞힐경우 정답입니다 모든 문제를 맞췄습니다. O/X 퀴즈가 종료됩니다. 출력 후 프로그램 종료
	//
//		(1번문제를 틀린인 경우)
//		1번문제를 틀린경우 틀렸습니다. 출력 후 프로그램 종료(다음문제로 넘어가지 않음)
		
		
        //2번 문제 로직
        //Scanner 클래스 생성 import
        //String 변수
        String answer1 = "";
        String answer2 = "";
        //출력메소드 1번문제
        System.out.println("1번문제) 아기화장품은 순해서 어른들이 사용해도 괜찮다? 정답 :");
        //입력 메소드 
        answer1 = sc.next();
        //스트링타입으로 조건문 if 걸어서 조건식 
        if(answer1.equals("X")) {
              //출력메소드 2번문제
              System.out.println("2번문제로 넘어갑니다");
              System.out.println("2번문제) 독사가 자기 혀를 깨물면 죽는다? 정답 : ");
              //입력 메소드
              answer2 = sc.next();
              if(answer2.equals("O")) {
                 System.out.println("모든 문제를 맞췄습니다. O/X 퀴즈가 종료됩니다.");
              }else {
                 System.out.println("2번문제를 틀렸습니다.");
              }
           }else {
              System.out.println("1번문제를 틀렸습니다.");
              
           }
        

     }
     
  }
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
