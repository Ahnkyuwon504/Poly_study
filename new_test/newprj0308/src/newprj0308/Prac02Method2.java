package newprj0308;
import java.util.Scanner;

public class Prac02Method2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Input an operation between the two numbers.");
		String inPut = sc.nextLine();
		getOperation(inPut);
	}

	public static void getOperation(String inPut) {
		if (inPut.contains("+")) {
			int index = inPut.indexOf("+");
			String StrfirstNumber = inPut.substring(0, index);
			int firstNumber = Integer.parseInt(StrfirstNumber);
			String StrsecondNumber = inPut.substring(index+1);
			int secondNumber = Integer.parseInt(StrsecondNumber);
			System.out.println(firstNumber + secondNumber);
		} else if (inPut.contains("-")) {
			int index = inPut.indexOf("-");
			String StrfirstNumber = inPut.substring(0, index);
			int firstNumber = Integer.parseInt(StrfirstNumber);
			String StrsecondNumber = inPut.substring(index+1);
			int secondNumber = Integer.parseInt(StrsecondNumber);
			System.out.println(firstNumber - secondNumber);
		} else if (inPut.contains("*")) {
			int index = inPut.indexOf("*");
			String StrfirstNumber = inPut.substring(0, index);
			String StrsecondNumber = inPut.substring(index+1);
			int firstNumber = Integer.parseInt(StrfirstNumber);
			int secondNumber = Integer.parseInt(StrsecondNumber);
			System.out.println(firstNumber * secondNumber);
		} else if (inPut.contains("/")) {
			int index = inPut.indexOf("/");
			String StrfirstNumber = inPut.substring(0, index);
			String StrsecondNumber = inPut.substring(index+1);
			int firstNumber = Integer.parseInt(StrfirstNumber);
			int secondNumber = Integer.parseInt(StrsecondNumber);
			System.out.println(firstNumber / secondNumber);
		}
	}
}
