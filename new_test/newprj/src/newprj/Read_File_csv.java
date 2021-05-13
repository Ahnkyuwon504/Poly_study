package newprj;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Read_File_csv {

	public static void main(String[] args) {
		List<List<String>> double_Array = new ArrayList<List<String>>(); // 이중어레이리스트 정의

		try {
			String line = "";
			BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\user\\Desktop\\Score_Final.csv"));

			while ((line = reader.readLine()) != null) {
				List<String> single_Array = new ArrayList<String>(); // 어레이리스트 정의
				line = line.replace(",\"", "*");
				line = line.replace("\",", "*");
				line = line.replace(",", "*");
				String[] line_Array = line.split("\\*");
				/*
				 * String[] line_Array = line.split(","); // 받은 line을 ,기준으로 split해서 // 만든 array
				 * 
				 */
				single_Array = new ArrayList<>(Arrays.asList(line_Array)); // array를 arraylist로 변환
				double_Array.add(single_Array); // arraylist 를 이중 arraylist의 첫줄에 저장
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
