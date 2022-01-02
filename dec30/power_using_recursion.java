package dec30;

import java.util.Scanner;

public class power_using_recursion {
	public static int power(int x, int y) {
        if (y == 0)
            return 1;
        if (x == 0)
            return 0;
        return x * power(x, y - 1);
    }
    
    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("enter 1st number");
        int x = sc.nextInt();
        System.out.println("enter 2nd number");
        int y = sc.nextInt();
  
        System.out.println(x+"^"+y+"="+power(x, y));
        sc.close();
    }

}
