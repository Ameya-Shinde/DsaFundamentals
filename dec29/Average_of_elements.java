package dec29;

import java.util.Scanner;

public class Average_of_elements {
	
	
	 static int average(int a[],int i, int n)
	    {
	        if (i == n-1)
	            return a[i];
	      
	        if (i == 0)
	            return ((a[i] + average(a, i+1, n))/n);
	      
	        return (a[i] + average(a, i+1, n));
	    }
	
	public static void main (String[] args)
    {	Scanner sc=new Scanner(System.in);
    	System.out.println("enter array size");
    	int n =sc.nextInt();
        int a[] =new int[n];
        System.out.println("enter array elements");
        for(int i=0;i<n;i++) {
        	a[i]=sc.nextInt();
        }
        System.out.println("array average is");
        System.out.println(average(a,0, n));
        sc.close();
    }

	
}
