package exchange_hw;

import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Write_Class {
	public void write (String temp) throws IOException {
		FileWriter fw = new FileWriter ("C:\\Users\\�ȱԿ�\\Desktop\\Money.csv", true);
		fw.write(temp);
		fw.close();
	}

}
