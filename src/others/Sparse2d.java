package others;
//to check whether the given matrix is sparse matrix is not
import java.util.Scanner;

public class Sparse2d {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int[][] arr = new int[2][5];
        int count =0;
        for (int i =0;i<=arr.length-1;i++){
            for (int j=0;j<=arr.length-1;j++){
            System.out.print("Enter "+ (i+1) + ":"+ (j+1) + "th element:");
            arr[i][j]=sc.nextInt();

            }

        }
        System.out.println("Current matrix is :");
        for (int i =0;i<=arr.length-1;i++){
            for (int j=0;j<=arr.length-1;j++){
                System.out.print(arr[i][j]+" ");
                if(arr[i][j]==0)count++;
            }
            System.out.println();
        }

        if(count>(arr.length*arr.length)/2) {
            System.out.println("The given matrix is a sparse matrix");
        }else{
            System.out.println("The given matrix is not a sparse matrix");
        }
    }
}

