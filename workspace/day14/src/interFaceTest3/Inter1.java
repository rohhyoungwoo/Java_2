package interFaceTest3;
// 인터페이스의 디폴트메소드와 클래스의 메소드가 동일한 경우
public interface Inter1 {
 default void printText() {
		System.out.println("Inter의 printText메소드");
	}
}
