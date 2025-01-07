package ifTest;
//7번 : if~else if~else문
public class IfTest03 {
	public static void main(String[] args) {
		int num1 = 2, num2 = 2;
		
		System.out.println("1번");
		
		if(num1 > num2 ) {
			System.out.println("2번");
		}else if(num1 == num2) {
			System.out.println("3번");
		}else {
			System.out.println("4번");
		}
		System.out.println("5번");
	}
}
