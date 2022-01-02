package dec28;

import java.util.Scanner;

public class Fib_till_n {
	static int n1=0,n2=1,n3=0; 
	 public static void fib(int x){  
		 if(x>0){    
	         n3 = n1 + n2;    
	         n1 = n2;    
	         n2 = n3;    
	         System.out.print(" "+n3);   
	         fib(x-1);    
	     }
	 }    
	 public static void main(String args[]){  
		 Scanner sc=new Scanner(System.in);
		 
		 System.out.println("enter number");
	  int x=sc.nextInt();    
	 System.out.print(n2);   
	  fib(x-1); 
	  sc.close();
	 }  
}
