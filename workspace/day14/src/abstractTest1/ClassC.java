package abstractTest1;
//3번 : 추상클래스를 상속받은 일반 클래스
public class ClassC extends ClassB{

   @Override
   void method1() {
      System.out.println("추상클래스를 상속받은 일반 클래스-메소드재정의");
   }

   void printNumber() {
      System.out.println("숫자 출력");
   }
   
}