package clg;

import java.util.Scanner;

public class Collab14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Options:\n" +
                "1->Compute eggs \n" + "2->Swap 2 numbers \n" + "3->Tax Calculator"
        );
        System.out.print("Enter choice :" );
        int choice = sc.nextInt();
        switch(choice){
            case 1:
                System.out.println("Classifying eggs in gross & dozens ");
                System.out.print("Enter the number of eggs you have: ");
                int eggs = sc.nextInt();
                int dozen , gross , left ;
                gross = eggs/144;
                dozen = (eggs%144)/12 ;
                left = eggs%12 ;
                System.out.println("Your number of eggs is "+ gross  + " gross, "+ dozen +" dozen and "+ left +" .");
                break;
            case 2:
                System.out.println("Swapping 2 numbers ");
                System.out.print("Enter a: ");
                int a = sc.nextInt();
                System.out.print("Enter b: ");
                int b = sc.nextInt();

                a = a+b;
                b=a-b;
                a=a-b;

                System.out.println("New value of a = "+ a);
                System.out.println("New value of b = "+  b);
                break;
            case 3:
                System.out.println("Tax Calculator");
                System.out.print("Enter income: ");
                double income = sc.nextDouble();
                System.out.print("Enter gender: ");
                String gender = sc.next();
                double tax = 0.0;

                System.out.println("Calculating tax for an income of: " + income + " for a " + gender);

                if (gender.equalsIgnoreCase("female")) {
                    System.out.println("Applying tax slabs for women.");

                    if (income <= 190000) {
                        tax = 0;
                    } else if (income <= 500000) {
                        tax = (income - 190000) * 0.10;
                    } else if (income <= 800000) {
                        double taxOnFirstSlab = (500000 - 190000) * 0.10;
                        double taxOnSecondSlab = (income - 500000) * 0.20;
                        tax = taxOnFirstSlab + taxOnSecondSlab;
                    } else {
                        double taxOnFirstSlab = (500000 - 190000) * 0.10;
                        double taxOnSecondSlab = (800000 - 500000) * 0.20;
                        double taxOnThirdSlab = (income - 800000) * 0.30;
                        tax = taxOnFirstSlab + taxOnSecondSlab + taxOnThirdSlab;
                    }

                } else {
                    System.out.println("Applying general tax slabs.");

                    if (income <= 180000) {
                        tax = 0;
                    } else if (income <= 500000) {
                        tax = (income - 180000) * 0.10;
                    } else if (income <= 800000) {
                        double taxOnFirstSlab = (500000 - 180000) * 0.10;
                        double taxOnSecondSlab = (income - 500000) * 0.20;
                        tax = taxOnFirstSlab + taxOnSecondSlab;
                    } else {
                        double taxOnFirstSlab = (500000 - 180000) * 0.10;
                        double taxOnSecondSlab = (800000 - 500000) * 0.20;
                        double taxOnThirdSlab = (income - 800000) * 0.30;
                        tax = taxOnFirstSlab + taxOnSecondSlab + taxOnThirdSlab;
                    }
                }

                System.out.println("Total tax to be paid: " + tax);
                break;
            default:
                System.out.println("Invalid input");

        }


    }
}
