package dsa.patterns;
//
//public class pattern5 {
//    public static void main(String[] args) {
//        int n = 5;
//        for (int row = 1; row <= (2*n-1); row++) {
//            if(row<=n){
//                for (int col = 1; col <= row; col++) {
//                    System.out.print("* ");
//                }
//                }else if (row>n){
//                    for (int col = (2*n)-row; col>=1; col--) {
//                        System.out.print("* ");
//
//
//
//                }
//            }
//            System.out.println(" ");
//        }
//
//
//    }
//}


//stream builder way to achieve this

public class pattern5 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        int n = 5;
        for (int row = 1; row <= (2 * n - 1); row++) {
            if(row<=n)sb.append("* ");
            else sb.delete(sb.length()-2,sb.length());

            System.out.println(sb);
        }
    }
}