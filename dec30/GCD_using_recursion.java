package dec30;

import java.util.Scanner;

public class GCD_using_recursion {
	static int gcd(int a, int b){
        if (a == 0)
          return b;
        if (b == 0)
          return a;
        if (a == b)
            return a;
        if (a > b)
            return gcd(a-b, b);
        return gcd(a, b-a);
    }
	
	 public static void main(String[] args) {
	    	Scanner sc=new Scanner(System.in);
	    	System.out.println("enter 1st number");
	        int x = sc.nextInt();
	        System.out.println("enter 2nd number");
	        int y = sc.nextInt();
	        System.out.println("GCD of "+x+" and "+y+" is "+gcd(x, y));
	        sc.close();
	 }  

}
