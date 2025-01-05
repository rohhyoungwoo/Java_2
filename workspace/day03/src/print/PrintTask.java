package print;

public class PrintTask {
	public static void main(String[] args) {
	
//		//1. prinf를 사용해 형식에 맞게 출력하기
//		String name = "노형우";	//이름 : 본인이름
//		int age = 28;	//나이 : 본인나이
//		String hobby = "농구";	//취미 : 취미
//		double height = 174;	//키 : 실수형 2자리까지
//		double weight = 65;	//몸무게 : 실수형 3자리까지
//		
//		System.out.printf("이름 : %s\n나이 : %d\n취미 : %s\n키 : %.2f\n몸무케 : %.3f", name, age, hobby, height, weight);
//		
//		
//		
//		
//		
//		//2. 10진수의 값 255를 8진수, 16진수, 10진수로 각각 출력하기
//		int number = 255;
//				
//		System.out.printf("8진수:%o, 16진수:%x, 10진수:%d", number, number, number);
		
		//3. 상품정보를 println과 printf를 사용하여 아래 형식으로 출력하기
//		String name1 = "메로나";
//		String name2 = "누네띠네";
//		String name3 = "꼬북칩";
//		String name4 = "초코파이";
//		
		int num1 = 1500;
//		int num2 = 1200;
//		int num3 = 2000;
//		int num4 = 3000;
		
//		
		System.out.println("\n-----------------------");
		System.out.printf("%-5s\t\t%s\n", "상품명", "가격명");
		System.out.println("-----------------------");
		System.out.printf("%-5s\t\t%d원\n", "메로나", 1500);
		System.out.printf("%-5s\t\t%d원\n", "누네띠네", 1200);
		System.out.printf("%-5s\t\t%d원\n", "꼬북칩", 2000);
		System.out.printf("%-5s\t\t%d원\n", "초코파이", 3000);
		System.out.println("-----------------------");
		
		//	각 자리수는 5자리로 정렬, tab키 2번씩 사용
//		 -------------------------
//	      상품명         가격
//	      -------------------------
//	      메로나         1500원
//	      누네띠네       1200원
//	      꼬북칩         2000원
//	      초코파이       3000원
//	      -------------------------

		//4. 봄여름가을겨울을 아래와 같이 출력하기
		//출력은 1번으로 아래와 같이 출력하기
//		System.out.printf("봄\n\t\t여름\n\t가을\n\t\t겨울");
		
		//봄
		//		여름
		//	가을
		//		겨울
		
		
	}

}
