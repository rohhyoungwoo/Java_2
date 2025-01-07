//노형우
package task;

public class ForTask01 {
	public static void main(String[] args) {
		// 1. 1 ~ 100까지 출력 tab키만큼 간격 띄우고 10마다 줄바꿈
		// 1 2 3 4 5 6 7 8 9 10
		// 11 12 13.. 20
		// 21 22 ...... 30
		// 91 ... 100

		// 로직구성
		//
		// 1. 갑을 출력하는 반복문 사용 (for문)
		// 2. 10씩 증가하는 값이 나올때 + 줄바꿈 해줄 수 있는 반복문 사용
		// i = i*10 i++
		// 3. 1 ~ 100까지 tab키만큼 간격 띄우고 출력하는 반복문 사용
		// 초기식 int i = 1;
		// 조건식 i < 101;
		// 증감식 i++
		// 4. 1 ~ 100까지 tab키만큼 간격을 띄우고 출력하는데 10단위로 줄바꿈 사용할 if문사용
		// 4. 출력

//		int[] num = new int[100];
//		for(int i = 1; i <= 10; i++) {
//			
//			System.out.println(i*10);
//		}
//		for(int i = 1; i < 101; i++) {
//			System.out.printf("%d\t", i);
//			if(i % 10 == 0) {
//				System.out.printf("\n");
//			}
//		}

		// 2. A~F출력
		
		//출력 메소드
		//문자형 정수형의 형변환
		//for문 범위가 정해져있기때문에
		
		int a = 'A';
		int f = 'F';
		char num = 65;
		System.out.println(num);
//System.out.println(f);
		// 로직구성
		// 1. 변수 int a = 'A' 사용
		// 2. 아스키 코드 a = 65
		// 3. A~F = 65~70 까지의 숫자를 아스키 코드로 출력

		for(int i =0; i < 3; i++) { //for(초기식
			for (int j=0; j <3-i; j++) {
				System.out.print(" ");
			}
			for(int k = 0; k<(2*i)+1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for (int i = a; i <= f; i++) {
			System.out.println((char)i);
		}

//		//3. aBcDeFgHiJkLmNPqRsTuVwXyZ 출력
//		int i = 0;

		// 4.1) 1부터 100까지 숫자 중 3의 배수 또는 5의 배수만 한 줄에 5개씩 띄어쓰기로 구분되도록 출력
		// 2) 3의 배수 또는 5의 배수 숫자들의 합을 구하기

	}
}
