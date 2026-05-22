package dsa.bitwise;

import static java.lang.Math.log;

public class noofdigits {
    public static void main(String[] args) {
        int n = 4;
        int base = 2;
        System.out.println(noofdigs(n,base));
    }

    private static int noofdigs(int n , int base) {
        int num = (int) (log(n)/log(base)) +1;

        return num;
    }

}
