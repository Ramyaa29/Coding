package Day7;
import java.util.Scanner;
public class mojarity {
    public int majorityElement(int[] nums) {
        int n= nums.length;
        for(int i=0;i<n;i++){
            int cnt=0;
            for(int j=0;j<n;j++){
                if(nums[j]==nums[i]){
                    cnt++;
                }
            }
            if(cnt>n/2){
                return nums[i];
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        mojarity  m = new mojarity();
        int ans = m.majorityElement(nums);
        System.out.println("The major element is: "+ans);
    }
}
