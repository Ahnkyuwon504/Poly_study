package test;
import java.util.Scanner;

public class Selfstudy0324P4o4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Selfstudy0324P4o4 self = new Selfstudy0324P4o4();
		String temp = sc.nextLine();
		
		String temp1 = temp.substring(0, temp.indexOf(self.getOperator(temp)));
		String temp2 = temp.substring(temp.indexOf(self.getOperator(temp))+1);
		
		if (self.getOperator(temp) == '+') {
			self.add(Integer.parseInt(temp1), Integer.parseInt(temp2));
		}
		
		

	}
	
	public static char getOperator(String temp) {
		char ope = 0;
		if (temp.contains("+")) {
			ope = '+';
		} else if (temp.contains("-")) {
			ope = '-';
		} else if (temp.contains("*")) {
			ope = '*';
		} else if (temp.contains("/")) {
			ope = '/';
		}
		return ope;
	}
	
	public static void add(double num1, double num2) {
		double sum = num1 + num2;
		System.out.println(sum);
	}
	public static void sub(double num1, double num2) {
		double sum = num1 - num2;
		System.out.println(sum);
	}
	public static void mul(double num1, double num2) {
		double sum = num1 * num2;
		System.out.println(sum);
	}
	public static void div(double num1, double num2) {
		double sum = num1 / num2;
		System.out.println(sum);
	}

}
