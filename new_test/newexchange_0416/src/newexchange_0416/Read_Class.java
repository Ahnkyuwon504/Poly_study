package newexchange_0416;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Read_Class {
	public List<List<String>> get_Array_savedData() throws IOException {
		BufferedReader reader = new BufferedReader(new FileReader(ConstantValue_Class.FILELOCATION));
		List<List<String>> AllLines_Data = new ArrayList<List<String>>();
		
		String line = "";
		while ((line = reader.readLine()) != null) {
			List<String> OneLines_Data = new ArrayList<String>();
			OneLines_Data = Arrays.asList(line.split(","));
			AllLines_Data.add(OneLines_Data);
		}
		reader.close();
		return AllLines_Data;
	}
	
	public static int[] get_balance(List<List<String>> savedData) {
		int[] intarray_balance = new int[3];
		intarray_balance[0] = Integer.parseInt(savedData.get(savedData.size() - 1).get(7));
		intarray_balance[1] = Integer.parseInt(savedData.get(savedData.size() - 1).get(8));
		intarray_balance[2] = Integer.parseInt(savedData.get(savedData.size() - 1).get(9));
		return intarray_balance;
	}
}
