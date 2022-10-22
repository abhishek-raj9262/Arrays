package Arrays;

import java.util.Arrays;

public class ReverseArray2 {
    public static void main(String[] args) {
        int[] arr = { 1,3,4,5,6,7};
        Reverse(arr);
        System.out.println(Arrays.toString(arr));
    }

    //static void Reverse(int[] arr){
//        int start=0;
//        int end = arr.length-1;
//        while (start< end){
//            int temp = arr[start];
//            arr[start] = arr[end];
//            arr[end]= temp;
//            start++;
//            end--;
    static void Reverse(int[] arr){
        int end = arr.length-1;
        for (int i = 0; i < end; i++) {
            int temp= arr[i];
            arr[i] = arr[end];
            arr[end] = temp;
            end--;
        }
    }
}

