package array;
//2번 : 배열 index
public class ArrayTest02 {
	public static void main(String[] args) {
		//어떤값을 넣을 지 알 때
		int[] ar1 = {1, 2, 3, 4, 5};
		System.out.println(ar1);
		//ar1 => stack 메모리에 있는 참조변수(heap메모리에 저장된 배열의 시작주소 => 참조값)
		System.out.println(ar1[0]); 
		System.out.println(ar1[3]);
		//Heap메모리에 0번째인덱스번호(저장공간)에 저장된 출력 
		
		
		//몇칸 만들지 알 때
		int[] ar2 = new int[3];
		System.out.println(ar2); //ar2는 heap메모리에 저장된 시작주소값인 참조값을 담고 있다
		System.out.println(ar2[0]);
		//ar[0] 해당 배열의 첫번째 칸을 의미하고 변수처럼 사용할 수 있다
		//값을 모르기 때문에 해당 배열의 자료형의 초기값으로 자동 적용되어있다
		ar2[0] =1;
		ar2[1] = 2;
		ar2[2] = ar2[0] + ar2[1];
		System.out.println(ar2[0]);
		
		int[] ar3 = null;
		ar3 = new int[] {1, 2, 3};
		//new : heap 메모리의 (해당 칸)을 만들고 시작 주소값을 가져온다
		System.out.println(ar3);
		ar3[0] = 1;
		System.out.println(ar3[0]);
		
	
	}
}
