package amuse_park_prj;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Main_Class {

	public static void main(String[] args) throws IOException {
		Input_Class inputclass = new Input_Class();						// InputClass 객체 선언&생성
		Operating_Class operatingclass = new Operating_Class();			// OperatingClass 객체 선언&생성
		Output_Class outputclass = new Output_Class();
		Write_Class writeclass = new Write_Class();
		Read_Class readclass = new Read_Class();
		
		int day_Or_Night, birth, how_Many_Tickets, treatment, price_Of_One_Ticket;
		int total_Price;
		String oneLine_Output;
		
		while (true) {
			total_Price = 0; // 티켓의 총액 초기화
			Constant_Value_Class.output_Tickets.clear(); // 티켓 담을 ArrayList 초기화
			while (true) {
				day_Or_Night = inputclass.day_Or_Night_InputFromConsole(); // 권종을 선택하세요.
				birth = inputclass.social_Number_InputFromConsole(); // 주민번호를 입력하세요.
				how_Many_Tickets = inputclass.how_Many_InputFromConsole(); // 몇 장을 주문하시겠습니까?
				treatment = inputclass.treatment_InputFromConsole(); // 우대사항을 선택하세요.
				
				// 가격 산출, 인자는 권종&주민번호&장수&우대사항
				price_Of_One_Ticket = operatingclass.get_One_Ticket_Price(
						day_Or_Night, birth, how_Many_Tickets, treatment); 
				
				// 총가격에 더해주기
				total_Price += price_Of_One_Ticket;
				
				// ** 콘솔 출력**
				// 여러 장이면 여러장만큼 가격 산출. 한번 입력한 단위마다 계산하는것.
				outputclass.print_One_Charge(price_Of_One_Ticket); // 가격은 47,000원입니다.
				
				// ** 데이터 기록**
				// 티켓 한 장의 기록을 데이터에 저장
				writeclass.write(day_Or_Night, birth, how_Many_Tickets, price_Of_One_Ticket, treatment);
									
				// 출력을 위한 ArrayList 저장
				Constant_Value_Class.output_Tickets.add(operatingclass.get_OneLine_Ticket(
						day_Or_Night, birth, how_Many_Tickets, price_Of_One_Ticket, treatment));
				
				if (inputclass.continue_Or_Not_InputFromConsole() == 2) { // 계속 발권? 종료 선택시 break
					break;
				}
			}
			// 티켓 발권을 종료합니다. 총액 산출
			outputclass.print_Total_Charge(Constant_Value_Class.output_Tickets, total_Price);
			// 계속 진행? 2 선택시 프로그램 종료
			if (inputclass.continue_Program_Or_Not_InputFromConsole() == 2) { // 계속 진행? 프로그램 종료
				break;
			}
		}
		
		// 출력메소드 (1) 인자는 doubleArrayList
		outputclass.print_Total_Sales_Day(readclass.get_Array_savedData());
		
		// 출력메소드 (2) 인자는 doubleArrayList
		outputclass.print_Total_Sales_DayNight(readclass.get_Array_savedData());
		
		// 출력메소드 (3) 인자는 doubleArrayList
		outputclass.print_Total_Sales_OneDay(readclass.get_Array_savedData());
		
		// 출력메소드 (4) 인자는 doubleArrayList
		outputclass.print_Total_Treatment(readclass.get_Array_savedData());
		
		// write메소드 (1) 인자는 doubleArrayList
		writeclass.write_Sale_day(readclass.get_Array_savedData());
		
		// write메소드 (2) 인자는 doubleArrayList
		writeclass.write_Age_DayNight(readclass.get_Array_savedData());
		
		
		
	}
}
