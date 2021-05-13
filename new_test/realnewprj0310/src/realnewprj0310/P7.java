package realnewprj0310;
import java.util.Scanner;

public class P7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		
		int [] number = new int[input.length()];
		for (int i=0; i<input.length(); i++) {
			char a = input.charAt(i);
			int b = 219 - (int)a;
			System.out.print((char)b);
		}
	}
}
