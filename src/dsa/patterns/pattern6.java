package dsa.patterns;

public class pattern6 {
    public static void main(String[] args) {
        int n =5;

        for (int row = 1; row <= n; row++) {
            for (int col = 1;col<=n-row; col++) {
                System.out.print(" ");
                

            }
            for (int i = 1; i <=row ; i++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
//approach could be advanced for loop!?