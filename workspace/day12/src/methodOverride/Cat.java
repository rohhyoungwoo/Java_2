package methodOverride;

public class Cat extends Animal{
	
	public Cat(String name) {
		super(name);
	}

	//메소드 오버라이딩 : alt + shift + s + v
	@Override
	void sound() {
		System.out.println(this.name + "가 야옹하고 웁니다");
	}
	
}
