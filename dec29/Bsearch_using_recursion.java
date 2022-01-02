package dec29;

public class Bsearch_using_recursion {
	static int binarySearch(int arr[], int start, int end, int x)
    {	 if (end >= start) {
            int mid = start + (end - start) / 2;
 
            if (arr[mid] == x)
                return mid;
 
            if (arr[mid] > x)
                return binarySearch(arr, start, mid - 1, x);
 
            return binarySearch(arr, mid + 1, end, x);
        }
    	return -1;
    }
 
 public static void main(String args[])
    {
        int arr[]={ 2, 3, 4, 10, 40 };
        int n=arr.length;
        int x=10;
        int result =binarySearch(arr, 0, n - 1, x);
        if (result==-1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at index "+result);
    }

}
