package newprj0311;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class P1 {

	public static void main(String[] args) {
		ArrayList<String> name = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);

		String input = sc.nextLine();
		String[] split = input.split(" ");
		
		for (int i = 0; i < split.length; i++) {
			name.add(split[i]);
		}
		
		Collections.sort(name);      
		Collections.reverse(name);  
		System.out.println(name);
	}
}
