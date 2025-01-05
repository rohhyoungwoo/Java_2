package casting4;

public class Main {
   public static void main(String[] args) {
      
	  //업캐스팅
      Hero ironMan = new IronMan("아이언맨");
      Hero hulk = new Hulk("헐크");
   
      System.out.println(ironMan);
      System.out.println(hulk);
      
      // 다운캐스팅
      IronMan ironMan2 = (IronMan) ironMan;
      
      
   }
}