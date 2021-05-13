package newprj030901;

public class Practice01 {

	public void printInteger(int n) {
		System.out.println(n);
	}
	
	public void printAdd(int a, int b) {
		int sum;
		sum = a + b;
		System.out.println(sum);
	}
	
	public static int addition(int a, int b) {              // static으로 바꾸면. main에서 
		return a + b;
	}
	
	public int subtraction(int a, int b) {
		return a - b;
	}
	
	public int multiplication(int a, int b) {
		return a * b;
	}
	
	public int division(int a, int b) {
		return a / b;
	}
}
