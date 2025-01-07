package methodTest;

import java.util.Scanner;

//14번 : 메소드 정의 및 호출
public class MethodTest02 {
   public static void main(String[] args) {
      // 메소드 호출 방법2가지
//      1) 메소드 정의하는 부분에서 static 키워드를 붙인다 (static 키워드 배우기 전까지 사용하지 않음)
//      (main메소드가 메모리에 할당될 때 add메소드도 같이 메모리 할당시키는 방법)

//      2) 메인 메소드에 add메소드가 있는 클래스를 알려준다
//      클래스명 변수 = new 클래스명();
      MethodTest02 mt = new MethodTest02();
      mt.add(10, 20);
      mt.add(5, 5);

      MethodTest02 mt1 = new MethodTest02();
      System.out.println(mt);
      System.out.println(mt1);
      mt1.add(10, 10);

      
      System.out.println(mt.printSum(1, 5));
      
      
   }

   void add(int num1, int num2) {
      System.out.println(num1);
      System.out.println(num2);
      System.out.println(num1 + num2);
   }
   // 2개의 값을 더하는 기능의 메소드 add
   // 리턴타입 => void
   // 메소드명 => add
   // 매개변수 => int num1, int num2
   // 실행할 문장 => num1출력, num2출력, num1+num2 출력
   // 리턴값 x
   
   
   int printSum(int num1, int num2) {
	   int sum = num1 + num2;
	   return sum;
   }
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
}
