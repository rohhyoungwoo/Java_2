package task;

public class Mouse extends Animal{

	//메소드 오버라이딩
	@Override
	void cry() {
		System.out.println("찍찍찍찍");
	}
	
	//메소드
	void sleep() {
		System.out.println("고양이를 피해 잠을 잡니다");
	}
	
}
