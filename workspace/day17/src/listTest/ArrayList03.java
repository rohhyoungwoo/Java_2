package listTest;

import java.util.ArrayList;
import java.util.List;

public class ArrayList03 {
	public static void main(String[] args) {
//		List<Integer> ll = new ArrayList<>(); //업캐스팅
		
		
		ArrayList<Integer> li = new ArrayList<>();
		
		//추가
		li.add(10);
		li.add(20);
		li.add(30);
		li.add(40);
		li.add(50);
		System.out.println(li);
		
		//값 가져오기 : index 번호로 특정 값 가져오기
//		try {
//			System.out.println(li.get(0));
//			System.out.println(li.get(10));
//		} catch (Exception e) {
//			System.out.println("범위를 벗어났습니다ㅋㅋ");
//		}
			
		//삭제 : index번호(int타입)
		//삭제한 요소를 반환
		System.out.println("인덱스 1의 값 " + li.remove(1) + "을 삭제했습니다");
		System.out.println(li);
		
		//삭제 : 값으로 검색하여 삭제(Object타입)
		//삭제 성공여부를 반환
		System.out.println("값 삭제 여부 : " + li.remove(Integer.valueOf(50)));
		
		//포함여부 검사 : 리스트에 존재하면 true 없으면 false
		System.out.println(li.contains(40));
		System.out.println(li.contains(100));
		
		//수정 : 수정 전의 값을 반환
		System.out.println(li);
		System.out.println(li.set(2, 50));
		System.out.println(li);
		
		
	}
}
