package oper;

public class BitOper {
	public static void main(String[] args) {
//		System.out.println(10 & 11); //1010 & 1011 => 1010
//		System.out.println(10 | 11); //1010 | 1011 => 1011
//		System.out.println(10 ^ 11); //1010 ^ 1011 => 0001
//		System.out.println(~10); // ~1010 //-11
//		System.out.println(~5);
		
		System.out.println("십진수 : " + 10 + " => 이진수 : " + Integer.toBinaryString(10));
		System.out.println("십진수 : " + 11 + " => 이진수 : " + Integer.toBinaryString(10));

		//& and 두비트가 모두 1이면 1
		System.out.println("십진수 : " + (10 & 11));
		System.out.println("이진수 : " + Integer.toBinaryString(10 & 11));

		//| or 두 비트 중 하나라도 1이면 1
		System.out.println("10 | 11의 십진수 : " + (10 | 11));
		System.out.println("10 | 11의 이진수 : " + Integer.toBinaryString(10 | 11));
		
		//^ XOR 두 비트가 서로 다르면 1
		System.out.println("10 ^ 11의 십진수 : " + (10 ^ 11));
		System.out.println("10 ^ 11의 이진수 : " + Integer.toBinaryString(10 ^ 11));
		
		//~ NOT 0을 1로, 1을 0으로 바꿔줌
		// ~x = -(x + 1)
		System.out.println("~10의 십진수 : " + ~10));
		System.out.println("~10의 이진수 : " + Integer.toBinaryString(~10));

		
		System.out.println("~5의 십진수 : " + ~10));
		System.out.println("~5의 이진수 : " + Integer.toBinaryString(~10));
		
		//쉬프트연산자
		// <<, >>
		System.out.println(10 << 1); //00010100 << 1
		System.out.println("이진수 : " + Integer.toBinaryString(10 << 1));
		System.out.println(10 >> 1); //00000101 >> 1
		System.out.println("이진수 : " + Integer.toBinaryString(10 << 1));
		
		
		
	}
}
