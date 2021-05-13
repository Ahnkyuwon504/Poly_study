package newprj0305;

public class P3 {
	final static String[] CHO = {"ぁ","あ","い","ぇ","え","ぉ","け","げ","こ", 
			"さ","ざ","し","じ","す","ず","せ","ぜ","そ","ぞ"};
	final static String[] JOONG = {"た","だ","ち","ぢ","っ","つ","づ","て",
			"で","と", "ど","な","に","ぬ","ね","の","は","ば","ぱ","ひ","び"};
	final static String[] JONG = {"","ぁ","あ","ぃ","い","ぅ","う","ぇ","ぉ",
			"お","か","が", "き","ぎ","く","ぐ","け","げ","ご","さ","ざ","し",
			"じ","ず","せ","ぜ","そ","ぞ"}; 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "照括馬室推";
		for(int i = 0; i < text.length(); i++) {
			char uniVal = text.charAt(i);
			
			if(uniVal >= 0xAC00) {
				uniVal = (char)(uniVal - 0xAC00);
				
				char cho = (char)(uniVal/28/21);
				char joong = (char) ((uniVal)/28%21);
				char jong = (char) (uniVal%28);
				
				System.out.print(CHO[cho] + JOONG[joong] + JONG[jong]);
			} else {
				System.out.println(uniVal + "=>" + uniVal);
			}
		}
	}

}
