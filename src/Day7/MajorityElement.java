package Day7;
import java.util.Scanner;
public class MajorityElement {
    public  int majorityElement(int[] nums){
        int cnt=0;
        int el=0;
        int n= nums.length;
        for(int i=0;i<n;i++) {
            if (cnt == 0) {
                cnt = 1;
                el = nums[i];
            } else if (el == nums[i]) {
                cnt++;
            } else {
                cnt--;
            }
        }
        int cnt1=0;
        for(int i=0;i<n;i++){
            if(nums[i]==el){
                cnt1++;
            }
        }
        if(cnt1>(n/2)){
            return el;
        }
        return -1;
    }

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n= sc.nextInt();
       int[] nums= new int[n];
       for(int i=0;i<n;i++){
           nums[i]= sc.nextInt();
       }
        MajorityElement m = new MajorityElement();
       int ans= m.majorityElement(nums);
        System.out.println("Majority element is:" +ans);
    }
}
