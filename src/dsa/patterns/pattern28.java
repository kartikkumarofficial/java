package dsa.patterns;
//diamond
public class pattern28 {
    public static void main(String[] args) {
        int n =5;
        for (int row = 1; row <= 2*n-1; row++) {
            if(row<=n){
            for (int col = 1; col <= n-row; col++) {
                System.out.print(" ");

            }
            for (int col2 = 1; col2 <= row; col2++) {
                System.out.print("* ");


            }
                System.out.println(" ");
            }
            else if (row>n){

                        for (int col = 1; col <= row-n; col++) {
                            System.out.print(" ");

                        }
                        for (int col2 = 1; col2 <= (2*n-row); col2++) {
                            System.out.print("* ");

                        }


                    System.out.println();

                }
            }
    }
}
