package ex02;

import java.util.Scanner;

//본인이름
public class Main {
   public static void main(String[] args) {
      //5명의 학생의 점수(1과목)를 입력받아 아래를 수행하는 프로그램
      // 총합 계산
      // 평균 계산
      // 최고 점수와 해당 인덱스 출력
      
      // 점수는 배열에 저장하여 출력
      // 나중에 학생수를 사용자 입력할 수 있도록 변경할 예정이다
      
      //학생수와 점수 저장할 배열 선언
      //입력클래스import
      Scanner sc = new Scanner(System.in);
      
      System.out.println("학생의 수 입력 : ");
      int stu = sc.nextInt();
      int[] studentCount = new int[stu];
      
      //점수입력
      for(int i = 0; i < stu; i++) {
         System.out.println((i+1) + "학생의 점수 : ");
         studentCount[i] = sc.nextInt();
      }
      
      //총합 계산
      int total = 0;
      for(int score : studentCount) {
         total += score;
      }
      
      //평균 계산
      double avg = (double) total / stu;
      
      //최고점수와 해당 인덱스 계산
      int maxScore = studentCount[0];
      int maxIndex = 0;
      for(int i = 1; i < studentCount.length; i++) {
         if(studentCount[i] > maxScore) {
            maxScore = studentCount[i];
            maxIndex = i;
         }
      }
      
      System.out.println("결과");
      System.out.println("총합 : " + total);
      System.out.println("평균 : " + avg);
      System.out.println("최고점수 : " + maxScore + ", 인덱스번호 : " + maxIndex);
      
   }
}












