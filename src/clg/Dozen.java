package clg;

import java.util.Scanner;

public class Dozen {
    public class animal{

    }


    public static void main(String[] args) {
        //Program to check how many dozens of eggs is that

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of eggs you have: ");
        int eggs = sc.nextInt();
        int dozen , gross , left ;
        gross = eggs/144;
        dozen = (eggs%144)/12 ;
        left = eggs%12 ;
        System.out.println("Your number of eggs is "+ gross  + " gross, "+ dozen +" dozen and "+ left +" .");


    }
}
