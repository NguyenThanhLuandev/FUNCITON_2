/*
 * 9.	Viết chương trình cho phép người dùng nhập vào một số nguyên n. 
 * Chương trình thực hiện tính giai thừa của n và hiển thị kết quả ra màn hình.
 */

package FUNCTIONS_2;

import java.util.Scanner;

public class Ex9 {
	static int factorial =1;
	public static void main(String[] args) {
		int number = input();
		int factorial = factorials(number);
		print(number, factorial);
		
	
	}
	static int input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		return sc.nextInt();
	}
	static int factorials(int number) {
		for(int i = 1; i <= number; i++) {
			factorial *= i;
		}
		return factorial;
	}
	static void print(int number, int factorial) {
		System.out.println("The factorials of " + number + " is: " + factorial);
	}
}
