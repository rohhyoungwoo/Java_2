package ex01;

// 노형우
public class Main {
   public static void main(String[] args) {
      // 로직구성 있어야함

      // 성적 평가 프로그램
      // 학생의 성적을 2과목 입력받아 학점을 계산하는 프로그램
      // 90점이상 A, 80점이상 90점 미만 B, 70점이상 80점 미만 C, 70점미만 F
      // 반드시 메소드를 만들 것(2개 이상), 객체를 2개 만들 것

//		System.out.println(st1.isPass(Integer.parseInt(st1.grade))); //오류발생
      // 사용자로부터 점수를 입력받고 학점과 합격 여부를 출력하기
      // 필드 : 이름, java점수, dbms점수, 총점, 학점
      // 생성자 : 상관없음
      // 메소드 : calculateGrade(int ) : 두과목의 평균점수(int) 학점 반환하는 메소드(매개변수1개 정수형)
      // isPass(int) : 두과목의 평균 점수(int)가 70점이상이면 true, 아니면 false반환하는 메소드

      Student st1 = new Student("짱구", 80, 90);
      Student st2 = new Student("철수", 99, 75);

      System.out.println(st1);
      System.out.println(st2);

      System.out.println(st1.totalScore);
      System.out.println(st2.totalScore);
      System.out.println(st1.isPass((st1.javaScore + st1.dbmsScore) / 2) ? "Pass" : "Fail");

   }


		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
		
	
}
