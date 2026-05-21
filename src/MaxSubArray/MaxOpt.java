package MaxSubArray;
import java.util.Scanner;
public class MaxOpt {
    public int maxSubArray(int[] nums){
        int n= nums.length;
        long maxi= Long.MIN_VALUE;
        long sum=0;
        for(int i=0;i<n;i++){
            sum+=nums[i];
            if(sum>maxi){
                maxi=sum;
            }
            if(sum<0){
                sum=0;
            }
        }
        return (int)maxi;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        MaxOpt m= new MaxOpt();
        int res = m.maxSubArray(nums);
        System.out.println(res);
    }
    }
