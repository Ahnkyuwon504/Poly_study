

import java.util.Scanner;

public class For {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Please input the number");
		int i = sc.nextInt();
		for (int j = 2; j < 10; j++) {
			System.out.println(i + "X" + j + " = " + (i * j));
		}
	}
}
