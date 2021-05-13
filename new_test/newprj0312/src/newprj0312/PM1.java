package newprj0312;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class PM1 {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new FileReader("C:\\robocode\\compilers\\accident.csv"));
		String line;
		while ((line = reader.readLine()) != null) {
			System.out.println(line);
		}
		

	}

}
