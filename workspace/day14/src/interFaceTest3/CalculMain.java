package interFaceTest3;

public class CalculMain {
   public static void main(String[] args) {
//      Calculator cal = new Calculator(); //인터페이스 객체화 할 수 없다
      CalculImpl cal = new CalculImpl();
      System.out.println(cal.add(10, 20));
      System.out.println(cal.subtract(-10, 20));
      
   }
}
