package ex05_노형우;

public class Pet extends Animal{

	//생성자
	public Pet(String name) {
		super(name);
	}

	//메소드
	void play() {
		System.out.println(this.name + "이 장난을 칩니다");
	}
	
	void eat() {
		System.out.println(this.name + "이 먹습니다");
	}
	
	void sleep() {
		System.out.println(this.name + "이 잠을 잡니다");
	}
}
