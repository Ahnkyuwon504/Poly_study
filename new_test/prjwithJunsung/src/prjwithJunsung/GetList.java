package prjwithJunsung;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class GetList {

		public static void main(String[] args) throws IOException{
			// TODO Auto-generated method stub
			BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\¾È±Ô¿ø\\Desktop\\All.csv"));
			ArrayList<String> Area = new ArrayList<String>();
			ArrayList<String> Name = new ArrayList<String>();
			AllStore store = new AllStore();
			String[] severalLine = new String[4900];
		      int i= 0;
		      while (true) {
		         String line;
		         if((line = reader.readLine()) == null) {
		            break;
		         }
		         severalLine[i] = line;
		         i++;
		      }
		      for(int j = 1; j < 4858; j++) {   
		    	 String[] Split = severalLine[j].split(",");
		         Area.add(Split[Split.length-1]);
		         Name.add(Split[0]);
		      }
		      System.out.println(store.NameArea(Area, Name)); 
		}
	
	static class AllStore {
		
		public ArrayList<String> NameArea(ArrayList<String> Area, ArrayList<String> Name) {
			ArrayList<String> Name_Area = new ArrayList<String>();
			for(int i = 0; i < Area.size(); i++) {
				Name_Area.add(Name.get(i)+ "-" +  "-" + Area.get(i));
			}
			return Name_Area;
		}

	}

}
