package section1;

public class Basic05 {

	public static void main(String[] args) {

		Basic05 basic = new Basic05();

		basic.ex1();
		basic.ex2();
		basic.ex3();
	}

	/* 수열5 1!+2!+3+!4+!5 합계 */
	private void ex1() {
		int i = 1;
		int J = 1;
		int K = 1;

		while (i < 10) {
			i = i + 1;
			J = J * i;
			K = K + J;

		}
		System.out.println(K);

	}

	private void ex2() {

	}

	private void ex3() {
	}

}
