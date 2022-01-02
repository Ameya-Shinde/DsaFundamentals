package dec27;

import java.util.Scanner;

public class Spiraal_in_Matrix {
	static void spiral(int m, int n, int a[][])
    {
        int i, k = 0, l = 0;
        while (k < m && l < n) {
           
            for (i = l; i < n; ++i) {
                System.out.print(a[k][i] + " ");
            }
            k++;
            for (i = k; i < m; ++i) {
                System.out.print(a[i][n - 1] + " ");
            }
            n--;
            if (k < m) {
                for (i = n - 1; i >= l; --i) {
                    System.out.print(a[m - 1][i] + " ");
                }
                m--;
            }
            if (l < n) {
                for (i = m - 1; i >= k; --i) {
                    System.out.print(a[i][l] + " ");
                }
                l++;
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
		spiral(r, c, a);
		sc.close();
	}		
	
}
