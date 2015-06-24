package section1;

public class Basic03 {

	public static void main(String[] args) {

		Basic03 basic = new Basic03();

		basic.ex1();
		basic.ex2();
		basic.ex3();
	}

	private void ex1() {
		float i = 0;
		float J = 0;

		while (i <= 100) {
			i = i + 1;

			if ((int) i / 2 == i / 2) {
				J = J + (i / (i + 1));
			} else {
				J = J - (i / (i + 1));
			}
		}
		System.out.printf("%.6f \n1", J);

	}

	private void ex2() {
		System.out.println("없어");

	}

	private void ex3() {
		System.out.println("없어");

	}

}
