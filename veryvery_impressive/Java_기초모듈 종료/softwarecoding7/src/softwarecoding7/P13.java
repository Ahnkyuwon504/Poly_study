///////////////////////////////////////////////////////////////////////
// 소프트웨어코딩 7강 : String, Byte, StringBuffer, Array, ArrayList
// 8. ArrayList 정렬(Sort)
//
// java version "1.8.0_281"
//
// 2021. 04. 28. (수)
// 융합SW A반 2125341020 안규원
///////////////////////////////////////////////////////////////////////
package softwarecoding7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class P13 {

	static ArrayList<P10_OneRec> OneRec_ArrayList = new ArrayList<P10_OneRec>();
	// 객체를 타입으로 하는 ArrayList 생성
	static int sumkor = 0;
	static int sumeng = 0;
	static int summat = 0;
	static int sumsum = 0;
	static int sumave = 0;
	static final int iPerson = 20;
	
	public static void dataSet() {
		for (int i = 0; i < iPerson; i++) {
			String student_id = String.format("%03d", i + 1);
			String name = String.format("홍길%03d", i + 1);
			int kor = (int)(Math.random() * 100);
			int eng = (int)(Math.random() * 100);
			int mat = (int)(Math.random() * 100);
			OneRec_ArrayList.add(new P10_OneRec(student_id, name, kor, eng, mat));
		}
	}
	
	public static void HeaderPrint() {
		System.out.printf("***************************************\n");
		System.out.printf("%2s %4s  %2s %2s %2s %2s   %2s\n",
						  "번호", "이름", "국어", "영어", "수학", "합계", "평균");
		System.out.printf("***************************************\n");
	}
	
	public static void ItemPrint(int i) {
		P10_OneRec rec;
		
		rec = OneRec_ArrayList.get(i);
		System.out.printf("%3s %4s   %3d  %3d  %3d  %3d %6.2f\n",
				  rec.student_id(), rec.name(), 
				  rec.kor(), rec.eng(), rec.mat(), rec.sum(), rec.ave());
		
		sumkor += rec.kor();
		sumeng += rec.eng();
		summat += rec.mat();
		sumsum += rec.sum();
		sumave += rec.ave();
	}
	
	public static void TailPrint() {
		System.out.printf("***************************************\n");
		System.out.printf(" 국어합계 %8d  국어평균 %6.2f\n", sumkor, sumkor / (double)OneRec_ArrayList.size());
		System.out.printf(" 영어합계 %8d  영어평균 %6.2f\n", sumeng, sumeng / (double)OneRec_ArrayList.size());
		System.out.printf(" 수학합계 %8d  수학평균 %6.2f\n", summat, summat / (double)OneRec_ArrayList.size());
		System.out.printf("***************************************\n");
		System.out.printf(" 반평균합계 %6d  반평균 %6.2f\n", sumave, sumave / (double)OneRec_ArrayList.size());

	}
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		dataSet();
		dataSort();
		HeaderPrint();
		for (int i = 0; i < OneRec_ArrayList.size(); i++) {
			ItemPrint(i);
		}
		TailPrint();
		

	}
	
	public static void dataSort() {
		Comparator<P10_OneRec> bikyeokijun = new Comparator<P10_OneRec>() {
			public int compare(P10_OneRec a1, P10_OneRec a2) {
				return (a1.sum() - a2.sum());
			}
		};
		Collections.sort(OneRec_ArrayList, bikyeokijun);
		
		
		
		
	}

}
