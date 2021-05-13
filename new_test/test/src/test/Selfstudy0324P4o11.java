package test;
import java.util.Scanner;

public class Selfstudy0324P4o11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		for (int i = 1; i <= N; i++) {
			if (i == N) {
				System.out.print(fIbo(i));
			} else {
				System.out.print(fIbo(i) + ", ");

			}
		}
		

	}
	
	public static int fIbo(int N) {
		if (N == 1) {
			return 0;
		} else if (N == 2) {
			return 1;
		} else {
			return fIbo(N-1) + fIbo(N-2);
		}
	}

}
