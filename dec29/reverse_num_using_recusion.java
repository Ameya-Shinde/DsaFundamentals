package dec29;

import java.util.Scanner;

public class reverse_num_using_recusion {
	 public static void Reverse(int num)
	    {
	        if (num < 10) {
	            System.out.println(num);
	            return;
	        } else {
	            System.out.print(num % 10);
	            Reverse(num / 10);
	        }
	    }
	 
	 public static void main(String args[]) {
		 Scanner sc=new Scanner(System.in);
			System.out.println("enter number");
			int n=sc.nextInt();
			Reverse(n);
			sc.close();
	 }

}
