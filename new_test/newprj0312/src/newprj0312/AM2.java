package newprj0312;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class AM2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		byte[] content = new byte[1000];
		FileInputStream input = new FileInputStream("C:\\robocode\\compilers\\out.txt");
		
		input.read(content);
		String allLine = new String(content);
		System.out.println(allLine);
		
		input.close();
	}
}


