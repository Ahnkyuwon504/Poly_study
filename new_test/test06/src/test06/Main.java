package test06;

public class Main implements InterF {

	public static void main(String[] args) {
		Main m = new Main();
		double[] numbers = { 1.2, 3.2, 5.2, 12.3, 45.0, -3.4, -6.7 };
		System.out.println("Maximum : " + m.getMaxNumber(numbers));
		System.out.println("Minimum : " + m.getMinNumber(numbers));
	}

	@Override
	public double getMaxNumber(double[] numbers) {
		double ret = 0; // set ret=0
		for (int i = 0; i < numbers.length; i++) {
			if (i == 0) {
				ret = numbers[0]; // i increases and ret gets new value or ret=number[0]
			} else {
				if (numbers[i] >= ret) {
					ret = numbers[i];
				}
			}
		}
		return ret;
	}

	@Override
	public double getMinNumber(double[] numbers) {
		double ret = 0;
		for (int i = 0; i < numbers.length; i++) {
			if (i == 0) {
				ret = numbers[0]; // i increases and ret gets new value or ret=number[0]
			} else {
				if (numbers[i] <= ret) {
					ret = numbers[i];
				}
			}
		}
		return ret;
	}
}
