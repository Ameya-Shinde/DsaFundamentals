package dec20;

import java.util.Scanner;

public class Search {
	
	public static int first(int t,int arr[]) {
		int start=0;
		int c=0;
		int end=arr.length-1;
		while(start<=end) {
			int mid=start+(end-start);
			if(t==arr[mid]) {
				c=c+1;
				end=mid-1;
			}else if(t<arr[mid]) {
				end=mid-1;
			}else {
				start=mid+1;
			}
		}
		return c;
	}
	
	public static int last(int t,int arr[]) {
		int c1=0;
		int start=0;
		int end=arr.length-1;
		while(start<=end) {
			int mid=start+(end-start);
			if(t==arr[mid]) {
				c1=c1+1;
				start=mid+1;
			}else if(t<arr[mid]) {
				end=mid-1;
			}else {
				start=mid+1;
			}
		}
		return c1;
	}
	
	public static void main(String args[]) {
		int f=-1;
		int l=-1;
		Scanner sc=new Scanner(System.in);
		int[] arr= {1,2,3,3,3,3,3,3,3,4,4,4,5,6};
		System.out.println("enter the number");
		int t=sc.nextInt();
		 f=first(t,arr);
		 l=last(t,arr);
		int c=(f+l)-1;
		System.out.println("frequency ="+c);
		sc.close();
	}
}
