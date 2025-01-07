package task;

@FunctionalInterface
public interface FunctionalInter4 {
	String combineString(String str1, String str2);
//	int mul = (num1, num2) -> num1*num2;

	public static void main(String[] args) {

		// 익명클래스 객체 생성
		FunctionalInter4 fi4 = new FunctionalInter4() {

			@Override
			public String combineString(String str1, String str2) {
				return str1 + str2;
			}

		};

		// 람다식으로 객체 생성
		FunctionalInter4 fi41 = (str1, str2) -> str1 + str2;
		// 메소드명 없애고 -> 추가
		// 반환타입 추론가능 생략
		// 매개변수 타입 추론 가능 생략
		// 매개변수가 2개 이므로 소괄호 있어야함
		// (str1, str2) -> {return null;}
		// (str1, str2) -> null;

		System.out.println(fi41.combineString("짱구", "맹구"));
//		Integer.parseInt("5");

	}
}
