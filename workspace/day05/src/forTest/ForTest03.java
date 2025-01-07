package forTest;
// 12번 : for문 연습
public class ForTest03 {
	public static void main(String[] args) {
		
		//이름 5번을 출력
//		for(초기식; 조건식; 증감식) {
//			syso(번 이름);
//		}
		
		//1) for ( 초기식 int i = 1; i <= 5; i++);
		//2) { 출력(i + "번 이름")}
		
//		for(int i = 0; i <= 4; i++) {
//			System.out.println("노형우");
//		}
//
//			
//			
//			for(int i = 0; i <= 4; i++) {
//			System.out.println((i+1) + "번 노형우");
//		}
//		
//		
//		for(int i = 5; i > 0; i--) {
//			System.out.println((6-i) + "번 노형우");
//		}
		
		//1부터 100까지의 합
		//1) 총합 저장할 변수
		//2) for문(초기식 int i = 1; 조건식 i < 101; i++) {
		//3) 총합 저장할변수 += i; }
		//4) 합 출력
		
//		int total = 0;
//		
//		for(int i = 1; i < 101; i++) {
//			total += i;
//			System.out.println("i의 값: " + i + ", 1부터 100까지의 총 합 : " + total);
//		}
		
		//1부터 100까지의 짝수의 합
//		1번방법 : if문으로 짝수 확인
		//1. 짝수의 합 저장할 변수
		//2. for문(초기식 int i = 0; i < 100; i++) {
		//3.	if(i % 2 ==0) { //짝수
		//4.		총합 += i;
		//		}
		//	}
		//5.출력
		
		int total = 0;
		for(int i = 0; i <= 100; i++) {
			if(i % 2 == 0) {
				total += i;
				
			}
		}
		System.out.println(total);
		
		
//		2번방법 : for문에서 짝수만 반복
		//1. 총합구할 변수
		//2. for( i = 2; i <= 100; i += 2) {
		//3. 총합 += i }
		//4. 출력
		
		int total1 = 0;
		for(int i = 2; i <= 100; i += 2) {
			total1 += i;
		}
		System.out.println(total1);
		
		
		
//		3번방법 : i를 1부터 50까지, 짝수 생성하는 방법
		//1. 총합구할 변수
		//2. for(초기식 i = 1; i <= 50; i++) { //1부터 50까지 반복
		//3. 	총합 += i * 2; }
		//4. 출력
		
		int total2 = 0;
		for(int i = 1; i <= 50; i++) {
			total2 += i * 2;
		}
		System.out.println(total2);
		
		
		
		
		
		
		
		
	
	}
}
