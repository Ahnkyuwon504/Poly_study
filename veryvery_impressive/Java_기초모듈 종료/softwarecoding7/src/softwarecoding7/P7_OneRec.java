///////////////////////////////////////////////////////////////////////
// 소프트웨어코딩 7강 : String, Byte, StringBuffer, Array, ArrayList
// 7. 클래스의 배열 (6강 InputData클래스 재구성)
//
// java version "1.8.0_281"
//
// 2021. 04. 28. (수)
// 융합SW A반 2125341020 안규원
///////////////////////////////////////////////////////////////////////
package softwarecoding7;

public class P7_OneRec {
	private String k20_name; // 전역변수 선언
	private int k20_kor; // 전역변수 선언
	private int k20_eng; // 전역변수 선언
	private int k20_mat; // 전역변수 선언
	
	public P7_OneRec(String name, int kor, int eng, int mat) { // 생성자
		this.k20_name = name; // 이름 초기화..
		this.k20_kor = kor; // 국어 초기화..
		this.k20_eng = eng; // 영어 초기화..
		this.k20_mat = mat; // 수학 초기화..
	}
	
	public String name() {return this.k20_name;}; // 이름 return..
	public int kor() {return this.k20_kor;}; // 국어 return..
	public int eng() {return this.k20_eng;}; // 영어 return..
	public int mat() {return this.k20_mat;}; // 수학 return..
	public int sum() {return this.k20_kor + this.k20_eng + this.k20_mat;}; // 총합 return..
	public double ave() {return this.sum() / 3.0;}; // 평균 return...
}

