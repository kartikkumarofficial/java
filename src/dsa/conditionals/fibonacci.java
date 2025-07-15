package dsa.conditionals;

import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        System.out.print("Enter the amount of number you want in your fibonacci series: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int n1 = 0;
        int n2=1;

        for (int i=1;i<=num;i++){
            System.out.println(n1);
            int temp = n1+n2;
            n1=n2;
            n2=temp;



        }    }
}
