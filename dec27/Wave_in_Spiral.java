package dec27;

import java.util.Scanner;

public class Wave_in_Spiral {
	static void wave(int m, int n, int arr[][]) {
        int i, j = n - 1, wave = 1;
        while (j >= 0) { 
            if (wave == 1) {
                for (i = 0; i < m; i++)
                    System.out.print(arr[i][j] +" ");
                wave = 0;
                j--;
            }else {
                for (i = m - 1; i >= 0; i--)
                    System.out.print( arr[i][j] + " ");
                 wave = 1;
                j--;
            }
        }
    }
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
		wave(r,c,a);
		sc.close();
	}	

}
