package Team;

import java.util.Scanner;

public class Task01 {
	public static void main(String[] args) {
		Task01 mt = new Task01();
		Scanner sc = new Scanner(System.in);

		// 1번 배수들의 여러 값 구하기

		// 스캐너,메소드 클래스 생성
		// 1~100까지의 수만 입력받아서 출력
		// 메소드에서 2차원배열 값을 받는다
		// 메인에서 입력받은 수들의 배수의 갯수를 구하는 메소드를 구성한다. 단, 겹치는 배수는 제외.
		// 배수들의 총 합과 평균을 메소드로 구현해서 출력
		
		// 1번문제 답
		int[][] ar = new int[10][10];
		mt.insertValue(ar);

		System.out.println("두 수를 띄어쓰기로 구분해서 입력하시오 : ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		while (!((0 < num1 && num1 < 101) && (0 < num2 && num2 < 101))) {
			System.out.println("1부터 100사이의 값을 입력하세요");
			num1 = sc.nextInt();
			num2 = sc.nextInt();
		}
		System.out.print(num1 + "과 " + num2 + "의 배수는 총 : " + mt.findMultiple(num1, num2, ar) + "개 이고");
		mt.findValue(num1, num2, ar, mt.findMultiple(num1, num2, ar));
	}
	// 1번문제 메소드들
	void insertValue(int[][] ar1) {
		int value = 1;
		for(int i = 0; i < ar1.length; i++) {
			for(int j = 0; j < ar1[i].length; j++) {
					ar1[i][j] = value++;
			}
		}
	
	}

	int findMultiple(int num1, int num2, int ar[][]) {
		int multi = 0;
		int num3 = 0;//num3은 최소공배수 

		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				if (((ar[i][j] % num1) == 0) && (ar[i][j] % num2) == 0) {
					num3 = ar[i][j];
					break;
					// i = 1 j = 5 / 15 = 3 5 최소공배수 j 를 보지 않겟다
				}
			}
			if (num3 != 0) {
				break;
			}
		}

		multi = (100 / num1) + (100 / num2) - (100 / num3);

		return multi;
	}

	void findValue(int num1, int num2, int ar[][], int num3) {
		int sum = 0;
		double total = 0;
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[i].length; j++) {
				if (((ar[i][j] % num1) == 0) || ((ar[i][j] % num2) == 0)) {
					sum += ar[i][j];
				}
			}
		}
		total = (double) sum / num3;
		System.out.printf(", 합은 : " + sum + ", 평균은 %.2f 입니다.", total);
	}
 
}
