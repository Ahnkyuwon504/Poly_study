package homework3;

import java.util.Scanner;

public class P14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String temp = sc.nextLine();
		String[] wordtemp = temp.split(" ");

		for (int i = 0; i < wordtemp.length; i++) {
			if (i <= (wordtemp.length) - 1) {
				if ((wordtemp[i].equals("a")) || (wordtemp[i].equals("A"))) {
					char a = wordtemp[i + 1].charAt(0);
					if ((a == 'a') || (a == 'o') || (a == 'u') || (a == 'i') || (a == 'e')) {
						if (wordtemp[i].equals("a")) {
							wordtemp[i] = "an";
						} else if (wordtemp[i].equals("A")) {
							wordtemp[i] = "An";
						}
					}
				} else if ((wordtemp[i].equals("an")) || (wordtemp[i].equals("An"))) {
					char a = wordtemp[i + 1].charAt(0);
					if (!((a == 'a') || (a == 'o') || (a == 'u') || (a == 'i') || (a == 'e'))) {
						if (wordtemp[i].equals("an")) {
							wordtemp[i] = "a";
						} else if (wordtemp[i].equals("An")) {
							wordtemp[i] = "A";
						}
					}
				}
			}

		}
		
		for (int i = 0; i < wordtemp.length; i++) {
			System.out.print(wordtemp[i] + " ");
		}
	}

}
