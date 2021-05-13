package examOfB;

import java.util.Scanner;

public class InputClass {
	Scanner sc = null;
	
	public InputClass() {
		sc = new Scanner(System.in);
	}
	
	public String get_Input_Formula() {
		String input_Formula;
		
		System.out.printf("Inputs a formula including an arithmetic operator.");
		input_Formula = sc.nextLine();
		
		return input_Formula;
	}


}
