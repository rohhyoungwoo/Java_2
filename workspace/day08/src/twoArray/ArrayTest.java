package twoArray;

import java.util.Arrays;

//7번 : Array.sort()를 이용한 정렬
public class ArrayTest {
	public static void main(String[] args) {
		int[] number = {5, 2, 9, 1, 6};
		
		System.out.println("정렬 전 : " + Arrays.toString(number));
		
		Arrays.sort(number, 1, 4); //부분정렬 1~3까지 인덱스 정렬
		
		System.out.println("정렬 후 : " + Arrays.toString(number));
	}
}
