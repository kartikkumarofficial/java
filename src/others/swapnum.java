package others;

import java.util.Scanner;

public class swapnum {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = sc.nextInt();
        System.out.print("Enter b: ");
        int b = sc.nextInt();

        a = a+b;
        b=a-b;
        a=a-b;
        
        System.out.println("New value of a = "+ a);
        System.out.println("New value of b = "+  b);
    }
}
