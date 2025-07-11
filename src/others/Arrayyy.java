package others;

import java.util.Scanner;


public class Arrayyy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of elements u want in an array:");
        //take arr from user and find avg , max , min
//        int n = sc.nextInt();
//        int[] arr = new int[n];
//        System.out.println("Enter "+n+" elements");
//        for(int i = 0; i<arr.length; i++){
//            System.out.print("Enter "+ i + "th value in array: ");
//            arr[i]= sc.nextInt();
//
//        }
//        int min = arr[0];
//        int max = arr[0];
//        int sum = 0;
//
//        for(int i=0 ;i<arr.length;i++){
//            if(arr[i]<min) min=arr[i];
//            if(arr[i]>max) max=arr[i];
//            sum+=arr[i];
//
//        }
//        double avg = (double) sum/n;
//
//        System.out.println("min = "+ min);
//        System.out.println("max = "+ max);
//        System.out.println("avg = "+ avg);

        int[] arr = {1,2,3,4,5,55};
        for (int i =arr.length-1; i>=0;i--){
            System.out.println(arr[i]);
        }




    }
}
