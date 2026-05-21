package MaxSubArray;
import java.util.Scanner;
public class MaxBetter {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int maxi = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += nums[j];

                maxi = Math.max(maxi, sum);
            }
        }
        return maxi;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        MaxBetter m= new MaxBetter();
        int res = m.maxSubArray(nums);
        System.out.println(res);
    }
}

