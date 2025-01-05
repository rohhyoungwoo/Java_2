package interfaceTest4;

public class BasicHeater2 extends HeaterAdapter{

	@Override
	public void on() {
		System.out.println("리코몬으로 히터를 켭니다");
		
	}

	@Override
	public void off() {
		System.out.println("리모콘으로 히터를 끕니다");
		
	}

	@Override
	public void turbo() {
		System.out.println("터보모드를 실행합니다");
		
	}

}
