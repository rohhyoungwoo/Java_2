package TwoForTest;

import java.util.Scanner;

public class TwoForTest03 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int chocie = 0;
		System.out.println("숫자 입력 : ");
		chocie = sc.nextInt();
		
		
		for(int i =1; i <= 3; i++) {
//			System.out.println("*"); //행		
			for(int j =1; j <= i; j++) { //열
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
