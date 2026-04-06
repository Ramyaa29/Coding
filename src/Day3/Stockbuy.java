package Day3;
import java.util.*;
public class Stockbuy {
        public static int stockBuy(int[] arr){
            int n= arr.length;
            int min = Integer.MAX_VALUE;
            int maxProfit=0;
            for(int i=0;i<n;i++){
                if(arr[i]<min){
                    min = arr[i];
                }else{
                    maxProfit=Math.max(maxProfit, arr[i]-min);
                }






//                for(int j=i+1;j<n;j++) {
//                    int profit = arr[j] - arr[i];
//                    maxProfit = Math.max(maxProfit, profit);
//                } [7,1,5,3,6,4]
            }
            return maxProfit;
        }
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0;i<n;i++){
                arr[i]= sc.nextInt();
            }
            System.out.println(stockBuy(arr));

        }
}
