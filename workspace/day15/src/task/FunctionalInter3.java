package task;

@FunctionalInterface
public interface FunctionalInter3 {
	int multiple(int num1, int num2);

	public static void main(String[] args) {

		FunctionalInter3 fi3 = new FunctionalInter3() {

			// 2개의 정수를 매개변수로 받아서 곱한 결과를 반환하는 메소드
			@Override
			public int multiple(int num1, int num2) {
				return num1 * num2;
			}

		};
		// 람다식
		FunctionalInter3 fii = (num1, num2) -> num1 * num2;
		System.out.println(fii.multiple(3, 4));
	}

}
