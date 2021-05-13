package study04121;

import java.io.FileWriter;
import java.io.IOException;

public class HW07 {
	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("C:\\Users\\안규원\\Desktop\\money3.txt", true);
		String data = "";
		for (int i = 1; i < 15; i++) {
			data += i + " 번째 줄입니다.\r\n";
		}
		fw.write(data);
		fw.close();

		data = "";
		FileWriter fw2 = new FileWriter("C:\\Users\\안규원\\Desktop\\money3.txt", true);
		for (int i = 11; i < 21; i++) {
			data += i + " 번째 줄입니다.\r\n";
		}
		fw2.write(data);
		fw2.close();
	}
}
