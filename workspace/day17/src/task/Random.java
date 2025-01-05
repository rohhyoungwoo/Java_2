package task;

<<<<<<< HEAD
public class Random<Integer> {
	public static void main(String[] args) {
		
	
	//필드?
	int[] numbers = new int [6];

	
	for(int i = 0; i < numbers.length; i++) {
		
	}
	
	
	
	}
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD

//public class Random<Integer> {
//	public static void main(String[] args) {
//		
//	
//	//필드?
//	int[] numbers = new int [6];
//
//	
//	for(int i = 0; i < numbers.length; i++) {
//		
//	}
//	
//	
//	
//	}

=======
>>>>>>> a8ac738d8420ce7a7d3137910808734830504941
=======
>>>>>>> a8ac738d8420ce7a7d3137910808734830504941
=======
>>>>>>> a8ac738d8420ce7a7d3137910808734830504941
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Random {

	// ArrayList, HashSet을 사용하여 중복을 허용하지 않는 6개의 랜덤숫자를 저장
	// Random 클래스를 이용하여 1부터 45사이의 랜덤 숫자를 생성하고
	// 정렬해서 출력 - collections

	// 랜덤클래스 생성
	// ArrayList, HashSet객체 생성
	// 랜덤클래스에 1부터 45사이의 랜덤 숫자를 생성
	// collections 에 sort 메소드 사용하여 정렬하고 출력
//	static void lotto(int[] num) {
//	
//		for (int i = 0; i < num.length; i++) {
//			num[i] = ((int) (Math.random() * 45) + 1);
//		}
//		System.out.println(num);
//	}

	public static void main(String[] args) {

//		HashSet lotto = new HashSet();
//		// 1부터 45사이의 랜덤 숫자 생성
//	while (lotto.size() < 6) {
//		lotto.add((int) (Math.random()*45)+1);
//	}

		HashSet numbers = new HashSet();
		int[] numbers1 = new int[6];
		for (int i = 0; i < numbers1.length; i++) {
			numbers1[i] = ((int) (Math.random() * 45) + 1);
			numbers.add(numbers1[i]);
		}
		System.out.println(numbers);
//	
		ArrayList<Integer> numbers2 = new ArrayList<>(numbers);
//	System.out.println(numbers2);
		Collections.sort(numbers2);
		System.out.println(numbers2);

//	for(int lotto2 : numbers) {
//		System.out.print(lotto2);
//		System.out.print(" ");
//	}

	}

>>>>>>> 2e3cd8db9509ee34d5befd6579f8d6e350123bec
}
