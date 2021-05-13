package realnewprj0310;
import java.util.Scanner;

public class Reverstring {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		
		for (int i=input.length()-1; i>=0; i--) {
			char chArinput = input.charAt(i);
			System.out.print(chArinput);
		}
	}
}
