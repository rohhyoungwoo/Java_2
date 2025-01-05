package marvelTask;

public class MarvelHeroMain {
	public static void main(String[] args) {
		
		//아이언맨(ironMan)과 헐크(hulk) 객체를 만들고 정보출력
		MarvelHero ironMan = new MarvelHero("아이언맨" , "날면서 빔쏘기" , 40);
		MarvelHero hulk = new MarvelHero("헐크" , "펀치로 뭉개버리기" , 40);
//System.out.println(ironMan);	
		ironMan.printInfo();
		ironMan.performAction1();

		hulk.printInfo();
		hulk.performAction2();
//System.out.println(ironMan.name);		
//System.out.println(ironMan.superpower);		
//System.out.println(ironMan.age);		
//		MarvelHero hulk = new MarvelHero(null, null, 0);
		
		
	}
}
