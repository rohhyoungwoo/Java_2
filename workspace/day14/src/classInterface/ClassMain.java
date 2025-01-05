package classInterface;
//9번 : 클래스 단일상속

class Parent{
	void dispaly() {
		System.out.println("부모클래스");
	}
}


//class Parent2{
//	void dispaly0() {
//		System.out.println("부모클래스");
//	}
//}

class Child extends Parent{
	void dispaly2() {
		System.out.println("자식클래스");
	}
}


public class ClassMain {
	public static void main(String[] args) {
		Child c = new Child();
		c.dispaly();
		c.dispaly2();
	}
}
