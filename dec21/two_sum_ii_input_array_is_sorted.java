package dec21;

public class two_sum_ii_input_array_is_sorted {
	public int[] twoSum(int[] numbers, int target) {
        int n=numbers.length-1;
        int a=-1,b=-1,sum=0;
        for(int i=0;i<=n-1;i++) {
            for(int j=i+1;j<=n;j++) {
                sum=numbers[i]+numbers[j];
                if(sum==target) {
                    a=i+1;
                    b=j+1;
                    break;
                }       
            }
        }
        int ans[]={a,b};
        return ans;
    }
}

