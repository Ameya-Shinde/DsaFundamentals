package dec23;

import java.util.Arrays;
import java.util.Scanner;

public class TwoSum {
	
	public static void pairedElements(int arr[], int sum) {

        int low = 0;

        int high = arr.length - 1;

        while (low < high) {

            if (arr[low] + arr[high] == sum) {

                System.out.println("The pair is : (" + arr[low] + ", " + arr[high] + ")");

            }
            if (arr[low] + arr[high] > sum) {

                high--;

            } else {

                low++;

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

        Arrays.sort(arr);
        pairedElements(arr, 8);
        sc.close();

    }

}
