package inherianceConstructor2;

public class Main {
	public static void main(String[] args) {
		Car c1 = new Car();
		Car c2 = new Car("기아", "black", 10000);
		System.out.println(c1);
		System.out.println(c2);
		
		c1.brand = "현대";
		System.out.println(c1.brand); //null -> 현대
		System.out.println(c2.brand); //기아
		
		SuperCar sc1 = new SuperCar();
		SuperCar sc2 = new SuperCar("BMW", "남색", 150000, true);
		System.out.println(sc1);
		System.out.println(sc2);
		
		System.err.println(sc1.brand);	//null
		System.err.println(sc2.brand);
	}
}
