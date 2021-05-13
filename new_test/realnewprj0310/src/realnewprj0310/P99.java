package realnewprj0310;
import java.util.Scanner;

public class P99 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		String[] split = input.split(" ");
		
		for (int i=0; i<split.length; i++) {
			System.out.println(split[i]);
		}
	}
}
