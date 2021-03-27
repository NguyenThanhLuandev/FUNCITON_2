/* 10.	Viết chương trình cho phép người dùng nhập vào hai số a và b với các yêu cầu sau:
a.	Chương trình hiển thị menu các lựa chọn như sau:
--------------------------------
#1 – Tim so lon nhat
#2 – Tim so be nhat
--------------------------------
b.	Nếu người dùng nhập vào số 1, chương trình sẽ thực hiện hiển thị số lớn nhất trong 2 số a và b.
c.	Nếu người dùng nhập vào số 2, chương trình sẽ thực hiện hiển thị số bé nhất trong 2 số a và b.
*Lưu ý: Ở bài tập này, sinh viên thực hiện sử dụng toán tử điều kiện.
 */

package FUNCTIONS_2;

import java.util.Scanner;

public class Ex10 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter number a: ");
		double a = input();
		System.out.println("Enter number b: ");
		double b = input();
		while(true) {
			process(a, b);
		}
		
		
	}

	static double input() {
		return sc.nextDouble();
	}

	static void menu() {
		System.out.println("-----------------------");
		System.out.println("#1 Tim So Lon Nhat");
		System.out.println("#2 Tim So Be Nhat");
		System.out.println("#3 Thoat");
		System.out.println("-----------------------");
	}

	static int choose() {
		while (true) {
			menu();
			int choose = sc.nextInt();
			if (choose > 0 && choose < 4)
				return choose;
		}
	}

	static void finMax(double a, double b) {
		if (a > b) {
			System.out.println("The maximum number is: " + a);
		} else {
			System.out.println("The maximum number is: " + b);
		}
	}

	static void finMin(double a, double b) {
		if (a < b) {
			System.out.println("The minimum number is: " + a);
		} else {
			System.out.println("The minimum number is: " + b);
		}

	}

	static void process(double a, double b) {
		switch(choose()) {
		case 1: finMax(a, b);
			break;
		case 2: finMin(a, b);
		break;
		default: System.exit(0);
		break;
		}
	}

}
