package realnewprj0310;

public class P5 {

	public static void main(String[] args) {
		String[][] sTringscore = {{"70", "80", "100"}, {"60", "70", "86"}, {"54", "100", "82"}, {"87", "95", "79"}};
		
		int[][] score = new int[4][3];
		for (int i=0; i<4;i++) {
			for(int j=0; j<3;j++) {
				score[i][j] = Integer.parseInt(sTringscore[i][j]);
			}
		}
		
		System.out.println("Korean Summation : " + summation0(score));
		System.out.println("English Summation : " + summation1(score));
		System.out.println("Math Summation : " + summation2(score));
		System.out.println();
		System.out.println("Korean Average : " + summation0(score)/4);
		System.out.println("English Average : " + summation1(score)/4);
		System.out.println("Math Average : " + summation2(score)/4);
		System.out.println();
		System.out.println("Korean minimum : " + minimum0(score));
		System.out.println("English minimum : " + minimum1(score));
		System.out.println("Math minimum : " + minimum2(score));
		System.out.println();
		System.out.println("Korean maximum : " + maximum0(score));
		System.out.println("English maximum : " + maximum1(score));
		System.out.println("Math maximum : " + maximum2(score));


		

	}
	
	public static int summation0(int[][] num) {      // summation of [i,0]
		int ret = 0;
		for (int i=0; i<4; i++) {
			ret += num[i][0];
		}
		return ret;
	}
	
	public static int summation1(int[][] num) {     // summation of [i,1]
		int ret = 0;
		for (int i=0; i<4; i++) {
			ret += num[i][1];
		}
		return ret;
	}
	
	public static int summation2(int[][] num) {    // summation of [i,2]
		int ret = 0;
		for (int i=0; i<4; i++) {
			ret += num[i][2];
		}
		return ret;
	}
	
	public static int minimum0(int[][] num) {     //  minimum of [i,0]
		int ret = 0;
		for(int i=0; i<4; i++) {
			if (i==0) {
				ret = num[0][0];
			} else {
				if (num[i][0] <= ret) {
					ret = num[i][0];
				}
			}
		}
		return ret;
	}
	
	public static int minimum1(int[][] num) {     //  minimum of [i,1]
		int ret = 0;
		for(int i=0; i<4; i++) {
			if (i==0) {
				ret = num[0][1];
			} else {
				if (num[i][1] <= ret) {
					ret = num[i][1];
				}
			}
		}
		return ret;
	}
	
	public static int minimum2(int[][] num) {     //  minimum of [i,2]
		int ret = 0;
		for(int i=0; i<4; i++) {
			if (i==0) {
				ret = num[0][2];
			} else {
				if (num[i][2] <= ret) {
					ret = num[i][2];
				}
			}
		}
		return ret;
	}
	
	public static int maximum0(int[][] num) {     //  maximum of [i,0]
		int ret = 0;
		for(int i=0; i<4; i++) {
			if (i==0) {
				ret = num[0][0];
			} else {
				if (num[i][0] >= ret) {
					ret = num[i][0];
				}
			}
		}
		return ret;
	}
	
	public static int maximum1(int[][] num) {     //  maximum of [i,1]
		int ret = 0;
		for(int i=0; i<4; i++) {
			if (i==0) {
				ret = num[0][1];
			} else {
				if (num[i][1] >= ret) {
					ret = num[i][1];
				}
			}
		}
		return ret;
	}
	
	public static int maximum2(int[][] num) {     //  maximum of [i,2]
		int ret = 0;
		for(int i=0; i<4; i++) {
			if (i==0) {
				ret = num[0][2];
			} else {
				if (num[i][2] >= ret) {
					ret = num[i][2];
				}
			}
		}
		return ret;
	}
}
