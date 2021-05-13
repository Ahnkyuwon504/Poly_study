package newprj0407;

import java.util.ArrayList;
import java.util.Scanner;

public class P13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Inputs the two words.");
		String f_Word = sc.nextLine();
		String s_Word = sc.nextLine();

		System.out.println("1 : " + f_Word.length());
		System.out.println("2 : " + s_Word.length());

		String[] list1 = new String[f_Word.length()];
		String[] list2 = new String[s_Word.length()];

		for (int i = 0; i < f_Word.length(); i++) {
			list1[i] = f_Word.split("")[i];
		}
		
		for (int i = 0; i < s_Word.length(); i++) {
			list2[i] = s_Word.split("")[i];		
		}

		int cnt = 0;
		try {
			for (int i = 0; i < list1.length; i++) {
				for (int j = 0; j < list2.length; j++) {
					if (list1[i].equals(list2[j])) {
						list2[j] = null;
						cnt++;
					}
				}
			}
			System.out.println("3 : " + cnt);
		} catch (IndexOutOfBoundsException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
