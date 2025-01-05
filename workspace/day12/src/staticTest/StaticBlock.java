package staticTest;
//4번 : 정적 블록
// 데이터 베이스 연동 시 초기화 때 사용됨
public class StaticBlock {
	public static void main(String[] args) {
		System.out.println("메인메소드 실행");
	}

	// 정적블록 : 클래스가 로드될 때 먼저 실행된다(main메소드보다 먼저 출력)
	static {
		System.out.println("클래스가 로드될 때 이 블록이 실행됩니다");
	}

}
