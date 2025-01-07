package ex03_노형우;

public class Stars1 {
	public static void main(String[] args) {

		// (1)피라미드 출력

		for (int i = 0; i < 3; i++) {

			for (int j = 0; j < 3 - (i + 1); j++) {
				System.out.print(" ");
			}
			for (int k = 0; k < i + 1; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}
}
