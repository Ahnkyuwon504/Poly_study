package newexchange_0416;

import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Write_Class {
	SimpleDateFormat sdt = null;
	Calendar cal = null;
	FileWriter fw = null;

	public Write_Class() throws IOException {
		sdt = new SimpleDateFormat("YYYYMMdd");
		cal = Calendar.getInstance();
		fw = new FileWriter(ConstantValue_Class.FILELOCATION, true);
	}

	public void write_Data(Data_Class dataclass, int nation) throws IOException {
		String temp = "";
		
		temp += sdt.format(cal.getTime()) + ",";
		temp += dataclass.getUSER_WANT_MONEY() + ",";
		temp += dataclass.getUSER_WANT_NATION() + ",";
		temp += "Return : " + dataclass.getREAL_EXCHANGE_MONEY() + ",";
		
		switch (nation) {
		case 1 :
			for (int i = 0; i < dataclass.getREAL_EXCHANGE_BILLS().length; i++) {
				temp += ConstantValue_Class.USD_BILL[i] + " : " + 
						dataclass.getREAL_EXCHANGE_BILLS()[i] + " ";
			} break;
		case 2 :
			for (int i = 0; i < dataclass.getREAL_EXCHANGE_BILLS().length; i++) {
				temp += ConstantValue_Class.EURO_BILL[i] + " : " + 
						dataclass.getREAL_EXCHANGE_BILLS()[i] + " ";
			} break;
		case 3 :
			for (int i = 0; i < dataclass.getREAL_EXCHANGE_BILLS().length; i++) {
				temp += ConstantValue_Class.JPY_BILL[i] + " : " + 
						dataclass.getREAL_EXCHANGE_BILLS()[i] + " ";
			} break;
		} temp += ",";
		
		temp += "Return : " + dataclass.getREAL_CHANGE_WON() + ",";
		for (int i = 0; i < dataclass.getREAL_CHANGE_BILLS().length; i++) {
			temp += ConstantValue_Class.WON_BILL[i] + " : " + 
					dataclass.getREAL_CHANGE_BILLS()[i] + " ";
		} temp += ",";
		
		temp += dataclass.getBALANCE()[0] + "," + dataclass.getBALANCE()[1] + "," + dataclass.getBALANCE()[2] + "\n";
		
		fw.write(temp);
		fw.close();
	}
}
