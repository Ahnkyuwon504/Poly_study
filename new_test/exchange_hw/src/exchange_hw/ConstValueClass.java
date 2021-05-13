package exchange_hw;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ConstValueClass {
	public final static double USD_RATIO = 1134.30; // 환율
	public final static double EUR_RATIO = 1332.73; // 환율
	public final static double JPY_RATIO = 10.30; // 환율
	public final static int CHANGE_TYPE_USD = 1;
	public final static int CHANGE_TYPE_EUR = 2;
	public final static int CHANGE_TYPE_JPY = 3;
	public final static int[] DOLLAR = { 100, 50, 20, 10, 5, 1 };
	public final static int[] EURO = { 500, 200, 100, 50, 20, 10, 5, 1 };
	public final static int[] JPY = { 10000, 5000, 2000, 1000 };
	public final static int[] WON = { 1000, 500, 50, 10 };

	public static double BALANCE_USD = 500;
	public static double BALANCE_EUR = 500;
	public static double BALANCE_JPY = 50000;
	
	public static void get_Balance() throws IOException {
		BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\안규원\\Desktop\\Money.csv"));
		ArrayList<String> arrayList_Line = new ArrayList<String>();
		String last_Line = "";
		double[] array_Balance = new double[3];

		while (true) {
			String line;
			if ((line = reader.readLine()) == null) {
				break;
			}
			arrayList_Line.add(line);
		}
		
		last_Line = arrayList_Line.get(arrayList_Line.size() - 1);
		String[] split_last_Line = last_Line.split(",");
		array_Balance[0] = Double.parseDouble(split_last_Line[split_last_Line.length - 3]);
		array_Balance[1] = Double.parseDouble(split_last_Line[split_last_Line.length - 2]);
		array_Balance[2] = Double.parseDouble(split_last_Line[split_last_Line.length - 1]);
		
		BALANCE_USD = array_Balance[0];
		BALANCE_EUR = array_Balance[1];
		BALANCE_JPY = array_Balance[2];
	}
}
