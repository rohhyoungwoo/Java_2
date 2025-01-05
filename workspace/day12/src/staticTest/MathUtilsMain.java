package staticTest;
//1번 : 정적 메소드
public class MathUtilsMain {
	public static void main(String[] args) {
		//getMax() 호출 => 매개변수o, 리턴값o
		System.out.println(MathUtils.getMAx(10, 20));
		
		
		//round() 호출
		System.out.println(MathUtils.round(5.5));
		
		//다른 클래스의 정적 메소드를 호출할 때 클래스명.메소드명 사용
	}
}
