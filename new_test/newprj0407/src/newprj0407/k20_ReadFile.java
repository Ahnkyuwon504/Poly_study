package newprj0407;

import java.io.FileReader;
import java.io.IOException;
import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

public class k20_ReadFile {
	public static void readDataFromCsv(String filePath) throws IOException {
        CSVReader reader = new CSVReader (new FileReader(filePath));
        String [] nextLine;
        try {
			while ((nextLine = reader.readNext()) != null) {
			    for (int i = 0; i < nextLine.length; i++) {
			        System.out.printf("%s ", nextLine[i]); //(i + " " + nextLine[i]);
			    }
			    System.out.println();
			}
		} catch (CsvValidationException e) {
		} catch (NoClassDefFoundError e) {
		} catch (IOException e) {
			e.printStackTrace();
		}
    }

    public static void main(String args[]) throws IOException {
    	k20_ReadFile file = new k20_ReadFile();
        file.readDataFromCsv("C:\\Users\\¾È±Ô¿ø\\Desktop\\test.csv");
    }
}
