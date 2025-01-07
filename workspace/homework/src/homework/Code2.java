package homework;

public class Code2 {
	public static void main(String[] args) {
		
		printHello(); // main 메서드 안에서 printHello() 메서드 호출
		Code2 jogger = new Code2(); // 객체 생성
		jogger.run(); // jogger 인스턴스의 run() 메서드 호출
	
	
	}
		
	static void printHello() { //위의 main 메소드 안에서 호출하기 위해 static사용
		System.out.println("안녕하세요");
		System.out.println("만나서 반갑습니다.");
	}
		
		void run() { // run 이라는 메소드 생성
			System.out.println("run run run!"); //출력메시지
		}
		
		String name; // 조거의 이름
		void run() { // run 이라는 메소드 생성
			System.out.println("run run run!"); //출력메시지
		}
		void sayName() { // sayName이라는 메소드 생성
			System.out.println("제 이름은 " + name + "입니다." ); //출력메시지
		}
		Jogger jogger = new Jogger(); // 객체 생성
		jogger.name = "김나비";
		jogger.sayName(); // jogger 인스턴스의 sayName() 메서드 호출
		jogger.run(); // jogger 인스턴스의 run() 메서드 호출
		
		void count(int bookNum) { // count 라는 메소드에 bookNum이라는 매개변수 사용
			System.out.println("책은" + bookNum + "권 입니다."); // 출력 메시지
		}
		
		Book myBook = new Book(); // 객체 생성
		myBook.count(3); // myBook인스턴스 count 메서드 호출
		
		
		void sum(int num1, int num2) { // sum이라는 메소드명에 num1,num2매개변수를 사용해 메소드를 생성
			System.out.println("두 수의 합은" + (num1 + num2) + "입니다.");//메소드를 사용하게 되면 출력되는 메시지
		}
		
		
		Calc calc = new Calc(); //객체 생성
		calc.sum(5,3); // calc 인스턴스 sum 메서드 호출
		calc.sum(10,7); // calc 인스턴스 sum 메서드 호출
		
		
		void introduce(String name, int age) { //intrp
			System.out.println("제 이름은" + name + "이고, 나이는 " + age + "세입니다.");
		}
		
		void hello() {
			System.out.println("안녕하세요");
		}
		
		Person hong = new Person(); // 객체 생성
		hong.introduce("홍길동", 20); // hong 인스턴스 introduce 메서드 호출
		hong.hello();//hong 인스턴스 hello메소드 호출
		
		void sum(int[] nums) {//sum이라는 메소드명에 nums라는 매개변수 배열을 생성
			int result = 0; // 결과값 초기화
			for(int i = 0; i < nums.length; i++) {//for문을 사용하여 배열에 값을 하나씩 넣어준다
				result += nums[i]; //누적해서 더하여 result의 값으로 넣어준다
			}
			System.out.println("숫자들의 합은 " + result + "입니다.");
		}
		
		
		int nums[] = {100, 200}; //배열 생성
		Calc calc = new Calc(); // Calc 객체 생성
		calc.sum(nums); // calc 인스턴스의 sum 메서드 호출
		
		public int sum(int[] nums) { // sum이라는 메소드명에 배열을 매개변수로 받는 메소드 생성
			
		int result = 0; // 결과값을 초기화한다
		for(int i = 0; i < nums.length; i++) { //for문을 통해 배열의 값을 저장한다
			result += nums[i]; // 배열에 저장하는 값을 result변수에 누적하여 더해 저장한다
		}
		return result; // result 값을 반환한다
		}
		
		public static void main(String[] args) { // main 메소드 생성
			
		int[] nums = {500, 200}; // 배열의 값을 저장한다
		Calc calc = new Calc(); // 객체 생성
		
		System.out.println("숫자들의 합은 " + calc.sum(nums) + "입니다.");//출력 메시지
		}

		}
		
		public int score(int[] scores) {// score라는 메소드명에 배열을 매개변수로 사용하는 메소드 생성
			int result = 0; // 값을 초기화
			for(int i = 0; i < scores.length; i++) {//for문을 통해 배열에 값을 반복 실행하여 받고
				result += scores[i]; // 값은 result에 누적되어 더해진다
			}
			return result; // result 결과를 반환한다

			int[] studentA = {97, 53}; // studentA 배열에 값을 저장한다
			int[] studentB = {95, 66}; // studentB 배열에 값을 저장한다
			
			MidTerm mid = new MidTerm(); // 객체 생성
			int sumA = mid.score(studentA); // 매소드 호출
			int sumB = mid.score(studentB); // 메소드 호출
			
			if(sumA > sumb) { // if(조건식1)이 참일때 아래 실행문 실행
				System.out.println("A학생의 중간고사 총점이 더 높습니다"); // 조건식이 true일때 실행
			}else if(sumA < sumB) {
				System.out.println("B학생의 중간고사 총점이 더 높습니다");//조건식 1은 false이고, 조건식2는 true일때 실행한다
			}else {
				System.out.println("두 학생의 중간고사 총점이 같습니다.");// 조건식 1과 2가 false이면 실행한다
			}

			void take(int m) {//take라는 메소드에 매개변수 m을 사용하는 메소드 생성
				
				while(true) { //true일때 반복실행한다
					if(m < 3000) { // 조건식이 true 일 때
						System.out.println("교통카드를 충전하러 갑니다."); // 조건식이 true 일때 실행할 문장
						return;	//값을 반환한다
					}
					System.out.println("버스를 탑니다."); // 조건식이 false일때 실행할 문장
					m -= 1250; // m의 값에 1250을 뺀 값을 저장한다
				}
			}
			int money = 10000; // 정수형 변수 money에 값10000을 저장한다
			
			Bus bus = new Bus(); //bus객체 생성
			bus.take(money); //bus 인스턴스의 take 메서드 호출




}
