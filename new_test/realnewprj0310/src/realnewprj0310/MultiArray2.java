package realnewprj0310;

public class MultiArray2 {

	public static void main(String[] args) {
		int[][] numbers = {{1, 2, 3}, {4, 5}, {7, 8, 9}}; // 1은 0,0   2는 0,1   3은 0,2   4는 1,0   5는 1,1
		for (int i=0; i<3; i++) {
			for (int j=0; j<3; j++) {
				if (i==1 && j==2) {
				} else {
				System.out.println(numbers[i][j]);
				}
			}
		}

	}

}
