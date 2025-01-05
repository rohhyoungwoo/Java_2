package whileTest;
//13번 : while문 연습
public class WhileTest01 {
	public static void main(String[] args) {
		
//		int i = 1;
//		while(i <= 5) {
//			System.out.println("행복하다");
//			i++;
//		}
		
		
		//1부터 5까지 총합 구하기(while)
		//1) 총합구할 변수, 비교대상이 될 변수 선언
		//2) while(조건식 <= 5) {
		//3) 	총합 += 비교대상변수;
		//4) 	비교대상변수++;
		//5) }
		//6) 출력
		int total = 0, num = 0;
		while(num <= 5) {
			total += num;
			num++;
		}
		System.out.println("총합 : " + total);
		
		
		
		
		
		
		
		
		
	}
}
