package interFaseTest2;

public class Rock implements Music{

   @Override
   public void mode() {
      System.out.println("Rock 모드");
   }
   
   void onlyRock() {
      System.out.println("onlyRock 실행");
   }

}