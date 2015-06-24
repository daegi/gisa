package section1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class temple {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		temple basic = new temple();

		String menu;

		System.out.println("==== 메뉴 =====");

		while (true) {
			try {
				System.out.print("1,2,3 ([q]종료)번 입력 :");
				menu = br.readLine();

				if (menu.equals("1")) {
					basic.ex1();
				} else if (menu.equals("2")) {
					basic.ex2();
				} else if (menu.equals("3")) {
					basic.ex3();
				} else if (menu.equalsIgnoreCase("q")) {
					System.out.println("종료 합니다.");
					break;
				} else {
					System.out.println("1,2,3 번중 입력해라");
				}

			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	private void ex1() {
		System.out.println("없어");
	}

	private void ex2() {
		System.out.println("없어");
	}

	private void ex3() {
		System.out.println("없어");
	}
}
