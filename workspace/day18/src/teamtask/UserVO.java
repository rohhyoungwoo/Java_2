package teamtask;

public class UserVO {

	//   - UserVO 클래스
	//   유저번호, 아이디, 비밀번호, 이름, 나이
	//   모든 필드는 private으로 선언하고 생성자를 통해서만 초기화한다
	//   toString() 재정의하여 모든 필드의 값을 확인할 수 있도록해야하며 유저 번호 값으로 객체의 동일성을 비교한다
	   
	//필드
	//   유저번호, 아이디, 비밀번호, 이름, 나이 -> private   
	//생성자
	// -> 매개변수 받는 모든것
	//필드에서 private 사용
	// -> getter 사용
	//메소드 -> 오버로드 toString()
	// !객체비교
	// 번호는 int 이므로, == 연산자 활용
	
	      //UserVO 클래스, UserService, Main 클래스 선언
	      //private 필드 생성
	      //유저번호, 아이디, 비밀번호, 이름, 나이
	      //toString() 재정의 필드값 확인, 유저 번호 값으로 객체의 동일성 비교
//	       *  private num, ID, Passwd, name age
//	       *  
//	       *  모든 매개변수 가지는 <생성자>만들고
//	       *  this.필드 = 매개변수;
//	       *  
	      //필드
	      private int num;
	      private String ID;
	      private String passwd;
	      private String name;
	      private int age;
	      
	      //생성자
	      public UserVO(int num, String iD, String passwd, String name, int age) {
	         super();
	         this.num = num;
	         this.ID = iD;
	         this.passwd = passwd;
	         this.name = name;
	         this.age = age;
	      }
	      //toString 오버라이딩
	      @Override
	      public String toString() {
	         return "유저번호 : " + this.num + "아이디 : " + this.ID + "비밀번호 : " + this.passwd + "이름 : " + this.name + "나이 : " + this.age;
	               
	      }
	      //equals 오버라이딩
	      @Override
	      public boolean equals(Object obj) {
	         if(this.ID.equals(obj)) {
	            return true;
	         }else {
	            
	            return false;
	         }
	      }
	      
}
