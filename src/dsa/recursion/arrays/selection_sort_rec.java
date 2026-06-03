package dsa.recursion.arrays;

import java.util.Arrays;

public class selection_sort_rec {

    public static void main(String[] args) {
        int [] arr = {4,3,2,8,1};
        selection(arr,arr.length-1,0,0);
        System.out.println(Arrays.toString(arr));
    }

    private static void selection(int[] arr,int i , int j , int max) {
        if(i==0){
            return;
        }
        if(j<i+1){
            if(arr[max]<arr[j]){
                max = j;
            }
             selection(arr , i , j+1,max);
        }else{
            //swap
            int temp = arr[max];
            arr[max]=arr[i];
            arr[i]=temp;
            
            selection(arr,i-1,0,0);
        }


    }
}
