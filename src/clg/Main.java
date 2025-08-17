package clg;

import java.util.*;
public class Main
{
    public static void main(String[] args) {

        Scanner xy = new Scanner(System.in);
        int a = xy.nextInt();
        int  b = xy.nextInt();


        Calculator c = new Calculator();
        c.multiply(a,b);

        c.add(a,b);
        c.sub(a,b);
    }
}


class Calculator{
    public void multiply(int a, int b) {
        System.out.println("Multiplication (int): " + (a * b));
    }
    public void multiply(double a, double b) {
        System.out.println("Multiplication (double): " + (a * b));
    }
    public void multiply(int a, int b, int c) {
        System.out.println("Multiplication (three ints): " + (a * b * c));
    }
    public void add(int a, int b) {
        System.out.println("Addition (int): " + (a + b));
    }

    public void sub(int a, int b) {
        System.out.println("Subtraction (int): " + (a - b));

    }
}