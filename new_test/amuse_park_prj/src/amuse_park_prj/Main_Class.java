package amuse_park_prj;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Main_Class {

	public static void main(String[] args) throws IOException {
		Input_Class inputclass = new Input_Class();						// InputClass ��ü ����&����
		Operating_Class operatingclass = new Operating_Class();			// OperatingClass ��ü ����&����
		Output_Class outputclass = new Output_Class();
		Write_Class writeclass = new Write_Class();
		Read_Class readclass = new Read_Class();
		
		int day_Or_Night, birth, how_Many_Tickets, treatment, price_Of_One_Ticket;
		int total_Price;
		String oneLine_Output;
		
		while (true) {
			total_Price = 0; // Ƽ���� �Ѿ� �ʱ�ȭ
			Constant_Value_Class.output_Tickets.clear(); // Ƽ�� ���� ArrayList �ʱ�ȭ
			while (true) {
				day_Or_Night = inputclass.day_Or_Night_InputFromConsole(); // ������ �����ϼ���.
				birth = inputclass.social_Number_InputFromConsole(); // �ֹι�ȣ�� �Է��ϼ���.
				how_Many_Tickets = inputclass.how_Many_InputFromConsole(); // �� ���� �ֹ��Ͻðڽ��ϱ�?
				treatment = inputclass.treatment_InputFromConsole(); // �������� �����ϼ���.
				
				// ���� ����, ���ڴ� ����&�ֹι�ȣ&���&������
				price_Of_One_Ticket = operatingclass.get_One_Ticket_Price(
						day_Or_Night, birth, how_Many_Tickets, treatment); 
				
				// �Ѱ��ݿ� �����ֱ�
				total_Price += price_Of_One_Ticket;
				
				// ** �ܼ� ���**
				// ���� ���̸� �����常ŭ ���� ����. �ѹ� �Է��� �������� ����ϴ°�.
				outputclass.print_One_Charge(price_Of_One_Ticket); // ������ 47,000���Դϴ�.
				
				// ** ������ ���**
				// Ƽ�� �� ���� ����� �����Ϳ� ����
				writeclass.write(day_Or_Night, birth, how_Many_Tickets, price_Of_One_Ticket, treatment);
									
				// ����� ���� ArrayList ����
				Constant_Value_Class.output_Tickets.add(operatingclass.get_OneLine_Ticket(
						day_Or_Night, birth, how_Many_Tickets, price_Of_One_Ticket, treatment));
				
				if (inputclass.continue_Or_Not_InputFromConsole() == 2) { // ��� �߱�? ���� ���ý� break
					break;
				}
			}
			// Ƽ�� �߱��� �����մϴ�. �Ѿ� ����
			outputclass.print_Total_Charge(Constant_Value_Class.output_Tickets, total_Price);
			// ��� ����? 2 ���ý� ���α׷� ����
			if (inputclass.continue_Program_Or_Not_InputFromConsole() == 2) { // ��� ����? ���α׷� ����
				break;
			}
		}
		
		// ��¸޼ҵ� (1) ���ڴ� doubleArrayList
		outputclass.print_Total_Sales_Day(readclass.get_Array_savedData());
		
		// ��¸޼ҵ� (2) ���ڴ� doubleArrayList
		outputclass.print_Total_Sales_DayNight(readclass.get_Array_savedData());
		
		// ��¸޼ҵ� (3) ���ڴ� doubleArrayList
		outputclass.print_Total_Sales_OneDay(readclass.get_Array_savedData());
		
		// ��¸޼ҵ� (4) ���ڴ� doubleArrayList
		outputclass.print_Total_Treatment(readclass.get_Array_savedData());
		
		// write�޼ҵ� (1) ���ڴ� doubleArrayList
		writeclass.write_Sale_day(readclass.get_Array_savedData());
		
		// write�޼ҵ� (2) ���ڴ� doubleArrayList
		writeclass.write_Age_DayNight(readclass.get_Array_savedData());
		
		
		
	}
}
