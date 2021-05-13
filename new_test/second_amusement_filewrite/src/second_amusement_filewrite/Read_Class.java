package second_amusement_filewrite;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Read_Class {
	public static List<List<String>> get_Array_savedData() throws IOException {
		BufferedReader reader = new BufferedReader(new FileReader(ConstantValue_Class.DATA_FILE_LOCATION));
		List<List<String>> AllLines_Data = new ArrayList<List<String>>();
		// 데이터가 담길 double List<List<String>>
		
		String line = ""; // 데이터 한 줄씩 저장되는 String
		while ((line = reader.readLine()) != null) { // 데이터 없을 때까지 반복
			List<String> OneLines_Data = new ArrayList<String>(); // 데이터를 ,로 찢어서 저장되는 List<>
			OneLines_Data = Arrays.asList(line.split(","));
			// 1. 한 줄의 line을 ,기준으로 찢음
			// 2. 찢어지면 저절로 String[]이 되고, 이를 List에 저장 
			// 3. 한 줄 완성
			AllLines_Data.add(OneLines_Data);
			// 한 줄을 List<List<>>에 추가함.
		}
		reader.close();
		return AllLines_Data;
	}
}
