package array;
// 3번 : 배열의 저장공관과 값
public class ArrayTest03 {
	public static void main(String[] args) {
		int[] arData = {4, 3, 2, 5};
		//정수형배열 arData stack 메모리영역에 생성(참조변수),
		//heap 메모리영역에 4칸짜리 4, 3, 2, 5라는 값을 저장한 배열을 생성하고 참조값(주소값)을
		// arData라는 참조변수에 담는다
		System.out.println(arData);
		
		System.out.println(arData[0]); //값
		arData[0] += 10; //arData[0] 저장공간, 값
		System.out.println(arData[0]); //값
		
		int data = arData[3];	//값
		System.out.println(data);
		
		double data1 = arData[2];
		System.out.println(data1);
		
//		arData[20] = 10;
//		System.out.println(arData[20]);
		
		System.out.println("배열의 길이 : " + arData.length);
		
		double[] arData1 = null; //double 타입의 배열 선언
//		arData1 = new int[3]; //double 타입의 배열변수에 int[] 타입의 배열을 할당하려고 하면 컴파일오류가 발생한다
		arData1 = new double[3]; //double 타입의 배열 생성
		// 배열은 선언과 생성의 타입이 일치해야한다!!!
		System.out.println("배열의 길이 : " + arData.length);
		
		
		
		
		
		
		
		
	}
}
