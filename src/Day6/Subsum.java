package Day6;

import java.util.Scanner;

public class Subsum {
    public int subArraySum(int[] arr, int k){
        int n= arr.length;
        int count =0;
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=i;j<n;j++){
                sum+=arr[j];

                if(sum==k) count++;
            }
        }
        return count;
    }

    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int k= sc.nextInt();
        int[] arr= new int[n];
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        Subsum res = new Subsum();
        int r=res.subArraySum(arr,k);
        System.out.println(r);
    }
}
