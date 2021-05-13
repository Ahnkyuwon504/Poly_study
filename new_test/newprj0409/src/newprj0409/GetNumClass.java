package newprj0409;

public class GetNumClass {
	
	public int get_index_Ope (String formula) {
		int Ope = 0;
		
		if (formula.contains("+")) {
			Ope = formula.indexOf("+");
		} else if (formula.contains("-")) {
			Ope = formula.indexOf("-");
		} else if (formula.contains("*")) {
			Ope = formula.indexOf("*");
		} else if (formula.contains("/")) {
			Ope = formula.indexOf("/");
		}
		
		return Ope;
	}
	
	public double get_first (String formula, int Ope) {
		double firstNum = Double.parseDouble(formula.substring(0, Ope));
		return firstNum;
	}
	
	public int get_first_int (String formula, int Ope) {
		int firstNum = Integer.parseInt(formula.substring(0, Ope));
		return firstNum;
	}
	
	public double get_second (String formula, int Ope) {
		double secondNum = Double.parseDouble(formula.substring(Ope + 1));
		return secondNum;
	}
	
	public int get_second_int (String formula, int Ope) {
		int secondNum = Integer.parseInt(formula.substring(Ope + 1));
		return secondNum;
	}
	
	
	
	public char get_Ope (String formula) {
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
