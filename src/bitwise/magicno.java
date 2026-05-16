package bitwise;

public class magicno{
    public static void main(String[] args) {
        int n =1 ;
        System.out.println(n + "th magic no. is:"+ magic(n));
    }

    private static int magic(int n) {
        int sum = 0;
        int i = 0;
        while(n>0){
            i++;
            int last = n & 1;
            if (last ==1){
                sum+= (int) Math.pow(5,i);
            }
            n = n>>1;
        }
        return sum ;
    }
}