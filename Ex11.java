/*
 * 11.	Viết chương trình cho phép người dùng nhập vào hai số a và b với các yêu cầu sau:
a.	Chương trình hiển thị menu các lựa chọn như sau:
--------------------------------
#1 – Tim so lon nhat
#2 – Tim so be nhat
#3 - Thoat
--------------------------------
b.	Nếu người dùng nhập vào số 1, chương trình sẽ thực hiện hiển thị số lớn nhất trong 2 số a và b.
c.	Nếu người dùng nhập vào số 2, chương trình sẽ thực hiện hiển thị số bé nhất trong 2 số a và b.
 */

package FUNCTIONS_2;

import java.util.Scanner;

public class Ex11 {
	static Scanner sc = new Scanner(System.in);
	static final int Max = 1;
	static final int Min = 2;

	public static void main(String[] args) {
		
			System.out.println("Enter number a: ");
			double a = input();
			System.out.println("Enter number b: ");
			double b = input();
			while(true) {
			int chooseOfUser = choose();
			process(chooseOfUser, a, b);
		}
	

	}

	static double input() {
		return sc.nextDouble();
	}

	static void menu() {
		System.out.println("--------------");
		System.out.println("#1 Tim so lon nhat");
		System.out.println("#2 Tim so be nhat");
		System.out.println("#3 Thoat");
		System.out.println("--------------");
	}

	static double finMax(double a, double b) {
		double max = 0;
		if (a > b) {
			max = a;
		} else {
			max = b;
		}
		System.out.println(max);
		return max;
	}

	static double finMin(double a, double b) {
		double min = 0;
		if (a < b) {
			min = a;
		} else {
			min = b;
		}
		System.out.println(min);
		return min;
		
	}

	static int choose() {
		while (true) {
			menu();
			int choose = sc.nextInt();
			if (choose >= 1 && choose < 4)
				return choose;
		}
	}

	static void process(int choose, double a, double b) {
			switch (choose) {
			case Max:
				finMax(a, b);
				break;
			case Min:
				finMin(a, b);
				break;
			default:
				System.exit(0);
				break;
			}
		
	}

}
