package dec28;

import java.util.Scanner;

public class Print_even {
	public static void even(int x) {
		if(x>0) {
			if(x%2==0) {
			System.out.println(x);
			}
			even(x-1);
		}
	}
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int n=sc.nextInt();
		even(n);
		sc.close();
	}

}
