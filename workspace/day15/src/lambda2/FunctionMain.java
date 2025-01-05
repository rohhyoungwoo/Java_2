package lambda2;

public class FunctionMain {
   public static void main(String[] args) {

      // 익명클래스로 객체 생성
      FuntionalInter1 fi1 = new FuntionalInter1() {

         @Override
         public int addTen(int number) {
            return number + 10;
         }
      };

      // 람다식으로 객체 생성
      FuntionalInter1 fii = number -> number + 10;
      System.out.println(fi1.addTen(10));
      System.out.println(fii.addTen(5));

//      int addTen(int number) { return number + 10;}
//      메소드명 없애고 -> 추가
//      반환타입 추론가능 생략
//      매개변수 타입 추론 가능 생략가능
//      매개변수가 1개면 () 생략가능
//      number -> {return number + 10;}
//      number -> number + 10

   }
}
