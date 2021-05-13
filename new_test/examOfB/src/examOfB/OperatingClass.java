package examOfB;

public class OperatingClass {
	
	public int get_Index_Of_Ope (String formula) {
		int index_Of_Ope = 0;
		
		if (formula.contains("+")) {
			index_Of_Ope = formula.indexOf("+");
		} else if (formula.contains("-")) {
			index_Of_Ope = formula.indexOf("-");
		} else if (formula.contains("*")) {
			index_Of_Ope = formula.indexOf("*");
		} else if (formula.contains("/")) {
			index_Of_Ope = formula.indexOf("/");
		}
		
		return index_Of_Ope;
	}
	
	public int get_First (String formula, int index) {
		int first;
		
		first = Integer.parseInt(formula.substring(0, index));
		
		return first;
	}
	
	
	
	
	

}
