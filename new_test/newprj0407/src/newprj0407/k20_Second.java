package newprj0407;

public class k20_Second {
	int[] aRray = {2, 33, 7, 5, 12, 34, 99, 25, 28, 53, 20};


	public static void main(String[] args) {
		k20_Second test = new k20_Second();
		k20_Second test2 = new k20_Second();
		
		for (int i = 0; i < test.aRray.length; i++) {
			System.out.print(test.get_Ascending(test.aRray)[i] + " ");
		}
		System.out.println();
		System.out.println("-----------------------");
		for (int i = 0; i < test2.aRray.length; i++) {
			System.out.print(test2.get_Original(test2.aRray)[i] + " ");
		}
		System.out.println();
		/*
		System.out.println("-----------------------");
		for (int i = 0; i < aRray.length; i++) {
			System.out.print(test.get_Descending(aRray)[i] + " ");
		}
		System.out.println();
		System.out.println("-----------------------");
		for (int i = 0; i < aRray.length; i++) {
			System.out.print(test.get_Original(aRray)[i] + " ");
		}
		*/
		

	}
	
	public int[] get_Original (int[] aRray) {
		/*int [] original_Array = aRray;
		int [] asc_Arr = aRray;
		
		for (int i = 0; i < aRray.length; i++) {
			int save_Num = aRray[i];
			for (int j = i; j < aRray.length; j++) {
				if (aRray[j] <= aRray[i]) {
					aRray[i] = aRray[j];
					aRray[j] = save_Num;
					save_Num = aRray[i];
				}
			}
		}
		asc_Arr = aRray;*/
		//aRray = original_Array;
		
		return aRray;
	}
	
	public int[] get_Ascending (int[] aRray) {
		int [] original_Array = aRray;
		int [] asc_Arr = aRray;
		
		for (int i = 0; i < aRray.length; i++) {
			int save_Num = aRray[i];
			for (int j = i; j < aRray.length; j++) {
				if (aRray[j] <= aRray[i]) {
					aRray[i] = aRray[j];
					aRray[j] = save_Num;
					save_Num = aRray[i];
				}
			}
		}
		asc_Arr = aRray;
		aRray = original_Array;
		
		return asc_Arr;
	}
	
	public static int[] get_Descending (int[] aRray) {
		int [] original_Array = aRray;

		int [] dsc_Arr = aRray;
		
		for (int i = 0; i < aRray.length; i++) {
			int save_Num = aRray[i];
			for (int j = i; j < aRray.length; j++) {
				if (aRray[j] >= aRray[i]) {
					aRray[i] = aRray[j];
					aRray[j] = save_Num;
					save_Num = aRray[i];
				}
			}
		}
		dsc_Arr = aRray;
		aRray = original_Array;
		
		return dsc_Arr;
	}
}
