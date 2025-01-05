package twoArray;

import java.util.Arrays;
import java.util.Scanner;

//12번 : 실습
public class Task {
   public static void main(String[] args) {
      // 1. 3x3 크기의 2차원 배열을 생성하고 사용자가 입력한 값을 대입
      // 1) 각 행의 합계와 평균 출력
      // 2) 전체 배열의 합계와 평균 출력

      // 입력클래스 import
      // 2차원 배열 선언 및 생성
      // 이중 for문(int i = 0; i < 배열.length 행의길이; i++){
      // for(int j = 0; j < 배열[i].length 열의길이; j++){
      // 배열명[i][j] = sc.nextInt();
      // }}
      // 각 행의 합계와 평균
      // 합계구할변수, 평균구할변수
      // 이중 for문(int i = 0; i < 배열.length 행의길이; i++){
      // for(int j = 0; j < 배열[i].length 열의길이; j++){
      // 합계구할변수 += 배열명[i][j];
      // }
      // 평균구할변수 = 합계구할변수 / 배열명[i].length;
      // syso("행, 합계, 평균");
      // }

      // 전체배열의 합계와 평균
      // 전체총합구할변수, 전체평균구할변수
      // for-each문
      // 최종 배열의 합, 평균 출력

//      Scanner sc = new Scanner(System.in);
//      int[][] ar1 = new int[3][3];
//      for(int i = 0; i < ar1.length; i++) {
//         for(int j = 0; j < ar1[i].length; j++) {
////            System.out.println("i : " + i + ", j : " + j);
//            System.out.println("ar1[" + i + "]["+ j + "]배열의 값 입력 : ");
//            ar1[i][j] = sc.nextInt();
//         }
//      }
//      
//      double rowAvg = 0.0;
//      
//      System.out.println("각 행의 합계와 평균 : ");
//      for(int i = 0; i < ar1.length; i++) {
//         int rowSum = 0;
//         for(int j = 0; j < ar1[i].length; j++) {
//            rowSum += ar1[i][j];
//         }
//         rowAvg = (double)rowSum/ar1[i].length;
//         System.out.printf("행 : %d, 합계 : %d, 평균 : %.2f\n", i+1, rowSum, rowAvg);
//      }
//      
//      //배열 전체의 합계와 평균
//      int total = 0;
//      double totalAvg = 0.0;
//      for(int[] row : ar1) {
////         System.out.println(row);
//         for(int value: row) {
//            total += value;
//         }
//      }
//      
//      totalAvg = (double) total / (ar1.length * ar1[0].length);
//      System.out.printf("배열의 총 합 : %d, 평균 : %.2f\n", total, totalAvg);
//      
      // 2. 2x2 크기의 2차원 배열을 생성하고 초기값을 아래와 같이 설정한다
      // 1 2
      // 3 4
      // 1) 얕은 복사로 복사하고 1행1열의 값을 40으로 변경한 뒤
      // 원본배열과 변경된 배열 출력하기
      // 2) 깊은 복사로 복사하고 0행 1열의 값을 20으로 변경한 뒤
      // 원본 배열과 변경된 배열 출력하기

      int[][] ar2 = { { 1, 2 }, { 3, 4 } };

      // 1) 얕은 복사 => 값 변경(참조값동일)
      int[][] ar2Copy = ar2;
      System.out.println("원본배열 복사한 배열 : " + Arrays.deepToString(ar2));
      ar2Copy[1][1] = 40;

      System.out.println("원본배열 : " + Arrays.deepToString(ar2));
      System.out.println("수정된 배열 : " + Arrays.deepToString(ar2));

      // 2) 깊은 복사 => 값 변경X
//      int[][] ar2Copy2 = new int[ar2.length][];
//      System.out.println(ar2Copy2);
//      for(int i = 0; i < ar2.length; i++) {
//         ar2Copy2[i] = Arrays.copyOf(ar2[i],ar2[i].length);
//         //Arrays.copyOf : 배열의 내용을 깊은 복사하는 메소드
//         //ar2[i] : 배열의 내용을 깊은복사
//         //ar2[i].length : 복사할 배열의 길이
//         
//         //원본 열 ar2[i]와 독립된 새로운 메모리 공간에 저장
//         System.out.println(ar2Copy2[i]);
//      }

      int[][] ar2Copy2 = new int[ar2.length][];

      for (int i = 0; i < ar2.length; i++) {
         ar2Copy2[i] = new int[ar2[i].length];
         for (int j = 0; j < ar2[i].length; j++) {
            ar2Copy2[i][j] = ar2[i][j]; // 값 복사
         }
      }

      ar2Copy2[0][1] = 20;

      System.out.println("원본배열 : " + Arrays.deepToString(ar2));
      System.out.println("복사한배열 : " + Arrays.deepToString(ar2Copy2));
      
      
      
      
      

   }
}
