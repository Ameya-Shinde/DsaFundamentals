package jan3;

import java.util.Scanner;

public class merge_ascend {
	static void merge(int a[], int start, int mid, int end){
	        int i, j, k;  
	        int n1 = mid - start + 1;    
	        int n2 = end - mid;    
	      
	        int L[] = new int[n1];  
	        int R[] = new int[n2];  
	      
	       
	     for (i = 0; i < n1; i++)    
	     L[i] = a[start + i];    
	     for (j = 0; j < n2; j++)    
	     R[j] = a[mid + 1 + j];    
	      
	    i = 0;   
	    j = 0;    
	    k = start; 
	      
	    while (i < n1 && j < n2){
	        if(L[i] <= R[j]){    
	            a[k] = L[i];    
	            i++;    
	        }else{    
	            a[k] = R[j];    
	            j++;    
	        }    
	        k++;    
	    } 
	    
	    while (i<n1){    
	        a[k] = L[i];    
	        i++;    
	        k++;    
	    }    
	     
	    while (j<n2){    
	        a[k] = R[j];    
	        j++;    
	        k++;    
	    }    
	}    
	  
	   static void mergeSort(int a[], int start, int end){
	    if (start < end){  
	        int mid = (start + end) / 2;  
	        mergeSort(a, start, mid);  
	        mergeSort(a, mid + 1, end);  
	        merge(a, start, mid, end);  
	    }  
	}  
	  
	  static void printArray(int a[], int n){
	    int i;  
	    for (i = 0; i < n; i++) { 
	        System.out.print(a[i] + " ");}
	} 
	
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("enter array size");
	    	int n =sc.nextInt();
	        int a[] =new int[n];
	        
	        System.out.println("enter array elements");
	        for(int i=0;i<n;i++) {
	        	a[i]=sc.nextInt();
	        }  
		    mergeSort(a,0,n-1);  
		    System.out.println("sorted array is = ");  
		    printArray(a,n);
		    sc.close();
		}
}
