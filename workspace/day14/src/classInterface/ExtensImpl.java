package classInterface;
//13번 : 상속과 구현은 별개이다

class Parent1{
	void parentmethod() {
		System.out.println("부모 클래스의 메소드");
	}
}

interface InterfaceD{
	void methodA();
}

interface InterfaceE{
	void methodB();
}

 class Child1 extends Parent implements InterfaceD, InterfaceE{

	@Override
	public void methodB() {
		
	}

	@Override
	public void methodA() {
	
	}
	
}



public class ExtensImpl {

}
