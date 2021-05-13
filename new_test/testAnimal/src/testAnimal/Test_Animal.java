package testAnimal;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test_Animal {

	public static void main(String[] args) {
		List<List<String>> double_ArrayList_Animal = get_Double_ArrayList_Animal();
		
		System.out.println("Max : " + get_Max_From_DoubleArray_2Column(double_ArrayList_Animal));
		System.out.println("Min : " + get_Min_From_DoubleArray_2Column(double_ArrayList_Animal));
		System.out.println("Sum : " + get_Sum_From_DoubleArray_2Column(double_ArrayList_Animal));
		System.out.println("Avg : " + get_Avg_From_DoubleArray_2Column(double_ArrayList_Animal));

	}

	public static List<List<String>> get_Double_ArrayList_Animal() {
		List<List<String>> double_ArrayList_Animal = new ArrayList<List<String>>();

		try {
			String line = "";
			BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\안규원\\Desktop\\animal.csv"));

			while ((line = reader.readLine()) != null) {
				List<String> csvListOneLine = new ArrayList<String>(); // ArrayList 선언
				// line.replaceAll(",", )
				String[] array_Of_Line = line.split(","); // 읽은 Line으로부터 Array 생성(split)

				csvListOneLine = Arrays.asList(array_Of_Line); // array를 arrayList로
				double_ArrayList_Animal.add(csvListOneLine); // 한줄의 arrayList를 doublearrayList에 저장
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return double_ArrayList_Animal;
	}

	public static int get_Max_From_DoubleArray_2Column(List<List<String>> double_Array) {
		int Max = 0;
		for (int i = 1; i < double_Array.size(); i++) {
			if (Integer.parseInt(double_Array.get(i).get(1)) > Max) {
				Max = Integer.parseInt(double_Array.get(i).get(1));
			}
		}
		return Max;
	}

	public static int get_Min_From_DoubleArray_2Column(List<List<String>> double_Array) {
		int Min = Integer.parseInt(double_Array.get(1).get(1));
		for (int i = 1; i < double_Array.size(); i++) {
			if (Integer.parseInt(double_Array.get(i).get(1)) < Min) {
				Min = Integer.parseInt(double_Array.get(i).get(1));
			}
		}
		return Min;
	}

	public static int get_Sum_From_DoubleArray_2Column(List<List<String>> double_Array) {
		int Sum = 0;
		for (int i = 1; i < double_Array.size(); i++) {
			Sum += Integer.parseInt(double_Array.get(i).get(1));
		}
		return Sum;

	}

	public static double get_Avg_From_DoubleArray_2Column(List<List<String>> double_Array) {
		int Sum = 0;
		Double Avg;
		for (int i = 1; i < double_Array.size(); i++) {
			Sum += Integer.parseInt(double_Array.get(i).get(1));
		}
		Avg = (double) Sum / (double) (double_Array.size() - 1);
		return Avg;
	}
}
