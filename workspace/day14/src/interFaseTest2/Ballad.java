package interFaseTest2;

public class Ballad implements Music{

   @Override
   public void mode() {
      System.out.println("발라드모드");
   }
   
   void onlyBallad() {
      System.out.println("onlyBallad 실행");
   }

}