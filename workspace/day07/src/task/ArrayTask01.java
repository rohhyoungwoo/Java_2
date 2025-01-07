package task;

import java.util.Scanner;

public class ArrayTask01 {
	public static void main(String[] args) {
		// 배열문제 조건 1) 칸수만 알고있다고 가정
		// 조건 2) 반드시 length 사용
		// 조건 3) 값을 대입하는 반복문, 값을 출력하는 반복문 각각 사용

		// 1. 100~1까지의 값을 배열에 넣고 출력
		// 일반 for문만 사용
		// 로직구성
		// 사용할 문법 - for문, 값 대입 출력메소드, 값 출력 메소드, length사용, int 배열 선언
		// 1. int 배열 선언 int[] num = new int[100];
		// 2. for(int i = 0; i <= num.length; i++){
		// 출력
		// }
//		int[] num = new int[100];
//		for (int i = 0; i <= num.length; i++) {
//			num[i] = i;
//			System.out.println((100 - i));
//		}

		// 2. 1~10까지의 값을 배열에 넣고 총 합 구하기
		// 일반 for문만 사용
		// 로직구성
		// 사용할문법 -총합 변수 , 배열 선언, 출력 메소드, for문 사용
		// 1. int 배열 선언
		// 2. for( int i =0; i < 10; i++){
		// sum 변수 선언
		// }

		// 3. 사용자에게 4개의 숫자를 입력받고 입력받은 값을 배열에 저장한 후 배열의 평균(소수점 3자리까지) 구하기
		// 일반 for문, for-each문 상관없음
		// 로직구성
		// 사용할문법 -for문, 변수 4개 선언, 배열 선언, 배열 평균 값 선언(실수형), 입력 메소드, 출력 메소드
		// 1. int 변수 4개, 배열 1개, 배열의 평균 (실수형) 1개 선언
		// 2. 출력 메시지 " 4개의 숫자 입력(띄어쓰기로 구분하여): "
		// 3. 입력 메소드 4개
		// 4. for문, for-each문
		// for(int i =0; i <= num.length; i++){
		// num.length-1 의 값 출력?
		// }

		// 4. 0, 1, 2, 3, 4, 0, 1, 2, 3, 4 값을 배열에 담고 출력
		// 출력시 for-each문 사용
		// 로직구성
		// 사용할문법 - 배열 선언, 출력메소드, for-each문사용
		// 1. int[] num = {0, 1, 2, 3, 4, 0, 1, 2, 3, 4};
		// 2. for-each
		// for(int i =0; i < 10; i++){
		// 실행할 문장;
		// }
		// for(num : [10]){
		// 실행할 문장;
		// }

		// 5. A~F까지를 C만 제외하고 배열에 담아 출력
		// 일반 for문
		// 초기식 int i = 0;
		// 로직구성
		// 사용할문법 - for문, 출력메소드
		// 1. for(int i =0; < 7; i++){
		//
		// }
		// for(조건식=C제외)

		// 6. aBcDeFgHiJkLmNPqRsTuVwXyZf를 순서대로 배열에 담아 출력
		// 로직구성
		// 사용할문법 - 문자형 배열 선언, for문, 출력메소드
		// 1. char[] string = {aBcDeFgHiJkLmNoPqRsTuVwXyZ};
		// 2. for문?
//				char[] string = {a, B, c, D, e, F, g, H, i, J, k, L, m, N, o, P, q, R, s, T, u, V, w, X, y, Z};

		// 7. 5개의 정수를 입려한 뒤 배열에 담고 최소값과 최대값 출력하기
		// 일반 for문
		// 로직구성
		// 사용할문법 - 정수형 5개 변수 선언, 입력 메소드, 입력 클래스, 배열 선언, 출력 메소드, for문
		// 1. 5개의 정수형 변수 선언
		// 2. 입력 클래스 import
		// 3. 출력 메시지 "정수 입력 : "
		// 4. 입력 메소드 sc.next();
		// 5. 배열 선언
		// 6. for(

		// 8. 사물함의 비밀번호를 설정하고 사용자에게 이용할 사물함 번호와 비밀번호를 입력받아
		// 입력된 사물함의 비밀번호와 설정한 비밀번호를 비교하여 일치 여부 출력하기
		// 로직구성
		// 사용할문법 - 정수형 변수 선언, 입력 메소드, 출력 메소드, for문, if문
		// 1. 입력 클래스 import
		// 2. 비밀번호 설정 출력 메시지
		// 3. 입력 메소드 sc.nextInt();
		// 4. for문, if문

		// 배열이용x
		//0) Scanner 입력클래스 import
		//1) 사물함 번호 설정
		//2) 비밀번호 설정
		//3) 사용할 사물함번호와 비밀번호 입력 후 일치여부 확인(if)
		
		Scanner sc = new Scanner(System.in);
//		System.out.println("사물함 번호를 입력하세요 :");
//		int num1 = sc.nextInt();
//		System.out.println("선택한 사물함의 비밀번호를 설정하세요 :");
//		int arPw = sc.nextInt();
//		
//		System.out.println("선택할 사물함 번호를 입력하세요 : ");
//		int choice =sc.nextInt();
//		System.out.println("사용할 사물함 번호의 비밀번호를 입력하세요 : ");
//		int choicePw = sc.nextInt();
//		
//		
//		if(arPw == choicePw) {
//			System.out.println("비밀번호가 일치합니다. 사물함을 이용하세요.");
//		}else {
//			System.out.println("비밀번호가 일치하지 않습니다.");
//		}
		
		//1) 5칸짜리 사물함의 비밀번호를 각각 배열에 저장한다
		//2) 사용자에게 이용할 사물함 번호를 묻는다
		//3) 비밀번호를 입력받아 확인한다
		//4) 일치/불일치를 출력한다
		
		int[] arPw = new int[5];
//		int[] arPw1 = {1111, 2222, 3333 ,4444, 5555};
		String mainMsg = "번 사물함의 비밀번호 설정 : ";
		String choiceMsg = "이용할 사물함 번호 입력 : ";
		String inputMsg = "비밀번호 입력 : ";
		String result = null;
		int choice = 0, inputPw = 0;
		
		for(int i = 0; i < arPw.length; i++) {
			System.out.println(i + 1 + mainMsg);
			arPw[i] = sc.nextInt();
		}
//		for(int data : arPw) {
//			System.out.println(data);
//		}
		System.out.println(choiceMsg);
		choice = sc.nextInt();
		
		System.out.println(inputMsg);
		inputPw = sc.nextInt();
		
		if(arPw[choice - 1] == inputPw) {
			System.out.println("비밀번호 일치");
		}else {
			System.out.println("비밀번호 불일치");
		}
		
		// 9. 학생 1명의 3과목 총점과 평균(소수점 3자리까지)을 구하고 출력하기
		// 3과목은 배열에 입력받아 저장하며 for-each문만 사용(일반 for문 사용금지!)
		// 로직구성
		// 사용할문법 - 3과목 변수 선언, 총점과 평균 실수형 변수 선언, 입력 클래스, 입력 메소드, 출력 메소드, for-each문
		// 1. 입력 클래스 import
		// 2. 3과목 배열 선언
		// 3. 출력 메시지 3과목:
		// 4. 입력 메소드 sc.next();
		// 5. for-each문 사용..
		
		//1) 입력 클래스 import
		//2) 3칸 배열 선언
		//3) 합계 저장할 변수(int), 평균저장할 변수(double)
		//4) 3과목의 정수 입력받는 for-each문
		//5) 총점 계산할 for-each문
		//6) 결과 출력(printf)
		
		int[] scores = new int[3];
		int index = 0; // for-each문에서 사용하기 이ㅜ한 변수
		int total = 0;
		double avg = 0.0;
		
		System.out.println("3과목의 점수를 입력하세요 : ");
		for(int i = 0; i < scores.length; i++) {
			scores[i] = sc.nextInt();
		}
		
		for(int score : scores) {
			System.out.println("점수 입력 : ");
			score = sc.nextInt();
			scores[index++] = score;
		}
		// for-each문에서는 인덱스 따로 추가 필요
		for(int score : scores) {
			total += score;
		}
		
		avg = (double) total / scores.length;
		System.out.println("총점 : %d\n", total);
		System.out.println("총점 : %.3f\n", avg);
	}
}
