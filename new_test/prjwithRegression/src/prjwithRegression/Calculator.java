package termproject;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Calculator {

	public double[] cold() throws IOException {
		BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\kopo\\Desktop\\cold.csv"));
		ArrayList<Integer> count = new ArrayList<Integer>();
		ArrayList<String> date = new ArrayList<String>();
		ArrayList<String> code = new ArrayList<String>();
		double[] coldcount = new double[365];
		String[] severalLine = new String[42000];
	    int i= 0;
	    while (true) {
	        String line;
	        if((line = reader.readLine()) == null) {
	        break;
	        }
	        severalLine[i] = line;
	        i++;
	    }
	    for(int j = 24838; j < 31043; j++) {   
	        String[] Split = severalLine[j].split(",");
	        count.add(Integer.parseInt(Split[2]));
	        date.add(Split[0]);
	        code.add(Split[1]);
	    }
	    for(int k = 0; k < MonthCount(date, count, code).size(); k++) {
	    	coldcount[k] = MonthCount(date, count, code).get(k);
	    }
	    return coldcount;
	}
	
	public ArrayList<Integer> MonthCount(ArrayList<String> date ,ArrayList<Integer> count, ArrayList<String> code) {//18년 데이터
		ArrayList<Integer> monthly = new ArrayList<Integer>();
		for(int i = 0; i < 12; i++) {
			int sum = 0;
			for(int k = 0; k < date.size(); k++) {
				if(date.get(k).substring(0,6).equals("20180" + (i+1)) && code.get(k).equals("11")) {
					monthly.add(count.get(k));
				}else if(date.get(k).substring(0,6).equals("2018" + (i+1)) && code.get(k).equals("11")) {
					monthly.add(count.get(k));
				}
			}
		}
		return monthly;
	}
}

