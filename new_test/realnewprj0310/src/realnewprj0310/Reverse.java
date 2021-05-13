package realnewprj0310;
import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String number = sc.nextLine();
		
		int lengthOfn = number.length();      // length of String
		int sum = 0;
		
		for(int i=0; i<lengthOfn; i++) {                   
			String chAr = number.substring(i, i+1);         // get ith index of String, but still String
			int chArnum = Integer.parseInt(chAr);           // So get int
			sum += chArnum * Math.pow(10, i) ;              // by multiplying 10^, set position
		}
		System.out.println(sum);
	}
}
