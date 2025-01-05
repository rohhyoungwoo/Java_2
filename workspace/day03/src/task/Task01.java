package task;

public class Task01 {
   public static void main(String[] args) {
       //1. 기본 자료형의 변수를 선언하고 초기화한 뒤 값을 출력하기
      
//      출력결과 예시
//      int: 100000
	   int number1;
	   number1 = 100000;
	   System.out.println("int: " + number1);
	   
//      long: 123456789L
	   long number2;
	   number2 = 123456789L;
	   System.out.println("long: " + number2);
	   
//      float: 3.14f
	   float number3;
	   number3 = 3.14f;
	   System.out.println("float: " + number3);
	   
//      double: 3.14159265359
	   double number4;
	   number4 = 3.14159265359;
	   System.out.println("double: " + number4);
	   
//      char: A
	   char string1;
	   string1 = 'A';
	   System.out.println("char: "+ string1);
	   
//      boolean: true
      boolean string2;
      string2 = true;
      System.out.println("boolean: "+ string2);
      
      //2. 이름과 생년월일을 저장할 상수를 선언하고 출력하기
      final String NAME = "노형우";
      final int YEER = 97;
      final int MONTH = 3;
      final int DAY = 20;
      
      System.out.println("제 이름은 " + NAME + "이고 " + "생년월일은 " + YEER + 0 + MONTH + DAY + "입니다");
      	  
//      출력결과
//      제 이름은 000이고 생년월일은 000000입니다
      
      //3. 아래 변수를 선언하고 변수의 데이터 타입과 값을 출력하기
      
      // 정수형 age 변수 선언, 값 : 25
      // 실수형 height 변수 선언, 값 : 160.5
      // 논리형 isStudent 변수 선언, 값 : true
      int age = 25; //정수형
      double height = 160.5;	//실수형
      boolean isStudent = true;		//논리형
      System.out.printf("나이 : %d, 타입은 정수형\n키 : %.1f, 타입은 실수형\n학생여부 : %s, 타입은 논리형", age, height, isStudent);
      
//      출력결과
//      나이 : 25, 타입은 000형
//      키 : 160.5, 타입은 000형
//      학생여부 : true, 타입은 000형
      
      //4. hobby라는 문자열 변수 선언 후 값을 초기화하여 출력하기(printf 한번만 사용)
      // 
//      출력결과
//      안녕하세요, 제 이름은 [000]입니다.
//      제 취미는 [00]입니다.
      String hobby;
      hobby = "농구";
      System.out.printf("\n안녕하세요, 제 이름은 [노형우]입니다.\n제 취미는 [%s]입니다.", hobby);
    		  
      //5. 아래 변수를 선언하고 각 자료형 변환을 수행하여 결과 출력하기
      String strNum = "100";
      
      int intNum = 200;
      double doubleNum = 300.5;
      char charLetter = 'C';
      boolean boolVal = true;
//      strNum을 정수로 변환하여 덧셈 연산 : intNum + strNum   
      System.out.println(intNum + strNum);
//      intNum을 실수로 자동 형변환하여 덧셈 연산 : intNum + doubleNum
//      charLetter를 정수로 변환하여 출력
//      boolVal을 문자열로 변환하여 출력
      
      
   }
   
}
