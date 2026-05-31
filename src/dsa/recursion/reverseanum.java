package dsa.recursion;

public class reverseanum {
    public static void main(String[] args) {
        reversenum1(8123);
        System.out.println(sum);
        System.out.println(reversenum2(5322));
    }

    static int sum = 0;

    private static void reversenum1(int n) {
        if (n == 0) {
            return;
        }
        sum = (sum * 10) + (n % 10);
        reversenum1(n / 10);

    }

    //    using helper function
    public static int reversenum2(int n) {
        int digits = (int) Math.log10(n) + 1;
        return helper(n, digits);

    }

    private static int helper(int n, int digits) {
        if (n % 10 == n) {
            return n;
        }
        int rem = n%10;
        return rem* (int)(Math.pow(10,digits-1)) +helper(n/10,digits-1);
    }
}
