package dec23;

import java.util.Arrays;
import java.util.Scanner;

public class LinearTime {
	
	static void sortString(String str) {
        char []arr = str.toCharArray();
        Arrays.sort(arr);
        System.out.print(String.valueOf(arr));
    }
	
	
    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter your string");
        String s = sc.next();
        sortString(s);
        sc.close();
    }

}
