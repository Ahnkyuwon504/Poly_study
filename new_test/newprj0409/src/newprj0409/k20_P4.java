package newprj0409;

public class k20_P4 {

	public static void main(String[] args) {
		InputClass inputclass = new InputClass();
		OperatingClass operclass = new OperatingClass();
		GetNumClass getnum = new GetNumClass();

		String formula;
		int index_Oper;
		char ope;

		while (true) {
			formula = inputclass.get_Formula();
			index_Oper = getnum.get_index_Ope(formula);
			ope = getnum.get_Ope(formula);

			if (formula.contains(".")) {
				System.out.println(operclass.get_Result(getnum.get_first(formula, index_Oper),
						getnum.get_second(formula, index_Oper), getnum.get_Ope(formula)));
			} else {
				System.out.println(operclass.get_Result(getnum.get_first_int(formula, index_Oper),
						getnum.get_second_int(formula, index_Oper), getnum.get_Ope(formula)));
			}
		}
	}
}
