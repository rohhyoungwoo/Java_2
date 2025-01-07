package abstractTest2;
//5번 : 추상클래스와 강제성
public class AnimalMain {
	public static void main(String[] args) {
		Animal animal = new Cat();
		Animal animal2 = new Dog();
		System.out.println(animal);
		System.out.println(animal2);
		
		animal.crying();
		animal2.crying();
	}
}
