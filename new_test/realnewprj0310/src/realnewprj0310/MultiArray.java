package realnewprj0310;

public class MultiArray {

	public static void main(String[] args) {
		int[][] numbers = new int[3][5];
		int cnt = 0;
		for (int i=0; i<3; i++) {
			for (int j=0; j<5; j++) {
				numbers[i][j] = cnt;
				cnt++;
			}
		}
		System.out.println(cnt);
		for (int i=0; i<3; i++) {
			for (int j=0; j<4; j++) {
				System.out.println("numbers[" + i + "][" + j + "] = " + numbers[i][j]);
			}
		}
	}
}
