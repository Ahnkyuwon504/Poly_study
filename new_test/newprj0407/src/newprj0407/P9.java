package newprj0407;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class P9 {
	static int strRank = 1;
	public static void main(String[] args) {
		List<Runners> list = new ArrayList<>();

		list.add(new Runners("0��"));
		list.add(new Runners("1��"));
		list.add(new Runners("2��"));

		for (Runners runner : list) {
			runner.start(); // �޸��� ����
		}

		for (Runners runner : list) { // ������ ������ ��ٷȴٰ� ����� ��µ�
			try {
				runner.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		Collections.sort(list);
		System.out.println("��ⳡ ....");
		System.out.println("======================================================");
		System.out.println();
		System.out.println(" ��� ��� ");

		for (Runners runner : list) {
			System.out.println(runner.getName1() + " " + runner.getRank() + "��");
		}
	}
}

class Runners extends Thread implements Comparable<Runners> {
	private String name1; // private���� ������ ����
	int rank; // private�� �ƴϹǷ� rank�� ���������� ���� ++�� �ö�

	public Runners(String name) {
		this.name1 = name;
	}

	public String getName1() {
		return name1;
	}

	public void setName1(String name) {
		this.name1 = name;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	@Override
	public void run() {
		for (int i = 0; i < 50; i++) {
			System.out.println("\n" + name1 + " : ");
			for (int j = 0; j < i; j++) {
				System.out.print("-");
			}
			System.out.print(">");

			for (int j = 49; j > i; j--) {
				System.out.print("-");
			}

			System.out.println();

			try {
				Thread.sleep((int) (Math.random() * 500));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
		System.out.println(name1 + " ��");

		setRank(P9.strRank);
		P9.strRank++;
	}

	@Override
	public int compareTo(Runners runner) {
		if (rank > runner.getRank()) {
			return 1;
		} else {
			return -1;
		}
	}
}
