package realnewprj0310;

import java.util.Scanner;

public class P3and11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println(
				"1. Celsius -> Fahrenheit\n2. Fahrenheit -> Celsius");
		System.out.println("Please select the number.");

		int N = sc.nextInt();

		switch (N) {
		case 1:
			int money = sc.nextInt();
			System.out.println(1.8 * money + 32);
			break;
		case 2:
			int money1 = sc.nextInt();
			System.out.println((money1 - 32)/1.8);
		}
	}
}
