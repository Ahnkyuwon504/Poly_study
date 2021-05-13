package newprj0311;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class P13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		try {
			System.out.println("Please input a first word.");
			String input1 = sc.nextLine();
			System.out.println("Please input a second.");
			String input2 = sc.nextLine();
			
			System.out.println("1. : " + input1.length());
			System.out.println("2. : " + input2.length());
			
			String[] arrayinput1 = new String[input1.length()];
			String[] arrayinput2 = new String[input2.length()];
			for (int i=0; i<input1.length(); i++) {          // Insert input into array
				arrayinput1[i] = input1.substring(i, i+1);
			}
			for (int i=0; i<input2.length(); i++) {
				arrayinput2[i] = input2.substring(i, i+1);
			}
			
			int count = 0;
			for (int i = 0; i < input1.length(); i++) {
				for (int j = 0; j < input2.length(); j++) {
					if (arrayinput1[i].equals(arrayinput2[j])) {
						count++;
					}
				}
			}
			System.out.println(count);
		} catch (NumberFormatException e) {
			System.out.println("0");
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("Exception");
			e.printStackTrace();
		}

	}

}
