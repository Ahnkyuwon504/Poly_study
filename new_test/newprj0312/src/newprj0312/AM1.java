package newprj0312;

import java.io.FileOutputStream;
import java.io.IOException;

public class AM1 {
	public static void main(String[] args) throws IOException {
		try {
		    FileOutputStream output = new FileOutputStream("C:\\robocode\\compilers\\out2.csv");  // 이 경로에 ! out.txt를 만들어주는것임
		    String data = "\"1\"," +  "\"kim\"," + "\"24\"\n";
		    String data2 = "\"2\"," +  "\"lee\"," + "\"25\"";
		    output.write(data.getBytes());
		    output.write(data2.getBytes());
		    /*
		    for(int i = 1; i < 11; i++) {
			String data = "Line #" + i + "\n";
			output.write(data.getBytes());
		    }
		    */
		    output.close();
		} catch (Exception e) {
			System.out.println("error");
			e.printStackTrace();
		}

	}

}
