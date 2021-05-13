package prjwithJunsung;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class GetNice {
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\안규원\\Desktop\\Model.csv"));
		ArrayList<String> Address = new ArrayList<String>();
		ArrayList<String> Name = new ArrayList<String>();
		Model store = new Model();
		String[] severalLine = new String[230];
	      int i= 0;
	      while (true) {
	         String line;
	         if((line = reader.readLine()) == null) {
	            break;
	         }
	         severalLine[i] = line;
	         i++;
	      }
	      for(int j = 1; j<227; j++) {
	    	 String[] SplitPrice = severalLine[j].split("\"");   
	    	 String[] Split = severalLine[j].split(",");
	         Address.add(SplitPrice[1]);
	         Name.add(Split[1]);
	      }
	      System.out.println(store.name(Address, Name)); // 업소명 표시한것
	}
}
class Model {
	
	public ArrayList<String> name(ArrayList<String> Address, ArrayList<String> Name){
		ArrayList<String> storeName = new ArrayList<String>();
		for(int i=0; i < Address.size(); i++) {
			if(Address.get(i).contains("서구") == true) {
				storeName.add(Name.get(i));
			}
		}
		return storeName;		//이거 쓰면될듯
	}

}
