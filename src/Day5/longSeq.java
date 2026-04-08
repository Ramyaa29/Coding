package Day5;

import java.util.Scanner;

public class longSeq {
    private boolean linearSearch(int[] a, int num) {
        int n = a.length;
        for (int i = 0; i < n; i++) {
            if (a[i] == num) {
                return true;
            }
        }
        return false;
    }

    public  int longestSeq(int[] arr) {
        int n = arr.length;
        int longest = 1;
        for (int i = 0; i < n; i++) {
            int x = arr[i];
            int cnt = 1;
            while (linearSearch(arr, x + 1) == true) {
                x += 1;
                cnt += 1;
            }
            longest = Math.max(longest, cnt);
        }
        return longest;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        longSeq res= new longSeq();
        int r=res.longestSeq(arr);
        System.out.println(r);
    }
}
