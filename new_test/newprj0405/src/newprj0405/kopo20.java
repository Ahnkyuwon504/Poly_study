package newprj0405;

import java.util.Scanner;

public class kopo20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("What number do you want?");

		int N;

		N = sc.nextInt();
		get_N_times(N);
	}

	public static void get_N_times(int multi_N) {
		int cnt;
		cnt = 2;

		while (cnt < 10) {
			System.out.println(multi_N + " X " + cnt + " = " + multi_N * cnt);
			cnt++;
		}
	}

}
