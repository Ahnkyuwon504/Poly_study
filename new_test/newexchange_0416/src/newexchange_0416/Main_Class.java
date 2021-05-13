package newexchange_0416;

import java.io.IOException;

public class Main_Class {

	public static void main(String[] args) throws IOException {
		Input_Class inputclass = new Input_Class();
		Data_Class dataclass = new Data_Class();
		Run_Class runclass = new Run_Class();
		Read_Class readclass = new Read_Class();
		int won_UserWant_Input, nation_UserWant;

		while (true) {
			won_UserWant_Input = inputclass.get_Won_InputFromConsole(); if (won_UserWant_Input == 0) {break;}
			nation_UserWant = inputclass.get_Nation_InputFromConsole();

			runclass.update_AllnationBalance(readclass.get_balance(readclass.get_Array_savedData()));
			runclass.run_EachNation(won_UserWant_Input, nation_UserWant);
		}
	}
}
