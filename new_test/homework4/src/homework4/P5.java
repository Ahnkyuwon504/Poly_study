package homework4;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class P5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Input one sentence.");
		String sent = sc.nextLine();
		
		System.out.println("Input one word.");
		String word = sc.nextLine();
		
		HashSet hAsh = new HashSet();
		for (int i = 0; i < word.length(); i++) {
			hAsh.add(word.charAt(i));
		}
		ArrayList hAsh1 = new ArrayList(hAsh.size());
		for (int i = 0; i < hAsh.size(); i++) {
			hAsh1.add(sent)
		}
		
		ArrayList hAshA = new ArrayList(hAsh.size());
		
		for (int i = 0; i < word.length(); i++) {
			for (int j = 0; j < hAsh.size(); j++) {
				if (word.charAt(i) == )
			}
		}

		
		
		
		

	}
	



}
