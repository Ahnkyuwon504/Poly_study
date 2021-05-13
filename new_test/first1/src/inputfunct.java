

import java.util.Scanner;

public class inputfunct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String text;
		text = sc.nextLine();
		
		if ((text.contains(("car")) || (text.contains("caR"))) == true) {
			System.out.println("car is included in the input string");
		} else {
			System.out.println("car is not included in the input string");
		}
		System.out.println(text);
	}
}
