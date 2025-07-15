package dsa.conditionals;

import java.util.Scanner;

public class countingoccurences {
    // counting the number of 4 in the number given by user
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number:");
        int n = sc.nextInt();
        int count =0;
        while(n>0){
            int rem = n%10;
            if (rem==3)  count++;
            n/=10;
        }
        System.out.println("Number of 3 are :" + count);
    }
}
