package test;
import java.util.Scanner;

public class Triangle1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				
				
				if ( j >= -1*i + n-1 ) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
				
				
				
				
				
				
				
				
			}
			System.out.println("\n");
		}

	}

}
