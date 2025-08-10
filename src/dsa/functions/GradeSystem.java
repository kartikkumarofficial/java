//Write a program that will ask the user to enter his/her marks (out of 100). Define a method that will display grades according to the marks entered
package dsa.functions;

import java.util.Scanner;

public class GradeSystem {
    public static String grade(int num){
        if(num<=100 & num >= 91){
            System.out.println("AA");
        }else  if(num<=90 & num >= 81){
            System.out.println("AB");
        }else  if(num<=80 & num >= 71){
            System.out.println("BB");
        }else if(num<=70){
            System.out.println("Fail");
        }
        return "";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks: ");
        System.out.print("Maths: ");
        int maths = sc.nextInt();


        System.out.print("Grade is : "+ grade(maths));
    }



}


