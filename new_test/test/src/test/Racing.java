package test;

import java.util.Scanner;

class Racing implements Runnable {
   
   public static void main(String[] args) throws InterruptedException {
      
      Racing main = new Racing();
      Thread thread = new Thread(main);
      thread.start();
   }
   
   @Override
   public void run() {
      // TODO Auto-generated method stub
         Scanner sc = new Scanner(System.in);
         int input = sc.nextInt();
         for(int i = 0; i < input; i++) {   
         double reach = 0;
            while(reach <= 50) {
               try {
                  double num = Math.random() * 10;
                  double rand = Math.round(num * 10) / 10.0;
                  Thread.sleep(100);
                  reach = reach + num;
                  if(reach >= 50) {
                  System.out.print("(Finished)" + "\n");
                  } else {   
                  System.out.printf("%.1f",reach);
                  System.out.print("m" + "\t");
                  }
               } catch (Exception e) {         
            }   
         }
      }   
   }
}
