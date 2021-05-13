package newprj;

import java.util.ArrayList;
import java.util.Scanner;

public class Register {
	public static void main(String[] args) {
		    Scanner sc = new Scanner(System.in);
		      ArrayList courselist = new ArrayList();

		      while (true) {
		         System.out.println("*Menu\n1. Course List\n2. My Course");
		         System.out.println(" ");
		         int N = sc.nextInt();

		         ,"
		         
		         
		         if (N == 1) {
		            while (true) {
		               System.out.println();
		               System.out.println(
		                     "*Course List\n1. Korean\n2. Math\n3. English\n4. Social Studies\n5. Science\n0. Back to Main");
		               int M = sc.nextInt();

		               switch (M) {
		               case 1:
		                  courselist.add("Korean");
		                  System.out.println("\"Korean\" is registered.");
		                  System.out.println();
		                  break;
		               case 2:
		                  courselist.add("Math");
		                  System.out.println("\"Math\" is registered.");
		                  System.out.println();
		                  break;
		               case 3:
		                  courselist.add("English");
		                  System.out.println("\"English\" is registered.");
		                  System.out.println();
		                  break;
		               case 4:
		                  courselist.add("Social Studies");
		                  System.out.println("\"Social Studies\" is registered.");
		                  System.out.println();
		                  break;
		               case 5:
		                  courselist.add("Science");
		                  System.out.println("\"Science\" is registered.");
		                  System.out.println();
		                  break;
		               case 0:
		                  break;
		               }
		               if (M == 0) {
		                  System.out.println();
		                  break;
		               }
		            }

		         }

		         else {
		            System.out.println("*My Course");
		            for (int i = 0; i < courselist.size(); i++) {
		               System.out.println((i+1) + ". " + courselist.get(i));
		            }
		            System.out.println("- End -");
		            System.out.println();

		         }

		      }

		   }

		}

}

}
