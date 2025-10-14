package dsa.array.sorting;

import java.util.Arrays;

public class CycleSort {
    public static void main(String[] args) {
        int[] arr = {4, 1, 5, 6, 3, 2};
        System.out.println(Arrays.toString(cycleSort(arr)));
    }

    public static int[] cycleSort(int nums[]) {
        int i = 0;
        while (i < nums.length) {
            if (nums[i] != i + 1) {
                swap(nums,i,nums[i]-1);
            }else{
                i++;
            }
        }
        return nums;
    }




    public static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}


//value = index+1