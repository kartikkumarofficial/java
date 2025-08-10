package others;

import java.util.Scanner;

public class MergeTwoSortedArrays {
    public static void main(String[] args) {
//        program to merge 2 sorted arrays taken from user
        int[] arr1 = new int[3];
        int[] arr2 = new int[3];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i<=arr1.length-1; i++){
            System.out.print("Enter "+ i +" of arr1 :" );
            arr1[i]=sc.nextInt();
        }
        for (int i = 0; i<=arr2.length-1; i++){
            System.out.print("Enter "+ i +" of arr2 :" );
            arr1[i]=sc.nextInt();
        }
        System.out.print ("Array1:");
        for (int i = 0; i<=arr1.length-1; i++){
            System.out.println(arr1[i]);
        }
        System.out.print ("Array2:");
        for (int i = 0; i<=arr2.length-1; i++){
            System.out.println(arr2[i]);
        }







    }
}
