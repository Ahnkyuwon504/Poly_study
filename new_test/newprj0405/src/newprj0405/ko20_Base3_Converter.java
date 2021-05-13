package newprj0405;
import java.util.Scanner;

public class ko20_Base3_Converter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Please input a number which you want and a number of base.");
		int want_Number = sc.nextInt();
		int base_Number = sc.nextInt();
		
		System.out.println(get_How_Many(want_Number, base_Number));
		get_Converter(get_How_Many(want_Number, base_Number), want_Number, base_Number);
		

	}
	
	public static int get_How_Many (int want_Number, int base_Number) {
		int cnt = 0;
		
		while (want_Number/base_Number != 0) {
			want_Number = want_Number/base_Number;
			cnt++;
		}
		return cnt;
	}
	
	public static void get_Converter (int how_Many, int want_Number, int base_Number) {
		int[] Converter = new int[how_Many + 1];
		
		for (int i = 0; i <  Converter.length; i++) {
			System.out.println(base_Number ^ how_Many);
			Converter[i] = want_Number / (base_Number ^ how_Many); 
			System.out.println(Converter[i]);
			want_Number = want_Number % (base_Number ^ how_Many);
		}
		
	}

}
