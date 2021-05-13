package homework2;

import java.util.Scanner;

public class P1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int i = 1;
		while ((i == 1) == true) {
			while ((i == 1) == true) {
				switch (i) {
				case 1:
					cal(1);
				case 2:
					cal(2);
				case 3:
					cal(3);
				case 4:
					cal(4);
				case 5:
					cal(5);
				case 6:
					cal(6);
				case 7:
					cal(7);
				case 8:
					cal(8);
				case 9:
					cal(9);
				}
				i++;
			}
		}
	}

	public static void cal(int N) {
		for (int i = 2; i < 10; i++) {
			System.out.println(N + " X " + i + " = " + N * i);
		}
	}

}
