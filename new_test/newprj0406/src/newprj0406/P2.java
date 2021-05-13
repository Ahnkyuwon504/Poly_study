package newprj0406;

import java.util.Scanner;

public class P2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String temp = sc.nextLine();
		
		for (int i = 0; i < temp.length(); i++) {
			char cHar = temp.charAt(i);
			int cHarint = (int) cHar;
			char pRint;
			if ((cHarint >= 65) && (cHarint <= 90)) {
				pRint = (char) (cHarint + 32);
				System.out.print(pRint);
			} else {
				pRint = (char) (cHarint - 32);
				System.out.print(pRint);
			}
		}
	}
}
