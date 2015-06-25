package com.gisa;

public class Section01 {
	public static void main(String[] args) {

		Section01 st = new Section01();

		st.ex1();
		st.ex2();
		st.ex3();
		st.ex4();
		st.ex5();
		st.ex6();
	}

	// 01. 수열1 1+2+3+4+...+100 까지의 합계
	private void ex1() {

		int i = 0;
		int J = 0;

		while (i < 100) {
			i = i + 1;
			J = J + i;
		}

		System.out.println(J);
	}

	// 02. 수열2 1-2+3-4+5-6.....+99의 합계
	private void ex2() {
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

	// 03. 수열3 -(1/2)+(2/3)-(3/4)+(4/5).....-(99/100)의 합계
	private void ex3() {
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

	// 04. 수열4 1+2+4+7+11+16+22로 증가하는 수열
	private void ex4() {
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

	// 05. 수열5 1!+2!+3!+4!+5!+6+....+10! 의 합계
	private void ex5() {
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

	// 06. 수열6 (1+1+2+3+5+8+13+)의 합계
	private void ex6() {
		int A = 1;
		int B = 1;
		int C = 0;
		int CNT = 2;
		int HAP = 2;

		while (true) {
			C = A + B;
			HAP = HAP + C;

			CNT = CNT + 1;
			if (CNT < 20) {
				A = B;
				B = C;
			} else {
				System.out.println(HAP);
				break;
			}
		}
	}
}
