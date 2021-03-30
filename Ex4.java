/*Công thức để chuyển đổi nhiệt độ từ Fahrenheit sang Celsius là
C=5/9(F-32)
trong đó F là nhiệt độ Fahrenheit và C là độ Celsius. Hãy viết một hàm tên là celsius nhận thông số là độ Fahrenheit.
 Hàm sẽ trả về nhiệt độ Celsius. Hãy sử dụng hàm bằng cách gọi trong một vòng lặp hiển thị một bảng nhiệt độ Fahrenheit
  từ 0 đến 20 và độ Celsius tương ứng.
 */

package FUNCTIONS_2;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		while(true) {
			double F = input();
			process(F);
		}
	}

	static double input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Fahrenheit degree: ");
		return sc.nextDouble();
	}

	static void process(double F) {
		System.out.println(" F" + "       " + "C" );
		for (double i = 0; i <= F; i++) {
			double C = 5 * (i - 32) / 9;
			System.out.printf(i + "   " + "%.2f\n", C);
		}
	}
}
