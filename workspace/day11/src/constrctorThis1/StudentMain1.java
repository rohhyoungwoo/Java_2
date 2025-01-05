package constrctorThis1;
//8번 : 문제 해결
//문제 : 변수 이름 충돌 => 해결 : this 키워드 사용해서 변수명인지 필드명인지를 구분한다
class Student1 {
	   // 필드
	   String name;
	   int age;

	   // 생성자
	   public Student1(String name, int age) {
	      name = name; // 의도한대로 동작하지 않는다
	      age = age; // 지역변수의 값을 그대로 대입하기 때문에 필드는 초기화 되지 않는다
	      System.out.println(this.name);
	      System.out.println(name);
	   }

	   // 메소드
	   void studentInfo() {
	      System.out.println("이름 : " + name);
	      System.out.println("나이 : " + age);
	   }
}

public class StudentMain1 {
	public static void main(String[] args) {
	Student1 st = new Student1("신짱구", 5);
}
}
