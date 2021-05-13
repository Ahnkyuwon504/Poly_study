package newprj;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Read_File {
	public static void main(String[] args) throws FileNotFoundException {
		List<List<String>> csvList = new ArrayList<List<String>>();

		try {
			String line = "";
			BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\안규원\\Desktop\\test1.csv"));

			while ((line = reader.readLine()) != null) {
				List<String> csvListOneLine = new ArrayList<String>(); // ArrayList 선언
				//line.replaceAll(",", )
				String[] array_Of_Line = line.split(","); // 읽은 Line으로부터 Array 생성(split)

				csvListOneLine = Arrays.asList(array_Of_Line); // array를 arrayList로
				csvList.add(csvListOneLine); // 한줄의 arrayList를 doublearrayList에 저장
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		System.out.println(csvList.get(0).get(0));
		System.out.println(csvList.get(0).size());
		
		int sum = 0;
		for (int i = 0; i < 5; i++) {
			sum += Integer.parseInt(csvList.get(3).get(i)); 
		}
		int avgerage = sum / csvList.get(3).size();
		System.out.println(avgerage);
		
		
		
	

	}

}
