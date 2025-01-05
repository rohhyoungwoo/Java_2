package accessModifier2;

public class CarMain {
	public static void main(String[] args) {

		Car c = new Car();

		c.setSpeed(100);
		System.out.println(c.getSpeed());

		SuperCar superCar = new SuperCar();
		superCar.speedUp(); //자식클래스의 객체는 오버라이딩 된 메소드 호출
		superCar.stop();
	}
}
