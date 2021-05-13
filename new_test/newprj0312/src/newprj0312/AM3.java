package newprj0312;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class AM3 {
	public static void main(String[] args) throws IOException {
		AM3 am3 = new AM3();
		am3.readfileonebyone();
	}

	public static void readfilename() throws IOException {
		byte[] content = new byte[1000];
		FileInputStream input = new FileInputStream("C:\\robocode\\compilers\\accident.csv");

		input.read(content);
		String allLine = new String(content);
		System.out.println(allLine);

		input.close();
	}

	public static void readfileonebyone() throws IOException {
		byte[] content = new byte[1000];
		FileInputStream input = new FileInputStream("C:\\robocode\\compilers\\accident.csv");
		input.read(content);
		String allLine = new String(content);
		String[] Line = allLine.split("\n");

		String[] year = new String[20];
		String[] acc = new String[20];
		String[] death = new String[20];
		String[] inj = new String[20];

		for (int i = 1; i < 21; i++) {
			String[] one = Line[i].split(",");
			year[i - 1] = one[0];
			acc[i - 1] = one[1];
			death[i - 1] = one[2];
			inj[i - 1] = one[3];
		}

		System.out.println(year[5]);
		System.out.println(acc[1]);
		System.out.println(death[1]);
		System.out.println(inj[19]);
		System.out.println(getMin(inj));
		System.out.println(getMin(acc));
		System.out.println(getSum(year));
		System.out.println(getAvg(inj));

		input.close();

	}

	public static int getMin(String[] num) {                      // last term not printed
		ArrayList<Integer> name = new ArrayList<Integer>();
		for(int i = 0; i < 20; i++) {
			name.add(Integer.parseInt(num[i]));
		}
		Collections.sort(name);
		return name.get(0);
	}
	
	public static int getMax(String[] num) {                      // get Max
		ArrayList<Integer> name = new ArrayList<Integer>();
		for(int i = 0; i < 20; i++) {
			name.add(Integer.parseInt(num[i]));
		}
		Collections.sort(name);
		return name.get(19);
	}	
		
	public static int getSum(String[] num) {                      // get Sum
		int sum=0;
		for(int i = 0; i < 20; i++) {
			sum += Integer.parseInt(num[i]);
		}
		return sum;
	}
	
	public static int getAvg(String[] num) {                      // get Sum
		int sum=0;
		for(int i = 0; i < 20; i++) {
			sum += Integer.parseInt(num[i]);
		}
		return sum/20;
	}	
		
		
		
		
		
		
		
	
}
