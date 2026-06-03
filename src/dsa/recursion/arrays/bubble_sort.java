package dsa.recursion.arrays;

import java.util.Arrays;

public class bubble_sort {
    public static void main(String[] args) {
        int[] arr = {5,3,7,2,19};
        bubblesort(arr,arr.length-1,0);
        System.out.println(Arrays.toString(arr));

    }


    private static void bubblesort(int[] arr,int r , int c) {
        //base case
        if (r == 0) {
            return;
        }
        if(c<r){
            //swap
            if(arr[c]>arr[c+1]) {
                int temp = arr[c];
                arr[c + 1] = arr[c];
                arr[c] = temp;
            }
            bubblesort(arr , r , c+1);
        }else{
                bubblesort(arr,r-1,0);
            }
            }
        }


