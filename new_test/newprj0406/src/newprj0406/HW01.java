package newprj0406;

import java.util.Scanner;

public class HW01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Input a number.");
		int N = sc.nextInt();
		
		for (int i = 0; i < N; i++) {
			System.out.printf("%d\t", piBonacci(i));
		}
	}
	
	public static int piBonacci (int N) {
		if (N == 0) {
			return 0;
		} else if (N == 1) {
			return 1;
		} else {
			return piBonacci(N - 1) + piBonacci(N - 2);
		}
	}
}
