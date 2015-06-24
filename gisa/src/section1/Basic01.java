package section1;

public class Basic01 {
	public static void main(String[] args) {

		Basic01 basic = new Basic01();

		basic.ex1();
		basic.ex2();
		basic.ex3();
	}

	private void ex1() {

		int i = 0;
		int J = 0;

		while (i < 100) {
			i = i + 1;
			J = J + i;
		}

		System.out.println(J);
	}

	private void ex2() {

		int i = -1;
		int J = 0;

		while (i < 99) {
			i = i + 2;
			J = i + J;
		}
		System.out.println(J);
	}

	private void ex3() {
		System.out.println("없어");
	}
}
