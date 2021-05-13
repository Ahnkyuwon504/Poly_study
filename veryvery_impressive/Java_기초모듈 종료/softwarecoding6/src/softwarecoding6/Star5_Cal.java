package softwarecoding6;

public class Star5_Cal {
	public int sum(int k20_a, int k20_b) { // 더하는 메소드.. 두개
		return k20_a+k20_b;
	}
	
	public int sum(int k20_a, int k20_b, int k20_c) { // 더하는 메소드.. 세개
		return k20_a+k20_b+k20_c; // 오버로딩
	}
	
	public int sum(int k20_a, int k20_b, int k20_c, int k20_d) { // 더하는 메소드..네개
		return k20_a+k20_b+k20_c+k20_d; // 오버로딩
	}
	
	public double sum(double k20_a, double k20_b) { // 더하는 메소드..이건 더블
		return k20_a+k20_b; // 오버로딩인건 같음..
	}

}
