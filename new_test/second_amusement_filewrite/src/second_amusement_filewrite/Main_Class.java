package second_amusement_filewrite;

import java.io.IOException;

public class Main_Class {

	public static void main(String[] args) throws IOException {
		Read_Class readclass = new Read_Class();
		Write_Class writeclass = new Write_Class();
		
		writeclass.write_Age_DayNight(readclass.get_Array_savedData());
		writeclass.write_Sale_day(readclass.get_Array_savedData());
	}
}
