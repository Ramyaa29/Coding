package Day1;

import java.util.*;
public class p1 {
    static ArrayList<Integer> getAlternative(int[] arr){
        ArrayList<Integer> res = new ArrayList<>();

        for(int i=0;i< arr.length;i+=2){
            res.add(arr[i]);
        }
        return res;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        ArrayList<Integer> res = getAlternative(arr);
        System.out.println(res);

    }
}
