package inheritanceTest2;

public class Animal {
	// 필드
	String name;
	int age;
	String type;

	/**
	 * 
	 */
	public Animal() {
		super();
	}

	// 메소드
	void eat(String food) {
		System.out.println(this.name + "가 " + food + "을 먹고 있습니다");
	}

	void play() {
		System.out.println(this.name + "이가 놀고 있습니다");
	}

	void sleep() {
		System.out.println(this.name + "이가 자고 있습니다");
	}

	void birthday() {
		this.age++;
		System.out.println(this.name + "의 생일입니다! 이제 " + this.age + "살이 되었습니다");
	}

}
