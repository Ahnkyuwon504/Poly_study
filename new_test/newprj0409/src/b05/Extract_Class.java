package b05;

public class Extract_Class {
	
	public double get_First (String formula, char Ope) {
		double first_Number;
		first_Number = Double.parseDouble(formula.substring(0, formula.indexOf(Ope)));
		return first_Number;
	}
	
	public double get_Second (String formula, char Ope) {
		double second_Number;
		second_Number = Double.parseDouble(formula.substring(formula.indexOf(Ope) + 1));
		return second_Number;
	}

}
