package newprj0409;

public class OperatingClass {
	
	public int get_Result (int A, int B, char Ope) {
		int Result = 0;
		
		if (Ope == '+') {
			Result = A + B;
		} else if (Ope == '-') {
			Result = A - B;
		} else if (Ope == '*') {
			Result = A * B;
		} else if (Ope == '/') {
			Result = A / B;
		}
		
		return Result;
	}
	
	public double get_Result (double A, double B, char Ope) {
		double Result = 0;
		
		if (Ope == '+') {
			Result = A + B;
		} else if (Ope == '-') {
			Result = A - B;
		} else if (Ope == '*') {
			Result = A * B;
		} else if (Ope == '/') {
			Result = A / B;
		}
		
		return Result;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
