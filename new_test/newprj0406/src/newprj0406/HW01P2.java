package newprj0406;

import java.util.ArrayList;
import java.util.Scanner;

public class HW01P2 {
	public static void main(String[] args) {
		HW01P2 hw = new HW01P2();
		// TODO Auto-generated method stub
		System.out.printf("Your average : %f", hw.input_From_User());
	}

	public float input_From_User() {
		HW01P2 hw = new HW01P2();
		Scanner sc = new Scanner(System.in);
		double sum = 0;
		double sum_Of_units = 0;
		double Avg = 0;

		System.out.println("Input a number of subjects.");
		int number_Of_Subjects = sc.nextInt();	// number of subjects
		System.out.println(number_Of_Subjects);
		double[][] unit_Of_EachSubject = new double[number_Of_Subjects][2]; // double array
																			// 0 column : units of subject
																			// 1 column : grade of subject
		
		for (int i = 0; i < number_Of_Subjects; i++) { 						// input 0 column
			double unit_Of_Subject = sc.nextDouble();
			unit_Of_EachSubject[i][0] = unit_Of_Subject;
		}
		
		sc.nextLine();
		for (int i = 0; i < number_Of_Subjects; i++) {						// input 1 column
			String grade_Of_Subject = sc.nextLine();
			unit_Of_EachSubject[i][1] = hw.get_Score_From_Grade(grade_Of_Subject);
		}
		
		for (int i = 0; i < number_Of_Subjects; i++) {						// get sum of (units*grade)
			sum += unit_Of_EachSubject[i][0] * unit_Of_EachSubject[i][1];
		}
		for (int i = 0; i < number_Of_Subjects; i++) {						// get sum of units
			sum_Of_units += unit_Of_EachSubject[i][0];
		}
		Avg = sum / (sum_Of_units);
		return (float) Avg;
	}

	public double get_Score_From_Grade(String grade) {						// get score from grade(A+,A0,,,)
		double Score = 0.0;

		if (grade.equals("A+")) {
			Score = 4.5;
		} else if (grade.equals("A0")) {
			Score = 4.0;
		} else if (grade.equals("B+")) {
			Score = 3.5;
		} else if (grade.equals("B0")) {
			Score = 3.0;
		} else if (grade.equals("C+")) {
			Score = 2.5;
		} else if (grade.equals("C0")) {
			Score = 2.0;
		} else if (grade.equals("F")) {
			Score = 0.0;
		} 
		return Score;
	}
}
