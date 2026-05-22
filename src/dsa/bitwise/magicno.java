package dsa.bitwise;

public class magicno{
    public static void main(String[] args) {
        int n =2 ;
        System.out.println(n + " magic no. is:"+ magic(n));
    }

    private static int magic(int n) {
        int sum = 0;
        int i = 0;
        while(n>0){
            i++;
            if((n&1)==1){
                sum+=(int) Math.pow(5,i);
            }
            n=n>>1;
        }
        return sum ;
    }


//    private static int magic(int n) {
//        int sum = 0;
//        int i = 0;
//        while(n>0){
//            i++;
//            int last = n & 1;
//            if (last ==1){
//                sum+= (int) Math.pow(5,i);
//            }
//            n = n>>1;
//        }
//        return sum ;
//    }





















}