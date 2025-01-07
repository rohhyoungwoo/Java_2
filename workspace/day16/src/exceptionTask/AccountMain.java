package exceptionTask;
//10번 : 실습

public class AccountMain {
   public static void main(String[] args) {
      // AccountMain클래스
      //   메인메소드
      //   입금메소드 호출
      //   출금메소드 호출

      Account a = new Account(5000);
      
      try {
         a.withdraw(15000);
      } catch (AccountException e) {
//         System.out.println(e.getMessage());
//         System.out.println(e);
         e.printStackTrace();
      }

      a.deposit(1000);
   }
}
