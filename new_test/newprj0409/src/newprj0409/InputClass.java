package newprj0409;
import java.util.Scanner;

public class InputClass {
	Scanner sc = null;
	
	public InputClass(){
		sc = new Scanner(System.in);
	}
	
	public String get_Formula() {
		String temp;
		
		System.out.println("Inputs a formula including an arithmetic operator.");
		temp = sc.nextLine();
		
		return temp;
	}
	

}
