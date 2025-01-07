package mentor;

import java.util.Scanner;

public class Mentor01 {
	public static void main(String[] args) {
		System.out.print("Welcome.");
		// 괄호()안의 데이터를 콘솔창에 출력한다
		System.out.print("JAVA World");
		// "Welcome." 옆에 "JAVA World" 문자열을 출력한다

		System.out.println("Welcome.");
		// 괄호()안의 데이터를 콘솔창에 출력한다
		System.out.println("JAVA World");
		// "Welcome." 문자열 아래 "JAVA World" 문자열을 출력한다

		System.out.printf("저는 대학교 %d학년에 재학중입니다!", 3);
		// 서식문자에 %d를 이용해 정수를 출력한다.

		System.out.printf("%d은 첫 번째, %f은 두 번째, %s은 세 번째.", 1, 2.0, "셋 ");
		// 두가지 이상의 서식문자를 이용하여 정수형, 실수형, 문자형을 출력한다

		System.out.printf("%5d", 1);
		System.out.println();
		System.out.printf("%5d", 12);
		System.out.println();
		System.out.printf("%5d", 123);
		System.out.println();
		System.out.printf("%5d", 1234);
		System.out.println();
		System.out.printf("%5d", 12345);
		// %nd = n칸 만큼 확보한 후 오른쪽으로 정렬하는것.
		// printf는 서식문자를 넣어 출력하고 println은 줄바꿈을 출력한다

		System.out.printf("%.1f", 1.1234567);
		System.out.println();
		System.out.printf("%.2f", 1.1234567);
		System.out.println();
		System.out.printf("%.3f", 1.1234567);
		System.out.println();
		System.out.printf("%.4f", 1.1234567);
		System.out.println();
		System.out.printf("%.5f", 1.1234567);
		// %.nf = 소수점 n번째 자리 까지에서 반올림하여 출력한다
		// prinf로 서식문자를 입력하여 출력하고 println으로 줄바꿈을 출력했다

		int studentAge; // 학생의 나이를 저장할 수 있는 변수 선언
		studentAge = 20; // 변수에 값을 대입했다

		System.out.println(studentAge); // 변수를 출력한다

		String myCity = "Seoul"; // 도시를 저장할 수 있는 변수를 선언하고 변수에 "Seoul" 이라는 값을 대입했다

		System.out.println(" I am from " + myCity); // "I am from " 에 더하여 문자열 변수 myCity의 값을 출력한다

		int myAge = 20; // 정수형 변수를 선언하고 값을 대입한다
		int yourAge = myAge; // int yourAge 변수에 myAge변수의 값을 대입한다

		System.out.println(myAge);
		System.out.println(yourAge); // 각각의 변수의 값을 출력한다

		int myAge = 20; // 정수형 변수를 선언하고 값을 대입한다
		int yourAge = 30; // int yourAge 변수에 myAge변수의 값을 대입한다
		int tempAge; // 정수형 변수 선언

		tempAge = myAge; // myAge에 저장된 데이터를 tempAge에 복사한다
		myAge = yourAge; // yourAge에 저장된 데이터를 myAge에 복사한다
		yourAge = tempAge; // tempAge에 저장된 데이터를 yourAge에 복사한다

		System.out.println(myAge);
		System.out.println(yourAge);

		byte num1 = 20; // byte형 변수 num1에 20의 값을 대입한다
		short num2 = 30; // short 변수 num2에 30의 값을 대입
		int num3 = 40; // int형의 변수 num3에 40의 값을 대입
		long num4 = 50; // long 변수 num4에 50을 대입한다

		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(num4);
		// num1~ num4 변수의 값 출력 + 줄바꿈

		byte num1 = 0110; // byte타입 num1 변수에 0110값을 대입한다
		short num2 = 0107; // short타입 num2 변수에 0107값을 대입한다
		int num3 = 0x46; // int타입 num3 변수에 0x46값을 대입한다
		long num4 = 69L; // long타입 num4 변수에 69L값을 대입한다

		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(num4);
		// num1 ~ num4 변수의 값을 출력한다 + 줄바꿈

		double marathon = 42.195; // double 타입 변수에 42.195값을 저장한다
		float halfMarathon = 21.0975f; // float 타입 변수에 21.0975f 갑을 저장한다

		System.out.println("마라톤은 " + marathon + "km를 달립니다."); // 마라톤은 42.195km를 달립니다. 메시지 출력
		System.out.println("하프 마라톤은 " + halfMarathon + "km를 달립니다."); // 하프 마라톤은 21.0975km를 달립니다. 메시지 출력

		double pieDouble = 3.141592653589793; // double 타입 변수에 값을 저장한다.
		float pieFloat = 3.141592653589793f; // float 타입 변수에 값을 대입한다.

		System.out.println("double : " + pieDouble); // double : + (변수의 값)을 더하여 출력한다
		System.out.println("float : " + pieFloat); // float : + (변수의 값)을 더하여 출력한다

		char ga = '가';
		char na = '나';
		char alphabetA = 'A';
		char alphabetB = 'B';
		// char타입 문자형 변수에 오른쪽의 값을 대입하여 저장한다.

		System.out.println(ga); // 변수 ga의 값을 출력한다..
		System.out.println(na); // 변수 na의 값을 출력
		System.out.println(alphabetA + ", " + alphabetB); // alphabetA의 값 + , + alphabetB의 값 을 더하여 출력한다

		int ga = '가'; // int 타입 정수형 변수에 '가'의 값을 저장한다.
		int na = '나'; // int 타입 정수형 변수에 '나'의 값을 저장한ㄷ.

		int alphabetA = 'A'; // 문자 A의 코드값이 int alphabetA변수에 저장되었다.
		int alphabetB = 'B'; // 문자 B의 코드값이 in alphabetB변수에 저장되었다.

		System.out.println(ga); // '가'의 유니코드값 출력
		System.out.println(na); // '나'의 유니코드값 출력
		System.out.println(alphabetA); // 값 'A'의 코드 값 출력
		System.out.println(alphabetB); // 값 'B'의 코드 값 출력

		int alphabetA = 'A'; // 'A'와 매핑된 유니코드(정수) 65가 저장되었다
		int alphabetB = 'B'; // 'B'와 매핑된 유니코드(정수) 66이 저장되었다
		System.out.println(alphabetA); // 값 'A'의 코드 값 출력
		System.out.println(alphabetB); // 값 'B'의 코드 값 출력

		char alphabetC = 67; // 유니코드(정수) 67과 매핑된 'C'가 저장되었다
		System.out.println(alphabetC); // 저장된 값 'C'가 출력됨

		boolean isStudent = true; // boolean 타입 변수 선언
		System.out.println(isStudent); // 출력 결과 'true'

		boolean isStudent = true; // boolean 타입 변수 선언

		if (isStudent) { // if(조건식)이 true 일때 중괄호 안의 영역 실행
			System.out.println("저는 학생입니다"); // 조건식의 값이 true 일 때 "저는 학생입니다" 출력
		} else { // 조건식 값이 false 이면 중괄호 안의 영역 실행
			System.out.println("저는 학생이 아닙니다"); // 조건식의 값이 false 일 때 "저는 학생이아닙니다" 출력
		}

		String hi = "안녕하세요,"; // String 타입의 문자열 변수의 값에 "안녕하세요," 저장한다
		String niceToMeetYou = "만나서 반갑습니다."; // String 타입의 문자열 변수의 값에 "만나서 반갑습니다." 를 저장한다

		System.out.println(hi); // 변수 hi의 값을 출력한다
		System.out.println(niceToMeetYou); // 변수 niceToMeetYou 의 값을 출력한다.

		int num1 = 11; // 정수형 변수에 11의 값을 대입한다
		double num2 = 3.14; // 실수형 변수에 3.14의 값을 저장한다
		double num1Change = (double) num1; // 정수형 num1의 값을 실수형으로 형변환 시켜준다

		System.out.println("num1 : " + num1);
		System.out.println("num1Change : " + num1Change);
		System.out.println(num1Change + num2);
		System.out.println((int) 1.23); // 1.23의 값을 정수형으로 형변환 시켜 소수점 자리는 버리고 1만 출력한다

		int i1 = 10; // int i1 변수에 값 10을 저장
		byte b1 = (byte) i1; // int 타입을 byte 타입으로 형변환 시킨다.
		System.out.println(b1); // byte b1의 값 출력

		int i2 = 128; // int i2 변수에 값 128을 저장
		byte b2 = (byte) i2; // int 타입의 값을 byte 타입으로 형변환시킨다
		System.out.println(b2); // 형변환된 값을 출력한다

		double d1 = 1.0e100; // 1.0 x (10의 100승) (float의 최대 범위를 넘음)
		float f1 = (float) d1; // double 타입을 float타입으로 형변환

		System.out.println(f1); // float의 저장 범위를 넘어서는 값은 무한대가 되거나 0이된다

		double d2 = 1.0e-100; // 1.0 x -(10의 100승)
		float f2 = (float) d2; // (float의 최대 범위를 넘음)
		System.out.println(f2); // float으 ㅣ저장 범위를 넘어서는 값은 무한대가 되거나 0이된다

		double pie = 3.14; // 실수형 변수에 값 3.14저장
		int pieInt = (int) pie; // 실수형을 정수형으로 형변환 하고 정수형 변수에 저장한다
		System.out.println(pieInt); // 정수형으로 형변환 되면서 소수점의 값은 버려지고 출력된다

		int num = 100; // 정수형 변수에 100의 값 저장
		double numD = (double) num; // 정수형을 실수형으로 형변환 시켜 변수에 값을 젖아
		float numF = (float) 100; // 정수형 값을 실수형으로 형변환
		System.out.println(numD); // 정수형을 실수형으로 형변환 시킨 값 출력
		System.out.println(numF); // 정수형을 실수형으로 형변환 시킨 값 출력

		int i = 99999999; // 정수형 변수 i에 값 저장
		float f = (float) i; // 정수형 변수를 실수형으로 형변환
		System.out.println(f); // 형변환 시킨 값 출력 (범위밖)

		int num1 = 14;
		double num2 = 3.14;
		int num4 = (int) num2;
		// int 변수와 double변수에 값을 저장하고 실수형을 정수형으로 형변환

		System.out.println(num4); // 형변환을 통해 소수점은 버려지고 정수값만 출력

		int i = 100; // int 변수에 100의 값 저장
		char c = 'a'; // 문자형 변수에 'a'값 저장
		int j = c; // 문자형을 정수형으로 자동형변환
		double d = i; // 정수형을 실수형으로 자동형변환

		System.out.println("int형 변수j의 값 : " + j);
		System.out.println("double형 변수 d의 값 : " + d);
		// 자동형변환을 통한 정수값 출력
		// 자동형변환을 통한 실수형 값으로 출력

		int i = 10;
		byte b = (byte) i;
		System.out.println("[int -> byte] i의 값 :" + i + "b의 값:" + b);
		// int형을 byte형으로 강제 형변환 시켜 그 값을 출력한다(값이 작을경우 출력)
		int j = 1000;
		byte c = (byte) j;
		System.out.println("[int -> byte] j의 값 :" + j + " c의 값 : " + c);
		// int형을 byte형으로 강제 형변환 시켜 그 값을 출력한다(값이 큰 경우 출력)

		double d1 = 1.1234;
		float f1 = (float) d1;
		System.out.println("[double -> float] d1의 값: " + d1 + ", f1의 값 :" + f1);
		// double 형을 float형으로 강제 형변환시켜 출력한다 ( float형 범위 내 값일 경우)
		double d2 = 1.0e-50;
		float f2 = (float) d2;
		System.out.println("[double -> float] d2의 값: " + d2 + ", f2의 값 :" + f2);
		// double 형을 float형으로 강제 형변환시켜 출력한다 (float형 최소값보다 작은 경우)
		double d3 = 1.0e100;
		float f3 = (float) d3;
		System.out.println("[double -> float] d3의 값: " + d3 + ", f3의 값 :" + f3);
		// double 형을 float형으로 강제 형변환시켜 출력한다 (float형 최대값보다 큰 경우)
		double d4 = 9.123456789;
		float f4 = (float) d4;
		System.out.println("[정밀도 차이] d4의 값: " + d4 + ", f4의 값 :" + f4);
		// double형과 float 형의 정밀도 차이를 보여주는 값을 출력한다 double형이 더 정밀도가 높으므로
		// 실수형의 기본형은 double형이다

		float f1 = 12345.67f;
		int i1 = (int) f1;
		System.out.println("[float -> int] f1의 값 :" + f1 + ", i1의 값 :" + i1);
		// float형을 int형으로 강제 형변환 시킨 값을 출력한다 소수점자리는 버려지고 정수만 출력된다
		double d1 = 12345.678;
		int i2 = (int) d1;
		System.out.println("[double -> int] d1의 값 :" + d1 + ", i2의 값 :" + i2);
		// double형에서 int형으로 강제 형변환 시켜 출력한다 소수점 자리는 버려지고 정수의 값만 출력된다

		Scanner scanner = new Scanner(system.in);
		// 입력 클래스 import

		System.out.println("나이를 입력해 주세요"); // 출력 메시지를 출력한다
		int age = scanner.nextInt(); // 정수형을 입력받은 메소드
		System.out.printf("내 나이는 %d세 입니다", age); // 입력 받은 정수값을 출력한다

		Scanner scanner = new Scanner(System.in); // 입력 클래스 import
		String name, address; // 문자열 변수 name과 address선언
		int age; // 정수형 변수 선언
		double weight; // 실수형 변수 선언

		System.out.println("이름, 주소, 나이, 체중을 빈칸으로 구분하여 순서대로 입력하세요"); // 출력 메시지를 출력한다
		name = scanner.next(); // 이름 입력 메소드 실행
		address = scanner.next(); // 주소 입력 메소드 실행
		age = scanner.nextInt(); // 나이 입력 메소드 실행
		weight = scanner.nextDouble(); // 체중 입력 메소드 실행

		System.out.printf("당신의 이름은 %s입니다.%n", name);
		System.out.printf("당신의 주소은 %s입니다.%n", address);
		System.out.printf("당신의 나이은 %d입니다.%n", age);
		System.out.printf("당신의 체중은 %.1fkg입니다.%n", weight);
		// 이름, 주소, 나이, 체중 변수들에 입력받을 값을 해당 실행문에 맞춰 출력한다

		int x = 100;
		int resultPlus = + x; // + 부호
		int resultMinus = - x; // - 부호
		
		System.out.println(reusltPlus); // x값 앞에 + 부호
		System.out.println(resultMinus); // x값앞에 - 부호로 출력
		
		double d = 1.11; // 실수형 변수에 1.11의 값을 대입
		double result = -d; // 실수형 변수에 -d의 값을 대입
		
		System.out.println(-d); // d변수 앞에 -가 붙은 값이 나오게됨
		System.out.println(result); // 결과 출력
		
		int num = 10; // 정수형 num 변수에 10의 값을 대입
		System.out.println(num); // num의 값 출력
		num++; // num = num +1; 증감연산자를 이용해 num값에 1을 증가시킨다
		System.out.println(num); //num값에 +1이 된 11의 값 출력
		
		int num =10; // 정수형 변수에 값10을 대입
		System.out.println(num++);	//10이 먼저 출력된 후 값에 +1 
		System.out.println(num);	// 11출력
		
		int num = 30;
		System.out.println(++num); // num 값에 1이 더해서 31 출력
		System.out.println(num); // 31 출력
		
		System.out.println(num++); // 현재 num의 값 31이 출력되고나서 값에 +1
		System.out.println(num);	// 32출력
		
		int x = 1;
		
		System.out.println(x++); // x값 1이 출력된 후의 값에 +1
		System.out.println(x); // 2 출력
		System.out.println(++x); // 현재 x값2에 +1이 더해져 3출력
		
		char alphabetX = 'X'; // 유니코드 정수 88로저장되어 'X'와 매핑
		System.out.println(alphabetX++); // alphabet가 출력된 후에 +1 되어 89가 됨
		System.out.println(alphabetX); // 89와 매핑된 Y가 출력
		
		boolean isHuman = false; // 논리형 변수에 기본값 입력
		System.out.println(!isHuman); // 변수앞에!로 해당 값이 거짓일때 출력 -> true
		System.out.println(isHuman); // 변수 값 출력
		
		int x = 100; //정수형 변수에 100의 값 대입
		int y = 200; //정수형 변수에 200의 값 대입
		
		System.out.println(x + y);	// 100 + 200
		System.out.println(x - y);	// 100 ` 200
		System.out.println(x * y);	// 100 * 200
		System.out.println(x / y);	// 100 / 200 - 정수형 계산으로 소수점자리 빼고 출력
		System.out.println(x % y);	// 100 % 200
		
		double num1 = 1.2345; // 실수형 변수에 값을 대입한다
		int num2 = 6; // 정수형 변수에 값을 대입했다
		System.out.println(num1 + num2); // num2를 double로 형 변환하여 연산
		
		int result = 1000000 * 100000; // 정수형 변수에 값 대입
		System.out.println(result); // 정수형의 표현 범위를 초과하여 쓰레기 값이 나옴
		
		int x = 10; // 정수형 변수에 10의 값을 대입
		int y = 1;	// 정수형 변수에 1의 값을 대입
		
		y += x; // y의 값에 x를 더한 값 = y 값
		System.out.println(y); // 11

		y *= x; // y*x 를 y의 값으로 넣어준다
		System.out.println(y); // 110
		
		y %= x;
		System.out.println(y); // y를 x로 나누고 그 값에 나머지를 출력한다 // 0 출력
		
		int a = 10; // 정수형 변수에 값 대입
		int b = 20; // 정수형 변수에 값 대입
		
		System.out.println(a > b); // false
		System.out.println(a <= b); // true
		System.out.println(a == b); // false
		System.out.println(a != b); // true
		// 등호를 사용한 결과값은 true나 false로 출력한다
		
		int a = 10; // 정수형 변수에 값 대입
		int b = 11; // 정수형 변수에 값 대입
		
		System.out.println(a <= b); // true
		System.out.println(a == b); // false
		System.out.println(a != --b); // false	
		
		boolean b1 = true; 
		boolean b2 = false;
		boolean b3 = true;
		boolean b4 = false;
		// 각각의 논리형 변수에 값을 대입하고 선언한다
		
		System.out.println("###논리곱###"); // 메시지 출력
		System.out.println(b1 && b2); // 하나만 true라서 false
		System.out.println(b1 && b3); // 두 항이 모두 true라서 true 
		System.out.println(b2 && b4); // 두 항이 모두 false 라서 false
		System.out.println(); // 출력 메소드 줄바꿈
		
		System.out.println("###논리합###"); // 메시지 출력
		System.out.println(b1 || b2); // 두 항중 하나가 true 라서 true
		System.out.println(b1 || b3); // 두 항이 모두 true라서 true 
		System.out.println(b2 || b4); // 두 항이 모두 false 라서 false
		
		
		System.out.println("###베타적 논리합###"); // 메시지 출력
		System.out.println(b1 ^ b2); // 두항이달라서 true
		System.out.println(b1 ^ b3); // 두항이같아서 false
		
		int num = (7 >1) ? 1 : 2; // (조건식) ? true일때값 : false일때값
		System.out.println(num); // true이므로 1출력
		
		int num = 0;
		
		if(7 > 1) { 
			num =1; //조건식이 true일때 값을 대입
		}else {
			num = 2; // 조건식이 false일때 값을 대입
		}
	System.out.println(num); // 조건식이 true 이므로 1을 출력한다

		int result = 0; // 정수형 변수에 기본값을 대입한다
		if(3 > 2) {
			result =3; // if(조건식) 이 true일때 값을 대입한다
		}
		System.out.println(result); // true이므로 값은 3출력
		
		Scanner sc = new Scanner(System.in); // 입력 클래스 import
		System.out.println("나이를 입력하세요"); // 출력 메시지
		
		int age = sc.nextInt(); // 나이 값을 사용자로부터 입력받는다
		if(age > 19) { // 조건이 true 일때 성인입니다. 출력
			System.out.println("성인입니다.");
		}
		System.out.println("프로그램을 종료합니다."); // 아닐경우 종료
		
		int num = 5; // 정수형 변수에 5값을 대입한다
		
		if(num > 4) {
			System.out.println(num + "는 4보다 큽니다"); //조건식이 true일 경우 실행
		}else {
			System.out.println(num + "는 4보다 작습니다."); //false일 경우 실행
		}
		
		int a = 4; // 정수형 변수에 4를 대입한다
		int b = 10; // 정수형 변수에 10을 대입한다
		
		if(a > b) {
			System.out.println("a가 b보다 큽니다."); //조건식이 true일 경우 실행할 문장
		}else {
			System.out.println("a가 b보다 작거나 같습니다.");
		} // 조건식이 false일 경우 실행할 문장
		
		int a = 5; // 정수형 변수에 5를 대입한다
		int b = 10; // 정수형 변수에 10을 대입한다
		int max = 0; // 정수형 변수에 기본형0을 대입한다
		
		if(a > b) {
			max = a; // 조건식이 true일 경우 실행할 문장
		}else {
			max = b; // 조건식이 false일 경우 실행할 문장
		}
		System.out.println(a + "와" + b + " 중에 큰 수는" + max + "입니다.");
		// 5와 10 중에 큰 수는10입니다.
		
		Scanner sc = new Scanner(System.in); // 입력 클래스 import
		System.out.println("나이를 입력하세요"); // 메시지 출력
		
		int age = sc.nextInt(); // 사용자로부터 정수를 입력받는 메소드
		
		if(age > 19) {
			System.out.println("성인입니다.");//if조건식이 true일때 실행되는 문장
		}else {
			System.out.println("미성년자입니다.");//조건식이 false일때 실행되는 문장
		}
		
		int favorite = 7; //정수형 변수에 7을 대입한다
		
		if(favorite < 5) {
			System.out.println("좋아하는 숫자가 5보다 작습니다."); //조건식1이 true일때 실행한다
		}else if(favorite > 5) {
			System.out.println("좋아하는 숫자가 5보다 큽니다."); //조건식1이 false이고 조건식2가 true일 때 실행한다
		}else {
			System.out.println("좋아하는 숫자가 5입니다.");//조건식 1과2가 false이면 출력한다
		}
		
		int favorite = 7; //정수형 변수에 7을 대입한다
		
		if(favorite > 5) {
			System.out.println("좋아하는 숫자가 5보다 큽니다.");//조건식1이 true일때 실행할 문장
		}else if (favorite == 7) {
			System.out.println("좋아하는 숫자는 7입니다.");//조건식1이 false이고 조건식2가 true일때 실행할 문장
		}
		
		Scanner sc = new Scanner(System.in); //입력 클래스 import
		System.out.println("나이를 입력하세요."); //출력 메시지
		int age = sc.nextInt(); //사용자로부터 정수를 입력받는다
		if(age > 19) {
			System.out.println("성인입니다."); // 조건식1이 true 면 실행
		}else if(age > 13) {
			System.out.println("청소년입니다.");// 조건식1은 false이고 조건식2는 true면 실행
		}else if(age > 6) {
			System.out.println("어린이입니다.");//조건식1과 2 모두 false 이고 조건식3은 true이면실행
		}else {
			System.out.println("유아입니다"); // 모든조건식에 false 이면 출력
		}
		
		int num = 7; //정수형 변수에 7의 값 저장;
		
		switch(num) {
		case 1:
			System.out.println("num은 1입니다."); //값이1일때 출력
			break;// 출력했으면 switch문을 빠져나간다
		case 7 :
			System.out.println("num은 7입니다."); //값이 7일때 출력
			break;// 출력했으면 switch문을 빠져나간다
		default :
			System.out.println("numdms 1도 7도 아닙니다."); //값이 없을때 출력한다
		} //실행결과 - num은 7입니다.
		
		int num = 7; //정수형 변수에 7의 값 저장;
		
		switch(num) {
		case 1:
			System.out.println("num은 1입니다."); //값이1일때 출력
			
		case 7 :
			System.out.println("num은 7입니다."); //값이 7일때 출력
			
		default :
			System.out.println("numdms 1도 7도 아닙니다."); //값이 없을때 출력한다
		} //실행결과 - num은 7입니다 num은 1도 7도 아닙니다
		
		Scanner sc = new Scanner(System.in); //입력 클래스 import
		System.out.println("원하는 숫자를 입력하세요. (1~5)"); //출력 메시지
		
		int num = sc.nextInt(); //입력 메소드 실행
		switch(num) {//num에 맞는 값을 출력
		case 5;
		System.out.println("5를 입력하였습니다.");
		break;//값이 5면 출력하고 swich문을 빠져나간다
		case 4;
		System.out.println("4를 입력하였습니다.");
		break;//값이 4면 출력하고 swich문을 빠져나간다
		case 3;
		System.out.println("3를 입력하였습니다.");
		break;//값이 3이면 출력하고 swich문을 빠져나간다
		case 2;
		System.out.println("2를 입력하였습니다.");
		break;//값이 2이면 출력하고 swich문을 빠져나간다
		case 1;
		System.out.println("1를 입력하였습니다.");
		break;//값이 1이면 출력하고 swich문을 빠져나간다
		default:
			System.out.println("1~5까지의 숫자를 입력하세요.");//일치하는 값이 없을경우 출력한다
		}
		
		int sum = 0; // 정수형 변수에 기본형 값을 대입한다
		
		for(int i =1; i <= 10; i++) { //for(i를 1부터 10보다 작거나 같을때까지 1씩증가하며 실행한다)
			sum += i;// 증감으로 1씩 더해지는 값을 sum의 변수에 누적해서 더한다
		}
		System.out.println("합 :" + sum); //메시지 출력
		
		int sum = 0; //합을 저장하는 변수 선언
		
		for(int i = 1; i <= 100; i++) {//1부터 100까지 반복한다
			if(i % 2 == 0) {//조건식이 짝수 일때
				sum += i; //짝수일때의 합을 구한다
			}
		}
		System.out.println("합 :" + sum);//합: 2550 메시지 출력
		
		
		for(int i = 2; i <= 9; i++) {
			for(int j = 1; j <= 9; j++) {
				System.out.println(i + "X" + j + "=" + (i * j) + "\t");//2부터 9까지 반복 실행하고 출력한다
			}
			System.out.println();//줄바꿈
			
		}
		
		for(int i = 0; i < 7; i++) { //for(초기식; 조건식; 증감식)
			for(int j = 0; j < 7 - i; j++) {
				System.out.println(" "); // 공백을 하나씩 줄어들도록 반복하여 출력한다
			}
			for(int k = 0; k < (2*i); k++) {
				System.out.println("*");// 별의 모양을 홀수로 증가시킨다
			}
			System.out.println(); //줄바꿈한다
		}
		
		int sum = 0; //정수형 변수를 선언한다
		int i =1; //정수형 i를 선언한다
		
		while(i <= 10) { //10보다 작을때까지 반복실행한다
			sum += i; // sum에 i값을 누적한다
			i++; // i가 1씩 증가한다
		}
		System.out.println("합 : " + sum); //메시지 출력
		
		int sum = 0; //정수형 변수를 선언
		int i = 1; // 정수형 변수 i의 값에 1을 대입
		
		do {
			 sum += i; //i의 값을 누적하여 더한다
			 i++; // i가 1씩 증가한다
			 
		 }while(i <= 10); // i가 10보다 작거나 같을때까지 반복실행한다
		System.out.println("합 : " + sum); // 메시지 출력
		
		int sum =0; //정수형 변수를 선언한다
		for(int i =1; i <= 100; i++) { // i를 1부터 100까지 반복 실행한다
			
			if(i % 2 != 0) { // i/2의 나머지 값이 0이 아닐때
				continue; // 이번 차수를 종료하고 다음 반복문을 실행한다
			}
			sum += i; // sum에 i의 값을 누적한다
		}
		System.out.println("짝수 합 : " + sum); // 출력 메시지
		
		int magicNumber = (int)(Math.random() * 50) + 1; // 1~50사이에 숫자를 랜덤으로 뽑고 +1을 더한 값을 변수에 저장
		Scanner sc = new Scanner(System.in);//입력 클래스 import
		boolean isMatched = false; // 논리형 변수 선언
		
		for(int i = 0; i < 10;) i++){ //0부터 9까지 반복실행
			System.out.println("찾는 숫자를 입력 >> "); //출력 멧지ㅣ
			int guess = sc.nextInt(); //입력 메소드
			
			if(guess == magicNumber) { // 조건식이 true일 경우 문장을 실행한다
				System.out.println((i+1) + "번째에 맞췄습니다"); // 출력 메시지
				isMatched = true ; // 정답이 맞았을때
				break; //정답을 맞춰서 종료
			}else if(guess > magicNumber) { // 조건식이 true일때
				System.out.println("맞춰야할 숫자가 더 적습니다.");// 메시지 출력
			}else if(guess < magicNumber) { // 조건식이 true일때
				System.out.println("맞춰야할 숫자가 더 큽니다.");//메시지 출력
			}
		}

		if(!isMatched) {// if(조건식)이 true일때
			System.out.println("정답을 맞추지 못했습니다.");//메시지 출력
		}
		
	}
}
