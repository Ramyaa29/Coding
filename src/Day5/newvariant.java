package Day5;

import java.util.HashSet;
import java.util.Scanner;

public class newvariant {
    public int longestSeq(int[] arr) {
        int n = arr.length;
        int longest = 1;
        if (n == 0) return 0;
        HashSet<Integer> st = new HashSet<>();
        for (int i = 0; i < n; i++) {
            st.add(arr[i]);
        }
        for (int i : arr) {
            if (!st.contains(i - 1)) {
                int cnt = 1;
                int x = i;

                while (st.contains(x + 1)) {
                    x += 1;
                    cnt += 1;
                }
                longest = Math.max(longest, cnt);
            }

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

        newvariant x = new newvariant();
        int res = x.longestSeq(arr);
        System.out.println(res);
    }
}

//[100, 4, 200, 1, 3, 2]
//[0, -1, 3, 8, -2, 7, 6, 2, 1, 4, 5]
