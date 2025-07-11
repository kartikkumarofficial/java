package others;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number you wanna check is armstrong or not: ");
        int num = sc.nextInt();
        int original = num;
        int temp =0;
        int sum=0;
        while(num>0){
           int digit = num%10;
           sum+=Math.pow(digit,3);
           num/=10;

        }
        if(sum==original){
            System.out.println(original + " is an Armstrong number");
        }else{
            System.out.println("The given number is not armstrong");
        }

    }
}
