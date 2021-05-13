package newprj0406;
import java.util.Scanner;
public class P15 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Inputs a formula including only one operator.");
		String input_Formula = sc.nextLine();
		
		double result = 0;
		if (input_Formula.contains("+")) {
			result = get_First_Number(input_Formula, input_Formula.indexOf("+")) +  get_Second_Number(input_Formula, input_Formula.indexOf("+"));
			}
		else if (input_Formula.contains("-")) {
			result = get_First_Number(input_Formula, input_Formula.indexOf("-")) -  get_Second_Number(input_Formula, input_Formula.indexOf("-"));
			}
		else if (input_Formula.contains("*")) {
			result = get_First_Number(input_Formula, input_Formula.indexOf("*")) *  get_Second_Number(input_Formula, input_Formula.indexOf("*"));
			}
		else if (input_Formula.contains("/")) {
			result = get_First_Number(input_Formula, input_Formula.indexOf("/")) /  get_Second_Number(input_Formula, input_Formula.indexOf("/"));
			}
		System.out.println(result);
	}
	
	public static double get_First_Number (String input_Formula, int index_Of_Oper) {
		double first_Number = Double.parseDouble(input_Formula.substring(0, index_Of_Oper));
		return first_Number;
	}
	
	public static double get_Second_Number (String input_Formula, int index_Of_Oper) {
		double second_Number = Double.parseDouble(input_Formula.substring(index_Of_Oper + 1, input_Formula.length()));
		return second_Number;
	}
}
