package newprj0311;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class P11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("Please input a number of numbers.");
			int N = sc.nextInt();
			System.out.println("Please input numbers.");
			sc.nextLine();
			String input = sc.nextLine();
			
			int[] name = new int[N];
			ArrayList<Integer> name1 = new ArrayList<Integer>();
			String[] split = input.split(" ");
			
			for (int i = 0; i < N; i++) {
				name[i] = Integer.parseInt(split[i]);
				name1.add(name[i]);
			}
			Collections.sort(name1);
			System.out.println(name1);
		} catch (NumberFormatException e) {
			System.out.println("error");
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("Exception");
			e.printStackTrace();
		}
		/*
		ArrayList<Integer> name = new ArrayList<Integer>();
		for (int i = 0; i < split.length; i++) {
			name.add(split[i]);
		}
		
		Collections.sort(name);      
		Collections.reverse(name);  
		System.out.println(name);
		*/

	}

}
