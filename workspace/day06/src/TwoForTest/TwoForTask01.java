package TwoForTest;

public class TwoForTask01 {
	public static void main(String[] args) {
//		i, j의 규칙성 찾기
		
		
//		1번	
//		*****
//		****
//		***
//		**
//		*
		
//		i : 바깥for문 (행)
//		j : 안쪽for문 (열)
		
		
		for(int i = 5; i >= 1; i--) {   //i는 5부터 1까지 감소(행)
//	         System.out.println(i);
	         for(int j = 1; j <= i; j++) { //j는 1부터 i까지 증가(열)
//	            System.out.println("i : " + i + ", j : " + j); //i, j 규칙성 확인
	            System.out.print("*");
	         }
	         System.out.println();
	      }

		
		
		
//		2번 : 피라미드와 유사한
//		*
//		* * *
//		* * * * *
//		* * * * * * *
		
//		i= 4행 j= 열 2개씩 증가
		
		for(int i= 1; i <=4; i++) { // i는 행, 줄 번호
//			System.out.println(i);
			for(int j = 1; j <= 2* i - 1; j++) {
//				System.out.println("i :" + i + ", j : " + j);
				System.out.print("*");
				
			}
			System.out.println();
		}
		
		
		
		
		
		
//		3번 : 피라미드 (for문이 총 3개-> 어떻게 사용될지 먼저 생각하기)
//	   	 *
//	   	* *
//	   * * *
		
		for(int i = 1; i <= 3; i++) { //i는 행, 1부터 3까지 증가
//			System.out.println(i);
			for(int j = 1; j <= 3-i ; j++) { //j 공백 출력 열
//				System.out.println("i = " + i + ", j =" + j);
				System.out.print(" ");
			}
			for(int k = 1; k <= i; k++) { //k * 출력 열
				System.out.print("* ");
				
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
	}
}
