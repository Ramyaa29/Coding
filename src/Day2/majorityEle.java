package Day2;

import java.util.Arrays;
import java.util.Scanner;

public class majorityEle {
    public static int majorELe(int[] arr) {
        int n = arr.length;
        int cnt = 0;
        int el = 0;
        for (int i = 0; i < n; i++) {
            if (cnt == 0) {
                cnt = 1;
                el = arr[i];
            } else if (el == arr[i]) {
                cnt++;
            } else {
                cnt--;
            }
            int cnt1 = 0;
            for ( i = 0; i < n; i++) {
                if (arr[i] == el) {
                    cnt1++;
                }
                if (cnt1 > n / 2) {
                    return el;
                }

            }
        }
        return -1;
    }

    //        for (int i = 0; i < n; i++) {
//            int cnt = 0;
//            for (int j = 0; j < n; j++) {
//                if (arr[j] == arr[i]) {
//                    cnt++;
//                }
//            }
//            if (cnt > n / 2) {
//                return arr[i];
//            }
//        }
//        return -1;


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int res = majorELe(arr);
        System.out.println(res);

    }
}
