package task;

public class Dog extends Animal{

	//메소드 오버라이딩
	@Override
	void cry() {
		System.out.println("멍멍멍멍");
	}

	//메소드
	void walk() {
		System.out.println("산책을 갑니다");
	}
	
	
}
