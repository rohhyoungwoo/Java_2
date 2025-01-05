package constructorBasic1;
//6번 생성자
public class TvMain {
   public static void main(String[] args) {
      Tv myTv = new Tv();
      Tv tv = new Tv(true, 1);
      Tv myTv1 = new Tv(true, 0, 0, null, null);
      Tv myTv2 = new Tv(false, 10, 20, "red", "lg");
      
      //필드 초기화
//      myTv1.brand = "LG";
//      myTv1.color = "black";
//      myTv1.ch = 10; //초기채널
//      myTv1.vol = 5; //초기볼륨
//      
//      myTv2.brand = "Sam";
//      myTv2.color = "black";
//      myTv2.ch = 5;
//      myTv2.vol = 10;
      
      System.out.println(myTv1 +" TV를 조작합니다");
      System.out.println(myTv2 +" TV를 조작합니다");
      System.out.println(myTv1.power);
      myTv1.powerOnOff();

      
      
      
      
   }
}

















