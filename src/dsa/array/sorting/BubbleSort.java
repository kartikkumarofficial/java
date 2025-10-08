package dsa.array.sorting;

import java.util.Arrays;

public class BubbleSort{
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void bubbleSort(int[] nums){

        boolean swapped;

        //run the steps n-1 times
        for (int i =0;i<nums.length;i++){
            swapped = false;
            //for each step , max item will come at the last index
            for (int j =1;j<nums.length-i ;j++){
                //swap if the item is smaller than the prev item
                if(nums[j]<nums[j-1]){
                    //swap
                    int temp = nums[j];
                    nums[j]=nums[j-1];
                    nums[j-1]=temp;
                    swapped = true;
                }

            }
            //if not swapped for any value of i , it means array is sorted hence end the program
            if(!swapped)break;
        }
    }

}