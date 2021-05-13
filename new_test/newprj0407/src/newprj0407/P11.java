package newprj0407;

import java.util.Arrays;
import java.util.Scanner;

public class P11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		while (true) {
			try {
				System.out.println("Input size.");
				int size_Of_array = sc.nextInt();
				int[] numberArray = new int[size_Of_array];

				System.out.println("Input numbers.");
				sc.nextLine();
				String numbers = sc.nextLine();
				String[] numbersArray = numbers.split(" ");
				
				for (int i = 0; i < numbersArray.length; i++) {
					numberArray[i] = Integer.parseInt(numbersArray[i]);
				}
				
				Arrays.sort(numberArray);
				for (int i = 0; i < numberArray.length; i++) {
					System.out.print(numberArray[i] + " ");
				}
				break;
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("error");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
