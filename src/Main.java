import java.util.*;
class Main{
    public static void main(String[] args) {
//        int[] arr = {1,2,3,4};
////        int n=5;
//        int[] arr1 = new int[2];
//        arr1[0]=20;
//        arr1[1]= 30;
//        int length= arr1.length;
//
////        for(int i=0;i<arr1.length;i++){
////            System.out.println(arr1[i]);
////        }
//        for(int i:arr1){
//            System.out.println(i);
//        }
//        arr[0]= 45;
//        arr[3]= 52;
//        System.out.println(arr[0]);
//        System.out.println(Arrays.toString(arr));
//        System.out.println(Arrays.toString(arr1));
//        System.out.println(length);
//
        int[] arr1 = {1,2,3,4};
        int[] arr2 = {5,6,7,};
        int arr1len= arr1.length;
        int arr2len = arr2.length;

        int[] concatenatedArr= new int[arr1len+arr2len];
        System.arraycopy(arr1,0,concatenatedArr, 0, arr1len);
        System.out.println(Arrays.toString(concatenatedArr));
    }
}