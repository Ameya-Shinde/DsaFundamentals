package dec23;

import java.util.Scanner;

public class ArraySort {
	
	public static void sort(int[] arr,int n) {
		for(int i=0;i<n;i++) {
			for(int j=0;j<n-i;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size of array");
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		sort(arr,n);
		for(int i=0;i<n;i++) {
			System.out.println(arr[i]);
		}
		sc.close();
	}

}
