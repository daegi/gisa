package section1;

public class Basic04 {

	public static void main(String[] args) {

		Basic04 basic = new Basic04();

		basic.ex1();
		basic.ex2();
		basic.ex3();
	}

	/* 수열4 1+2+4+7+11+16+22+... 로 증가하는 수열 */
	private void ex1() {
		int i = 0;
		int J = 1;
		int K = 1;

		while (i < 19) {
			i = i + 1;
			J = J + i;
			K = K + J;

		}
		System.out.println(K);

	}

	/* 1+3+6+10+15+21+28+ 순서로 나열되는 수열 */
	private void ex2() {

		int i = 0;
		int J = 0;
		int K = 0;
		while (i < 20) {
			i = i + 1;
			J = J + i;
			K = K + J;
		}
		System.out.println(K);

	}

	private void ex3() {
		int i = 0;
		int J = 1;
		int K = -1;
		int L = -1;

		while (i < 19) {
			i = i + 1;
			J = J + i;
			L = L * -1;

			K = K + (J * L);
		}

		System.out.println(K);
	}

}
