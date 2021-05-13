package realnewprj0310;         // ¹ÌÇØ°á

import java.util.Scanner;

public class Reversedivision {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String number = sc.nextLine();
		int num = Integer.parseInt(number);

		int lengthOfn = number.length(); // length of String
		int sum = 0;
		int ret = num;

		for (int i = 0; i < lengthOfn; i++) {
			System.out.println(lengthOfn - i -1);
			System.out.println(10^(lengthOfn - i -1));
			System.out.println(10^2);
			System.out.println(Math.pow(10, i));
			sum += ret / Math.pow(10, lengthOfn - i -1) * Math.pow(10, i) ;              // by multiplying 10^, set position
			ret = ret % 10^(lengthOfn - i - 1);
			System.out.println(num);
			System.out.println(sum);
			System.out.println(ret);

			
		}
		System.out.println(sum);
		
		
	}
	
	
	// TODO Auto-generated method stub

}
