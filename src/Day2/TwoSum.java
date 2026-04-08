package Day2;

import java.util.HashMap;
import java.util.Scanner;

public class TwoSum {
    public static String twoSum(int[] arr, int target){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i< arr.length;i++){
            int complement = target- arr[i];
            if(map.containsKey(complement)){
                return "Yes";
            }
            map.put(arr[i],i);
        }
        return "No";
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr= new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        String res = twoSum(arr,target);
        System.out.println(res);

    }
}
