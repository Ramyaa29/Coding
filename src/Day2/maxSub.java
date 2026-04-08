package Day2;
import java.util.*;

public class maxSub {
    public static int maxSubArr(int[] arr){
        int n= arr.length;
        long maxi=Long.MIN_VALUE;
        long sum=0;
        for(int i=0;i<n;i++){
                sum+=arr[i];
                if(sum>maxi){
                    maxi=sum;
                }
                if(sum<0){
                    sum=0;
                }
        }
        return (int) maxi;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        int res=maxSubArr(arr);
        System.out.println(res);
    }
}
