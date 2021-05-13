package newprj0308;
import java.util.Scanner;

public class P9 {
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			System.out.println("Please inputs the two numbers for n and r.");
			int n = sc.nextInt();
			int r = sc.nextInt();
			
			System.out.print("C(" + n + "," + r + ") = " + n + "! / (" + n + " - " + r + ")! / " + r + "! = (");
			facTorialmulti(n);
			System.out.print(") / (");
			facTorialmulti(n-r);
			System.out.print(") / (");
		    facTorialmulti(r);
		    System.out.println(")");
			System.out.print("        = " + facTorial(n) + " / " + facTorial(n-r) + " / " + facTorial(r) + " = " + facTorial(n)/facTorial(n-r)/facTorial(r));
		}
		
		public static int facTorial (int number) {        
			if (number == 1) {                              
				return 1;
			} else {
				return number * facTorial(--number);       
			}
		}
		
		public static void facTorialmulti (int number) {
			if (number == 1) {
				System.out.print(1);
			} else {
				for (int i=number; i>=1; i--) {
					if (i!=1) {
						System.out.print(i + " x ");
					} else {
						System.out.print("1");
					}
			    }
		    }
		}
}
