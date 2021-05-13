package newprj0407;

public class First {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		First fir = new First();
		int[][] numbers = {{1,2,3}, {4,5}, {5,6,7,8}};
		fir.print_Int_Array(numbers);
	}
	
	public void print_Int_Array (int[][] aRray) {
		for (int length_Of_Array = 0; length_Of_Array < aRray.length; length_Of_Array++) {
			for (int length_Of_Row = 0; length_Of_Row < aRray[length_Of_Array].length; length_Of_Row++) {
				System.out.print(aRray[length_Of_Array][length_Of_Row] + " ");
			}
			System.out.printf("\n");
		}
	}

}
