package ex05_노형우;

public abstract class Animal {
	//필드
	protected String name;

	
	//생성자
	public Animal(String name) {
		this.name = name;
	}	
	
	//메소드
	public String getName() {
		return name;
	}
	
	
	void performActions() {
		System.out.println("동물의 행동을 출력");
	}

}
