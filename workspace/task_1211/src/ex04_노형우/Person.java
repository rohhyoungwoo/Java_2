package ex04_노형우;

public class Person {

	// 필드
	private String name;

	// 이름을 매개변수로 받는 생성자
	public Person(String name) {
		this.name = name;
	}

	// 메소드 생성
	String getName() {
		return this.name;
	}

}
