package dsa.bitwise;

public class fastpower {
    public static void main(String[] args) {
        System.out.println(powerr(2,5));
    }
    public static int powerr(int base , int power){
        int n = 1;
        int b = base;
        while(power>0){
            if((power&1)==1){
                n*= b;
            }
            power=power>>1;
            b*=b;
        }
        return n;
    }
}
