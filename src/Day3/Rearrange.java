package Day3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Rearrange {
    public int[] reArrange(int[] arr) {
        int n = arr.length;
        int[] res = new int[n];

        int posIndex=0, negIndex =1;
        for(int i=0;i<n;i++){
            if(arr[i]<0){
                res[negIndex]=arr[i];
                negIndex+=2;
            }else{
                res[posIndex]=arr[i];
                posIndex+=2;
            }
        }
        return res;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Rearrange obj = new Rearrange();
        int[] result = obj.reArrange(arr);

        // Print the result
        for (int num : result) { //{1,2,-4,-5}, N = 4
            System.out.print(num + " ");
        }
    }
}