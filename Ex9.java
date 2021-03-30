/*
 * 9.	Viết chương trình cho phép người dùng nhập vào một số nguyên n. 
 * Chương trình thực hiện tính giai thừa của n và hiển thị kết quả ra màn hình.
 */

package FUNCTIONS_2;

import java.util.Scanner;

public class Ex9 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		while (true) {
			int number = input();
			factorials(number);
		}
	}

	static int input() {
		System.out.println("Enter a number: ");
		return sc.nextInt();
	}

	static void factorials(int number) {
		int factorial = 1;
		for (int i = 1; i <= number; i++) {
			factorial *= i;
		}
		System.out.println("the factorials of " + number + " is: " + factorial);
	}
}
