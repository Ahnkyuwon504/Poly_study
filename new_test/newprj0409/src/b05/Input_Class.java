package b05;

import java.util.Scanner;

public class Input_Class {
	Scanner sc = null;
	
	public Input_Class() {
		sc = new Scanner(System.in);
	}
	
	public String get_Formula() {
		String temp;
		
		System.out.printf("Inputs a string formula.\n");
		temp = sc.nextLine();
		
		return temp;
	}
}
