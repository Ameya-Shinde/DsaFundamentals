package dec28;

public class Max_min_recur {
	public static int mini(int a[], int n)
    {
      if(n == 1)
        return a[0];
         
        return Math.min(a[n-1], mini(a, n-1));
    }
    public static int maxi(int a[], int n)
    {
      if(n == 1)
        return a[0];
         
        return Math.max(a[n-1], maxi(a, n-1));
    }
    public static void main(String args[])
    {
        int arr[] = {1,-1,0,2,-2,3,-3,4,-4};
        int n = arr.length;
        System.out.println(mini(arr, n));
        System.out.println(maxi(arr, n));
        
    }
}
