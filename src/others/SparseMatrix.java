package others;
//to check whether the given matrix is sparse matrix is not
import java.util.Scanner;

public class SparseMatrix {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int[] arr = new int[5];
        int count =0;
        for (int i =0;i<=arr.length-1;i++){
            System.out.print("Enter "+ i+1 + "th element:");
            arr[i]=sc.nextInt();
        }
        System.out.print("Current matrix is :");
        for (int i =0;i<=arr.length-1;i++){
            System.out.print(arr[i]);
            if (arr[i]==0)count+=1;
        }

        if(count>=5 ) System.out.println("The given matrix is a sparse matrix");
    }
}

