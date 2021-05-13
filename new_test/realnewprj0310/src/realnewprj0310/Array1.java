package realnewprj0310;

import java.util.Collections;

public class Array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = { 2, 33, 7, 5, 12, 34, 99, 25, 28, 53, 20 };
		System.out.println(summation(numbers));

	}


	

	
	
	
	public static int summation(int[] num) {
		int sum = 0;
		for (int i=0; i<num.length; i++) {
			if (i == 0) {
				sum = num[0];
			} else {
				sum = sum + num[i-1];
			}
		}
		return sum;
	}

}
