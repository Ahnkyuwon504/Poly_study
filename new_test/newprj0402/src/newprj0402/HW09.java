package newprj0402;

import java.util.ArrayList;

public class HW09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		///////////////////////////////////////////////////
		// #9. ����,�ݺ�,�迭 9�� / 2021.04.01. / 2125341020 �ȱԿ�
		// �迭
		///////////////////////////////////////////////////
		
		int[] k20_score = {100, 90, 80, 70, 60}; // array�� ���� ���ǹ� 1
		int[] k20_score1 = new int[] {100, 90, 80, 70, 60}; // array�� ���� ���ǹ� 2
		int[] k20_score3; // array�� ���� ���ǹ� 3
		k20_score3 = new int[] {100, 90, 80, 70, 60}; // array�� ĭ�� ������ �ֱ� ������ �̷��� �ؾ���
		
		ArrayList<Integer> k20_result = new ArrayList<Integer> (); // add �̿��ؼ� array�� �����ʹٸ�, ArrayList �������.
		k20_result.add(100); // 100 �߰�
		k20_result.add(80); // 80 �߰�
		k20_result.add(60); // 60 �߰�
		k20_result.add(40); // 40 �߰�
		k20_result.add(20); // 20���� �߰� �Ϸ�.
		System.out.printf("First : %d\nSecond : %d\nThird : %d\nFourth : %d\nFifth : %d\n", 
				k20_result.get(0), k20_result.get(1), k20_result.get(2), k20_result.get(3), k20_result.get(4));
		// ArrayList�� ���ҵ��� �̿� ���� �ҷ����� ���� ���� for���� ����ϰų� ��� �����ϸ� �ȴ�. 
		
	}

}
