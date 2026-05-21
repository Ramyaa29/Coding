package MaxSubArray;
import java.util.Scanner;
public class MaxBrute {
    public int maxSubArray(int[] nums){
        int n = nums.length;
        int maxi=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int sum=0;
                for(int k=i;k<j;k++){
                    sum+=nums[k];
                }
                maxi=Math.max(maxi,sum);
            }
        }
        return maxi;
    }

    public static void main(String[] args) {
     Scanner sc= new Scanner(System.in);
     int n= sc.nextInt();
     int[] nums = new int[n];
     for(int i=0;i<n;i++){
         nums[i]=sc.nextInt();
     }
        MaxBrute m= new MaxBrute();
        int res = m.maxSubArray(nums);
        System.out.println(res);
    }
}
