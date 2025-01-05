package mentorjava;


class Parent{}
class Child extends Parent{}

class Car {}
class Bus extends Car{}
class SchoolBus extends Bus{}

class OpenCar extends Car{}
class SportsCar extends OpenCar{}



public class ClassMain {
	public static void main(String[] args) {
		Parent p1 = new Parent(); // p1객체 생성
		Child c1 = new Child(); // c1객체 생성
		
		Parent p2 = new Child(); // 자동 타입 변환
		Parent p3 = c1;		//자동 타입 변환 (자식 클래스의 객체를 부모 클래스의 타입으로 변환) 
		
		if(p3 == c1) {
			System.out.println("p3와 c1은 같은 객체를 참조하고 있습니다");
		}
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}






	
