package dsa.bitwise;

public class ithbitofanumber {
    public static void main(String[] args) {
        int n = 182;
        System.out.println(bitnoith(n,5));
        System.out.println(bitnoith(n,6));
        System.out.println(bitnoith(n,7));
    }

    private static int bitnoith(int n,int ith) {
//        bitmasking
        int andnum = 0;
        int mask = 1<< (ith-1);
        return (n & mask) ==0?0:1 ;
    }
}
