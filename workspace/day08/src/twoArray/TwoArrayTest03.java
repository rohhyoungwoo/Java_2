package twoArray;

public class TwoArrayTest03 {
	public static void main(String[] args) {
		
		// 1 2 3 4
		// 5 6 7 8
		// 9 10 11 12

		// 1. 값 넣고 각 값을 출력하기 ar1
//		int[][] ar1 = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } };
		// ar1 3개의 행과 4개의 열
		// 이중 for문 이용해 결과출력

		// 행의 길이 : ar1.length
		// 열의 길이 : ar1[i].length

//		for (int i = 0; i < ar1.length; i++) {
//			for (int j = 0; j < ar1[i].length; j++) {
////	            System.out.print(ar1[i][j]);
////	            System.out.println("i : " + i + ", j : " + j);
//				System.out.print(ar1[i][j] + "\t");
//			}
//			System.out.println();

		// 2. 칸수만 알도록 선언 후 값 대입 후 출력하기 ar2
		int[][] ar2 = new int[10][10];
		// ar2 크기만 지정된 2차원 배열 4개의 행과 3개의 열
		// 이중 for문을 이용해 1부터 값 대입
		// 값을 저장할 변수 이용해 1부터 순차적으로 증가시키면서 대입
		// 이중for문으로 결과출력
		int value = 1;
		int sum = 0;
		double avg = 0.0;
		for (int i = 0; i < ar2.length; i++) {
//	         System.out.println(i);
			for (int j = 0; j < ar2[i].length; j++) {
				ar2[i][j] = value++;
				sum += ar2[i][j];
			}
			avg = sum/ar2[i].length;
		}
		System.out.println(sum);
		System.out.println(avg);
//		System.out.println(ar2[9][9]);
//		for (int i = 0; i < ar2.length; i++) {
//			for (int j = 0; j < ar2[i].length; j++) {
//				System.out.print(ar2[i][j] + "\t");
//			}
//			System.out.println();
//		}
	}
	}