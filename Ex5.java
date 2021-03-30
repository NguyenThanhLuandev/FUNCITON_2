/* 5.Viết chương trình cho phép người dùng nhập vào một số nguyên n với các yêu cầu sau:
a.	Nếu n không lớn hơn 1 thì hiển thị “invalid”. Ngược lại thực hiện yêu cầu tiếp theo.
b.	Chương trình hiển thị menu các lựa chọn như sau:
--------------------------------
#1 – Hien thi day so tu 1 den n
#2 – Hien thi day so tu n den 1
--------------------------------
c.	Nếu người dùng nhập vào số 1, chương trình sẽ thực hiện in dãy số từ 1 đến n bằng cách sử dụng vòng lặp while
d.	Nếu người dùng nhập vào số 2, chương trình sẽ thực hiện in dãy số từ n về 1 bằng cách sử dụng vòng lặp for.
 */

package FUNCTIONS_2;

import java.util.Scanner;

public class Ex5 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int n = input();
		process(n);
	}

	static int input() {
		while (true) {
			System.out.println("Enter a number: ");
			int n = sc.nextInt();
			if (n < 1) {
				System.out.println("Invalid");
			} else {
				return n;
			}
		}
	}

	static void menu() {
		System.out.println("----------------");
		System.out.println("#1 Hien Thi Day So Tu 1 Den n");
		System.out.println("#2 Hien Thi Day So Tu n Den 1");
		System.out.println("#3 Thoat");
		System.out.println("----------------");
	}

	static int choose() {
		menu();
		while (true) {
			int choose = sc.nextInt();
			if (choose > 0 && choose < 4)
				return choose;
		}
	}

	static void printFrom_1(int n) {
		for (int i = 1; i <= n; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
	}

	static void printFrom_n(int n) {
		for (int i = n; i >= 1; i--) {
			System.out.print(i + " ");
		}
		System.out.println();
	}

	static void process(int n) {
		while (true) {
			int choose = choose();
			switch (choose) {
			case 1:
				printFrom_1(n);
				break;
			case 2:
				printFrom_n(n);
				break;
			default:
				System.exit(0);
				break;
			}
		}
	}
}
