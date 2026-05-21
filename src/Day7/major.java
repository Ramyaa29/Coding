package Day7;
import java.util.*;
public class major {
    public List<Integer> majorityEle(int[] nums){
        int n= nums.length;
        List<Integer> result = new ArrayList<>();
        for(int i=0;i<n;i++){
            if(result.size()==0|| result.get(0)!= nums[i]
            && (result.size()< 2 || result.get(1)!=nums[i])){
                int count=0;
                for(int j=0;j<n;j++){
                    if(nums[j]==nums[i]){
                        count++;
                    }
                }
                if(count >n/3){
                    result.add(nums[i]);
                }
            }
            if(result.size()==2){
                break;
            }
        }
        return result;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        major m = new major();
        List<Integer>  ans = m.majorityEle(arr);
        System.out.println(ans);
    }
}
