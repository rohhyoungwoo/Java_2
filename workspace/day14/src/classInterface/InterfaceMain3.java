package classInterface;

//12번 : 인터페이스의 다중 상속
//객체가 여러 역할을 수행해야할 때
// 모듈화와 확장성을 고려할 때
// 재사용성과 중복 방지
interface InterfaceM {
	void methodA();
}

interface InterfaceP {
	void methodB();
}

interface InterfaceQ extends InterfaceM, InterfaceP {
	void methodC();
}

class ClassZ implements InterfaceQ {

	@Override
	public void methodA() {

	}

	@Override
	public void methodB() {

	}

	@Override
	public void methodC() {

	}

}

public class InterfaceMain3 {
	public static void main(String[] args) {

	}
}
