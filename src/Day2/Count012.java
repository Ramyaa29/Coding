package Day2;

import java.util.Arrays;
import java.util.Scanner;

//public class Count012 {
//    public static void  CountFre(int[] arr){
//        int count0=0,count1=0,count2=0;
//
//        for(int i:arr){
//            if(i==0) count0++;
//            else if(i==1) count1++;
//            else count2++;
//        }
////        int index=0;
////        while(count0-- >0) {
////            arr[index++]=0;
////        }
////        while(count1-- >0) {
////            arr[index++]=1;
////        }
////        while(count2-- >0) {
////            arr[index++]=2;
////        }
//
//        for(int i=0;i<count0;i++){
//            arr[i]=0;
//        }
//        for(int i=count0;i<count0+count1;i++){
//            arr[i]=1;
//        }
//        for(int i=count0+count1;i<arr.length;i++){
//            arr[i]=2;
//        }
//    }
//
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//
//        int[] arr = new int[n];
//        for(int i=0;i<n;i++){
//            arr[i]= sc.nextInt();
//        }
//        CountFre(arr);
//        for(int i : arr){
//            System.out.print(i + " ");
//        }
//    }
 public class Count012 {
     public static void countFreq(int[] arr){
         int low=0, mid=0,high=arr.length-1;
         while(mid<=high){
             if(arr[mid]==0){
                 int temp= arr[low];
                 arr[low]= arr[mid];
                 arr[mid]=temp;
                 low++;
                 mid++;
             }
             else if(arr[mid]==1){
                 mid++;
             }
             else{
                 int temp = arr[mid];
                 arr[mid]= arr[high];
                 arr[high]= temp;
                 high--;
             }
         }
     }
     public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         int n= sc.nextInt();
         int[] arr = new int[n];
         for(int i=0;i<n;i++){
             arr[i]= sc.nextInt();
         }
         countFreq(arr);
             System.out.println(Arrays.toString(arr));
     }


}

