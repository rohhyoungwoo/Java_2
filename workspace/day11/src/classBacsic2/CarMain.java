package classBasic2;
//5번 : 클래스의 특징3(객체 생성의 틀)
public class CarMain {
   public static void main(String[] args) {
      Car myCar = new Car();
      myCar.model = "Tesla Model 3";
      myCar.color = "black";
      myCar.speed = 0;
      
      System.out.println("모델명 : " + myCar.model);
      System.out.println("색상 : " + myCar.color);
      System.out.println("현재 속도 : " + myCar.speed);
      
      myCar.accelerate(30);
      System.out.println("현재 속도 : " + myCar.speed);
      
   }
}