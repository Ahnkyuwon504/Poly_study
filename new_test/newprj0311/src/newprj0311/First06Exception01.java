package newprj0311;
import java.util.InputMismatchException;
import java.util.Scanner;

public class First06Exception01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try {
			int n = sc.nextInt();
			System.out.println(n);
		} catch (InputMismatchException e) {  // when #(catch) is 2? here first!
			System.out.println("0");
		} catch (Exception e) {      // InputMismatch,,, but most comprehensive
			System.out.println("exception 1");
			e.printStackTrace();
			/*
			String n = sc.nextLine();    show String n!
			System.out.println(n);
			*/
		} finally {
			System.out.println("finally");
		}
	}
}
