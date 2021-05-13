package realnewprj0310;

public class MultiSum {

	public static void main(String[] args) {
		int[][] numbers = {{0,1,2}, {3, 4}, {1,1,5}};

	}
	
	public static int summation(int[] num) {
		int sum = 0;
		for (int i=0; i<num.length; i++) {
			sum = sum + num[i];
		}
		return sum;
	}

}
