package prj9;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Practice3 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader reader = new BufferedReader(new FileReader("C:\\\\Users\\\\¾È±Ô¿ø\\\\Desktop\\\\out.txt"));
		String line;
		while ((line = reader.readLine()) != null) {
			System.out.println(line);
		}

	}

}
