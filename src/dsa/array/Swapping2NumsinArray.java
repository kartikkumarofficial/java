package dsa.array;

import java.util.Scanner;

public class Swapping2NumsinArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter indexes of elements you wanna swap:");
        System.out.print("Index1:" );
        int index1 = sc.nextInt();
        System.out.print("Index2:" );
        int index2 = sc.nextInt();
        swap(arr,index1,index2);
        for(int i =0 ; i<arr.length;i++){
            System.out.println(arr[i] + " ");
        }
    }
    static void swap(int[] arr, int index1, int index2){
        arr[index1]=arr[index1]+arr[index2];
        arr[index2]=arr[index1]-arr[index2];
        arr[index1]=arr[index1]-arr[index2];
    }
}
