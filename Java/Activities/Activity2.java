package activities;

import java.util.Arrays;

public class Activity2 {

    public static void main(String[] args){

        int[] Num = {10, 77, 10, 54, -11, 10};
        int sum = 0;
        for(int i=0; i<=Num.length-1; i++) {

            if (Num[i] == 10) {
                sum = sum + Num[i];
            }
        }
        System.out.println("Sum of 10's in the array = "+sum);

    }

//    public static boolean result(int numbers[], in
//        for()
//
//    }
}

