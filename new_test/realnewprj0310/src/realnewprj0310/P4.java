package realnewprj0310;

public class P4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = { 2, 33, 7, 5, 12, 34, 99, 25, 28, 53, 20 };
		
		for (int i=0; i<10; i++) {                // ascending
			for (int j=i+1; j<10; j++) {
				if (numbers[i] >= numbers[j]) {
					int a = numbers[i];
					int b = numbers[j];
					numbers[i] = b;
					numbers[j] = a;
				}
			}
			System.out.print(numbers[i] + " ");
		}
		System.out.println();
		
		for (int i=0; i<10; i++) {                // descending
			for (int j=i+1; j<10; j++) {
				if (numbers[i] <= numbers[j]) {
					int a = numbers[i];
					int b = numbers[j];
					numbers[i] = b;
					numbers[j] = a;
				}
			}
			System.out.print(numbers[i] + " ");
		}
		
		


	}

}
