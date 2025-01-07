package methodTest;

//15번 : 메소드 호출방법 4가지 연습
public class MethodTest03 {
	public static void main(String[] args) {
		MethodTest03 mt = new MethodTest03();
		// 매개변수x, 리턴값 메소드 printHello => 메소드명();
		mt.printHello();
		
		//매개변수o, 리턴값x 메소드 printName => 메소드명(인수);
		mt.printName("노형우");
		
	
		//매개변수x, 리턴값o 메소드 syso(printTotal());
		System.out.println("1부터 10까지의 합 " + mt.printTotal());
		
		//매개변수o, 리턴값o 메소드 syso(printNum(인수)) or 변수 = printNum());
		System.out.println("합 :" + mt.printNum(5));
		
		
		System.out.println(mt.printSum(1));
	}

	// 매개변수x, 리턴값x 메소드
	// 메소드명 : printHello (안녕하세요를 5번 출력하는 메소드)
	void printHello() {
		// 반복문 5번 반복
		for (int i = 1; i < 6; i++) {
			System.out.println("안녕하세요.");
		}

	}
	//매개변수 o, 리턴값 x 메소드
	//메소드명 : printName 매개변수 : 본인이름(본인이름님 환영합니다 출력
	void printName(String name) {
		System.out.println(name + "님 환영합니다");
	}
	
	//매개변수 x,리턴값 o 메소드
	//메소드명 : printTotal 매개변수 : x
	//1부터 10까지의 합을 리턴하는 메소드
	int printTotal() {
		//1) 총합구할 변수
		//2) for문 (1부터~10까지) int i = 1; i <= 10; i++)
		//3) 변수 += i;
		//4) return 총합변수
		int total = 0;
		for(int i = 1; i <= 10; i++) {
			total += i;
		}
		return total;
		
	}
	//매개변수 o, 리턴값o 메소드
	//정수1개를 넘겨받아 1~넘겨받은 정수까지의 힘을 반환하는 메소드
	//매개변수로 전달된 값을 출력
	//최종 합을 반환
	//메소드명 printNum
	//매개변수 : 1개 int
	int printNum(int num) {
		System.out.println(num);
		int total = 0;
		for(int i = 1; i <= num; i++) {
			total += i;
		}
		return total;
	}
	//매개변수 o, 리턴값o
	//입력받은 숫자까지 총합 구하는 메소드
	//로직구성
	//리턴타입 - int
	//메소드명 - printSum
	//매개변수 - int num
	// 총합 구할 변수선언 => 구현부
	// return 총합;
	
	int printSum(int num) {
		int sum = 0;
		for(int i = 1; i <= num; i++) {
			sum += i;
		}
		return sum;
	}
	
	
	
	
}
