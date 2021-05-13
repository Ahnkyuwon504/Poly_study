package b05;

public class Operate_Class implements CalculatorInterface {

	@Override
	public double calAddition(double num1, double num2) {
		double sum;
		sum = num1 + num2;
		return sum;
	}

	@Override
	public double calSubtraction(double num1, double num2) {
		double sub;
		sub = num1 - num2;
		return sub;
	}

	@Override
	public double calMultiplication(double num1, double num2) {
		double mul;
		mul = num1 * num2;
		return mul;
	}

	@Override
	public double calDivision(double num1, double num2) {
		double div;
		div = num1 / num2;
		return div;
	}

	@Override
	public char getOperator(String formula) {
		char Ope = ' ';
		
		if (formula.contains("+")) {
			Ope = '+';
		} else if (formula.contains("-")) {
			Ope = '-';
		} else if (formula.contains("*")) {
			Ope = '*';
		} else if (formula.contains("/")) {
			Ope = '/';
		}
		return Ope;
	}

}
