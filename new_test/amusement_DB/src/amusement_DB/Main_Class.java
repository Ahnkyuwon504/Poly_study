package amusement_DB;

import java.sql.SQLException;

public class Main_Class {

	public static void main(String[] args) throws SQLException {
		Sell_Analysis_Class saClass = new Sell_Analysis_Class();
		
		saClass.getData();
		saClass.getData2();
		saClass.getData_DayNight_Age();
	}
}
