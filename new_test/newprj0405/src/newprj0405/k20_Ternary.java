package newprj0405;

import java.util.Scanner;

public class k20_Ternary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("What is your coffee type?");
		String coffee_type = sc.nextLine();
		String nice_man = (coffee_type.equals("Americano")) ? "Wise man" : "Not wise man";
		System.out.println(nice_man);

	}

}
