package review;

public class CastingTask {
	public static void main(String[] args) {

//		Music ba = new Ballad();
//		Music hh = new HipHop();
//		Music rk = new Rock();



		check(new Ballad());
		check(new HipHop());
		check(new Rock());
		Ballad ballad = new Ballad();
		ballad = null;	//참조제거
		System.gc(); //권장하지 않음(개발자가 가비지컬렉션을 명시적으로 요청할 수 있으나 JVM이 반드시 죽시 실행하지는 않음)
		
		
	}
		//부모클래스 타입의 매개변수
		static void check(Music music) {
			music.mode();
			if(music instanceof Ballad) {
				((Ballad) music).onlyBallad();
			}else if(music instanceof HipHop) {
				((HipHop) music).onlyHipHop();
			}else if(music instanceof Rock) {
				((Rock) music).onlyRock();
			}
		}
		
		
		
		
		
}
