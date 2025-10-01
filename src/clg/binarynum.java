package clg;

import java.util.Scanner;

// program to print binary equivalents of all numbers till inputted number
public class binarynum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();

        for (int i = 1; i <= num; i++) {
            int n = i;
            StringBuilder binary = new StringBuilder();

            if (n == 0) {
                binary.append(0);
            } else {
                while (n > 0) {
                    int remainder = n % 2;
                    binary.append(remainder);
                    n /= 2;
                }
            }


            System.out.println(i + " = " + binary.reverse());
        }
    }
}
