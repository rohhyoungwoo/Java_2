package inheritanceTest2;

public class Cat extends Animal{
	//고양이의 고유 메소드
	void meow() {
		System.out.println(this.name + "이가 야옹하고 웁니다");
	}
}
