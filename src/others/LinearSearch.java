package others;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1,2,4422,55,22,1,22,3,4};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the element you wanna search in the array : ");
        int search = sc.nextInt();

        for (int i:arr){
            if(search ==i){
                System.out.println("Element found");
            }

        }    }
}
