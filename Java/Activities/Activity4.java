package activities;

import java.util.Arrays;

public class Activity4 {
    public static void main(String[] args){

        int[] arr = {11, 34, 12, 45, 87, 1, 21, 6};

        System.out.println("Array before sorting : "+ Arrays.toString(arr));

        for(int i=1; i<arr.length; i++ ){

            int j = i-1;
            int key = arr[i];
            while(j>=0 && key<arr[j]){

                arr[j+1] = arr[j];
                --j;
            }
            arr[j+1] = key;
        }
        System.out.println("Sorted array in ascending array");
        System.out.println(Arrays.toString(arr));
    }
}
