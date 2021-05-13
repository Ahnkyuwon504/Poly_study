package b05;

public class k20_P5 {

	public static void main(String[] args) {
		Input_Class inputclass = new Input_Class(); // define object
		Operate_Class operateclass = new Operate_Class();
		Extract_Class extractclass = new Extract_Class();

		String formula; // define
		char Ope;
		double first_Number;
		double second_Number;

		formula = inputclass.get_Formula(); // initialize
		Ope = operateclass.getOperator(formula);
		first_Number = extractclass.get_First(formula, Ope);
		second_Number = extractclass.get_Second(formula, Ope);

		System.out.println(first_Number);
		System.out.println(second_Number);

		if (formula.contains(".")) {
			if (formula.contains("+")) {
				System.out.println(operateclass.calAddition(first_Number, second_Number));
			} else if (formula.contains("-")) {
				System.out.println(operateclass.calSubtraction(first_Number, second_Number));
			} else if (formula.contains("*")) {
				System.out.println(operateclass.calMultiplication(first_Number, second_Number));
			} else if (formula.contains("/"))
				System.out.println(operateclass.calDivision(first_Number, second_Number));
		} else {
			if (formula.contains("+")) {
				System.out.println((int) operateclass.calAddition(first_Number, second_Number));
			} else if (formula.contains("-")) {
				System.out.println((int) operateclass.calSubtraction(first_Number, second_Number));
			} else if (formula.contains("*")) {
				System.out.println((int) operateclass.calMultiplication(first_Number, second_Number));
			} else if (formula.contains("/"))
				System.out.println((int) operateclass.calDivision(first_Number, second_Number));

		}

	}

}
