package dec27;

import java.util.Scanner;

public class Create_Print_Matrix {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter row");
		int r=sc.nextInt();
		System.out.println("enter column");
		int c=sc.nextInt();
		int a[][]=new int[r][c];
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				a[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		sc.close();
	}
}
