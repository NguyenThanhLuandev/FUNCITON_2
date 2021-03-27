/*
 * 6.	Viết chương trình cho phép người dùng nhập vào một số nguyên n với các yêu cầu sau:
a.	Nếu n không lớn hơn 1 thì hiển thị “invalid”. Ngược lại thực hiện yêu cầu tiếp theo.
b.	Chương trình hiển thị menu các lựa chọn như sau:
--------------------------------
#1 – Hien thi cac so le
#2 – Hien thi cac so chan
--------------------------------
c.	Nếu người dùng nhập vào số 1, chương trình sẽ thực hiện in dãy số lẻ từ 1 đến n bằng cách sử dụng vòng lặp while
d.	Nếu người dùng nhập vào số 2, chương trình sẽ thực hiện in dãy số chẵn từ n về 1 bằng cách sử dụng vòng lặp for.

 */
package FUNCTIONS_2;

import java.util.Scanner;

public class Ex6 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		while(true) {
			int n = input();
			process(n);
		}
	}
	static int input() {
		while (true) {
			System.out.println("Enter a number: ");
			int n = sc.nextInt();
			if (n <= 1) {
				System.out.println("Invalid");
			} else {
				return n;
			}
		}
	}
	static void menu() {
		System.out.println("----------------");
		System.out.println("#1 - Hien thi cac so le");
		System.out.println("#2 - Hien thi cac so chan");
		System.out.println("#3 - Thoat");
		System.out.println("----------------");
	}
	static int getOffer() {
		while (true) {
			menu();
			int choose = sc.nextInt();
			if (choose > 0 && choose < 4)
				return choose;
		}
	}

	static void printOddNumber(int n) {
		for (int i = 1; i <= n; i++) {
			if (i % 2 != 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
	}
	static void printEvenNumber(int n) {
		for (int i = 0; i <= n; i++) {
			if (i % 2 == 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
	}
	static void process(int n) {
		switch (getOffer()) {
		case 1:
			printOddNumber(n);
			break;
		case 2:
			printEvenNumber(n);
			break;
		default:
			System.exit(0);
			break;
		}
	}
}
