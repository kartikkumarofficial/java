package dsa.recursion;

public class count_zeroes {
    public static void main(String[] args) {
        System.out.println(countzeroes(502930));
    }

    private static int countzeroes(int n) {
        return _helper(n,0);
    }

    private static int _helper(int n, int c) {
        if (n==0){
            return c;
        }
        int rem = n%10;
        if(rem==0){
            return _helper(n/10,c+1);
        }
        return _helper(n/10 , c );

    }
}
