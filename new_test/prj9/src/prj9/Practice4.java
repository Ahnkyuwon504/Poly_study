package prj9;

import java.io.FileWriter;
import java.io.IOException;

public class Practice4 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileWriter fw = new FileWriter("C:\\Users\\¾È±Ô¿ø\\Desktop\\jk\\out.txt", true);
		for (int i = 12; i < 16; i++) {
			String data = "Line # " + i + "\n";
			fw.write(data);
		}
		fw.close();

	}

}
