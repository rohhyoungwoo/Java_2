package typeCasting;
//12번 : 자동 형변환
public class TypeCastion02 {
	public static void main(String[] args) {
		//1) 작은 자료형에서 큰 자료형으로 변환
		// int -> long
		int intVal = 100;
		long result1 = intVal;
		System.out.println(result1);
		
		// int -> float
		float result2 = intVal;
		System.out.println(result2);
		
		// int -> double
		double result3 = intVal;
		System.out.println(result3);
	
		// float(4byte) -> double(8byte)
		double result4 = result2;
		System.out.println(result4);
	
		//2) 연산시 자동 형변환
		// 정수와 실수의 연산
		int intVal2 = 10;
		double doubleVal2 = 3.14;
//		float result5 = (float) (intVal2 + doubleVal2);	// intVal2 + (float) doubleval2;
		double result5 = intVal2 + doubleVal2;
		System.out.println(intVal2 + doubleVal2);
		
		//3) 문자형('a')에서 정수형으로 변환
		char letter = 'a';
		int asciival = letter;
		System.out.println(letter);
		System.out.println(asciival);
		
		char letter2 = 'b';
		int asciival2 = letter2;
		System.out.println(letter2);
		System.out.println(asciival2);
		
		char letter3 = '가';
		int asciival3 = letter3;
		System.out.println(asciival3); //44032
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
