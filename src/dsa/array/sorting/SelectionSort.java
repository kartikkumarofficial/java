package dsa.array.sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {

        int[] arr = {3,5,1,4,2};
        System.out.println(Arrays.toString(selectionSort(arr)));

    }

    public static int[] selectionSort(int[] nums) {

        int n = nums.length - 1;
        //find min

        //outer loop
        for (int i = 0; i <= n; i++) {
            int maxVal = nums[0];
            int maxIndex = 0;
            //inner loop
            for (int j = 0; j <= n-i; j++) {
                if (nums[j] > maxVal) {
                    maxVal = nums[j];
                    maxIndex = j;
                }


            }
            //swaping
            nums[maxIndex] = nums[n - i];
            nums[n - i] = maxVal;


            // making the array small so to decrease steps

        }
        return nums;


    }
}
