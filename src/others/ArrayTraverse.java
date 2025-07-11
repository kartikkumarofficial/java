package others;

import java.util.Scanner;

public class ArrayTraverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements you want in ur array: ");
        int n = sc.nextInt();
        int[] arr= new int[n];
        System.out.println("Enter the elements of array : ");
        for(int i=0;i <arr.length;i++){
            System.out.print("Index "+ i + ":" );
            int num = sc.nextInt();
            arr[i]=num;
        }
        System.out.println("The array is: ");
        for(int i =0;i<=arr.length-1;i++){
            System.out.print(arr[i]+ " ");
        }


    }
}
