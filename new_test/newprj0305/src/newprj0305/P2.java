package newprj0305;

import java.util.Scanner;

public class P2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Input");
		String message = sc.nextLine();
		
		char change[] = new char[message.length()];
		
		for (int i=0; i < message.length(); i++) {
			change[i] = message.charAt(i);
			if (change[i]>=65 && change[i]<=90) {
				change[i]+=32;
			}
			else {
				change[i]-=32;
			}
			System.out.print(change[i]);
		}
	}
}
