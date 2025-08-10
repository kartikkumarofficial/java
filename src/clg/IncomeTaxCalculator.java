package clg;

import java.util.Scanner;

public class IncomeTaxCalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
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
    }
}
