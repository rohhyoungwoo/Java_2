package teamtask;

public class Main {
	/* Main클래스
	 * Main 클래스
	 * 객체 3개 생성, 오버라이딩 된 메소드 포함한 모든 메소드 출력
	 * 
	 * 로직
	 * UserService 클래스 객체 생성
	 * 회원가입 메소드 -> sign() 호출
	 *    sign 내에서 id 중복 검사 체크 메소드 호출하여 T/F에 따라 회원가입 진행
	 * 
	 * 로그인 메소드 -> login() 호출
	 * 
	 * */
	
	
	public static void main(String[] args) {
		UserService us = new UserService();
		
		us.sign(); // 회원가입 메소드 호출
		us.sign();
		us.sign();
		
		
	}
	
	
	
	

}