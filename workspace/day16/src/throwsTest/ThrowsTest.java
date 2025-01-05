package throwsTest;
//5번 : 예외 던지기(throw는 메소드 선언부에 사용한다)
public class ThrowsTest {

	static void method() throws InterruptedException {
		for(int i =0; i < 10; i++) {
			System.out.println(i);
			Thread.sleep(500); //500 => 0.5초, 1000 = 1초
		}
	}
	
	
}
