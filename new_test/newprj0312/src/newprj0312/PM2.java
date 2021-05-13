package newprj0312;

import java.io.FileWriter;
import java.io.IOException;

public class PM2 {
	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("C:\\robocode\\compilers\\ahnkyuwon.txt", true);
		for(int i = 11; i < 16; i++) {
			String data = "Line #" + i + "\n";
			fw.write(data);
		}
		fw.close();
	}
}
