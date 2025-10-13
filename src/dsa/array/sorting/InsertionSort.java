package dsa.array.sorting;
import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {3,5,4,1,2};
        System.out.println(Arrays.toString(insertionSort(arr)));
    }

    public static int[] insertionSort(int[] nums){

        for (int i = 0; i < nums.length-1; i++) {
            for (int j = i+1; j >0; j--) {
                if(nums[j]<nums[j-1]){
                    swap(nums,j,j-1);
                }else{
                    break;
                }
            }
        }
        return nums;
    }
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
