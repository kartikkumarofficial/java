package dsa.patterns;

public class pattern5 {
    public static void main(String[] args) {
        int n = 5;
        for (int row = 1; row <= (2*n-1); row++) {
            if(row<=n){
                for (int col = 1; col <= row; col++) {
                    System.out.print("* ");
                }
                }else if (row>n){
                    for (int col = (2*n)-row; col>=1; col--) {
                        System.out.print("* ");



                }
            }
            System.out.println(" ");
        }


    }
}


