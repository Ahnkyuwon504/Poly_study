package newproject0304;

import java.util.Scanner;

public class P13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Please input a number.");
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < i+n; j++) {
				if (j > n-i-2) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}	
			System.out.print("\n");
		}
	}
}
