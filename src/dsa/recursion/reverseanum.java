package dsa.recursion;

public class reverseanum {
    public static void main(String[] args) {
        reversenum1(8123);
        System.out.println(sum);
    }
    static int sum = 0;

    private static void reversenum1(int n){
        if(n==0){
            return ;
        }
        sum=(sum*10)+(n%10);
        reversenum1(n/10);

    }
}
