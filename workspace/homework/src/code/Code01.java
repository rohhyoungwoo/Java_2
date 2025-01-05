package code;

import java.util.Scanner;

public class Code01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		int num = 0;
//		System.out.println("입력 : ");
//		num = sc.nextInt();
//		if(num%2 == 0) {
//			System.out.println("출력 : 짝수입니다");
//		}else {
//			System.out.println("출력 : 홀수입니다");
//		}
		
		
//		int sum = 0;
//		for(int i = 0; i <= 100; i++) {
//		if(i%2 == 0) {
//			sum += i;
//		}
//		}
//		System.out.println(sum);
//		int num, num1 = 0;
//		System.out.println("두 수를 입력하세요(띄어쓰기로 구분) : ");
//		num = sc.nextInt();
//		num1= sc.nextInt();
//		System.out.println(num < num1 ? num1 : num);
		
		
		//입력클래스
//		int num = 0;
//		System.out.println("정수를 입력하세요 : ");
//		int num = sc.nextInt();
//		if(num == 0) {
//			System.out.println("출력 : 0입니다.");
//		}else if(num > 0) {
//			System.out.println("출력 : 양수입니다");
//		}else {
//			System.out.println("출력 : 음수입니다");
//		}
		
		int[][] arr = new int[10][10];
	      int count = 1;
	      for (int i = 0; i < arr.length; i++) {
	         for (int j = 0; j < arr[i].length; j++) {

	            arr[i][j] = count++;
	         }
	      }

	      for (int[] data : arr) {
	         for (int data1 : data) {

	            System.out.print(data1);
	            System.out.print("\t");
	         }
	         System.out.println();
	      }

	
	      
	      
	      
	      
	      
	      
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
