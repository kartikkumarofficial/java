package dsa.recursion;

import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
//        0 , 1 , 1 , 2 , 3, 5 , 8 , 13
        Scanner sc = new Scanner(System.in);
        System.out.print("Element at nth index of  fibo series : ");
        int f= fibo(5);
        System.out.print(f);
    }
    static int fibo(int n){
            if(n<2){
                return n;
            }
            return fibo(n-1) + fibo(n-2);

    }
}
