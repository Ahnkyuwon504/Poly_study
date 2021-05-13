package homework3;

import java.util.ArrayList;
import java.util.Scanner;

public class P1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String senten = sc.nextLine();
		String word = sc.nextLine();

		ArrayList wordlist = new ArrayList();
		ArrayList<Integer> wordnumber = new ArrayList<Integer>();
		ArrayList<Integer> sentencenumber = new ArrayList<Integer>();
		ArrayList<Integer> answer = new ArrayList<Integer>();
		for (int i = 0; i < word.length(); i++) {
			if (!wordlist.contains(word.charAt(i))) {
				wordlist.add(word.charAt(i));
				wordnumber.add(0);
				sentencenumber.add(0);
				answer.add(0);
			}
		}

		System.out.println(wordlist);
		for (int i = 0; i < wordlist.size(); i++) {
			for (int j = 0; j < word.length(); j++) {
				if (wordlist.get(i).equals(word.charAt(j))) {
					int n = wordnumber.get(i);
					wordnumber.set(i, n + 1);
				}
			}
		}

		System.out.println(wordnumber);

		for (int i = 0; i < wordlist.size(); i++) {
			for (int j = 0; j < senten.length(); j++) {
				if (wordlist.get(i).equals(senten.charAt(j))) {
					int n = sentencenumber.get(i);
					sentencenumber.set(i, n + 1);
				}
			}
		}
		System.out.println(sentencenumber);

		for (int i = 0; i < wordlist.size(); i++) {
			answer.set(i, sentencenumber.get(i) / wordnumber.get(i));
		}
		System.out.println(answer);

		int min = 0;
		for (int i = 0; i < wordlist.size(); i++) {
			for (int j = i + 1; j < wordlist.size(); j++) {
				if (answer.get(i) <= answer.get(j)) {
					min = answer.get(i);
				} else {
					min = answer.get(j);
				}
			}
		}
		System.out.println(min);

	}

}
