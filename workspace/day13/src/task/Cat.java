package task;

public class Cat extends Animal{

	//메소드 오버라이딩
//	@Override -(어노테이션)
	void cry() {
		System.out.println("야옹야옹");
	}

	//메소드
	void play() {
		System.out.println("스크래치 놀이를 합니다");
	}
}
