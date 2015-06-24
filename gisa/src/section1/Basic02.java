package section1;


public class Basic02 {

	public static void main(String[] args) {
		Basic02 basic = new Basic02
				();

		basic.ex1();
		basic.ex2();
		basic.ex3();
	}

	private void ex1() {
		int i = 0;
		int J = 0;

		int SW = 0;

		while (i < 100) {
			i = i + 1;

			if (SW == 0) {
				J = J + i;
				SW = 1;
			} else {
				J = J - i;
				SW = 0;
			}
		}
		System.out.println(J);
	}

	private void ex2() {
		int i = 0;
		int J = 0;

		while (true) {
			i = i + 1;
			J = J + i;

			if (i >= 99) {
				System.out.println(J);
				break;
			} else {
				i = i + 1;
				J = J - i;
			}
		}
	}

	private void ex3() {
		int i = 0;
		int J = 1;

		while (i < 100) {
			i = i + 1;

			if (i % 2 == 0) {
				J = J * i;
			} else {
				J = J * i * -1;
			}
		}
		System.out.println(J);

	}
}
