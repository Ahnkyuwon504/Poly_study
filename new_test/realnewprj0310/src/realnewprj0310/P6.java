package realnewprj0310;
import java.util.Scanner;

public class P6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input a String.");
		String temp = sc.nextLine();
		System.out.println("Input a word.");
		String word = sc.nextLine();
		
		String[] arraytemp = new String[temp.length()];
		String[] arrayword = new String[word.length()];
		
		for (int i=0; i<temp.length(); i++) {          // Insert input into array
			arraytemp[i] = temp.substring(i, i+1);
		}
		for (int i=0; i<word.length(); i++) {
			arrayword[i] = word.substring(i, i+1);
		}
		
		int a = 0;                                        // minimum of value of count
		
		
		for (int i=0; i < word.length(); i++) {
			if (i==0) {
				int count = 0;
				for (int j = 0; j < temp.length(); j++) {
					if (arrayword[i].equals(arraytemp[j])) {
						count++;
					}
				}
				a = count;
			} else if (i != 0) {
				int count = 0;
				for (int j = 0; j < temp.length(); j++) {
					if (arrayword[i].equals(arraytemp[j])) {
						count++;
					}
				}
				if (count <= a) {
					a = count;
				}
			}
		}
		System.out.println(a);
	}
}
