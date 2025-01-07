package ex02_노형우;

public class Print {
	public static void main(String[] args) {
		
//		2. 15부터 30까지 중 짝수의 합을 출력하라
//		- 클래스명 : Print
//		- 단, while문을 사용할 것
		
		//로직구성
		//while문 사용해야함- while(조건식){
		//			반복실행할 문장;
		//}
		//숫자의 범위를 지정할 int형 변수 선언
		//짝수들의 합의 값을 저장할 변수 선언
		//15부터 30까지의 반복되는 수들 중 짝수들의 합, (+=) 필요
		int count = 14;
		int sum = 0;
		while(count < 31) {
			if(count%2 == 0) {
				sum += count;
			}
			count++;
		}
		System.out.println("15부터 30까지 중 짝수의 합 : " + sum);
		
		
	}
}
