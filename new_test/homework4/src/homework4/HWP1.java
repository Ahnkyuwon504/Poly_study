package homework4;

import java.util.Scanner;

public class HWP1 {
	public static final String FN = "Bob";
	public static final String MN = "Alice";
	public static final String SN = "John";
	public static final String DN = "Lisa";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("#Pringting a Name");
		System.out.println("1. Father\n2. Mother\n3. Son\n4. Daughter");
		int n = sc.nextInt();

		HWP1 hw = new HWP1();
		hw.addition(n);

	}

	public void addition(int familyMember) {
		int N = familyMember;
		if (N == 1) {
			System.out.println(FN);
		} else if (N == 2) {
			System.out.println(MN);
		} else if (N == 3) {
			System.out.println(SN);
		} else {
			System.out.println(DN);
		}
	}

}
