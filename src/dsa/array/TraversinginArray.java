package dsa.array;

public class TraversinginArray {
    public static void main(String[] args) {
        int [][] arr = {
                {1,2,3,4},
                {1,2,3},
                {1},
                {1,2,3,4,5,6}
        };

        for(int i=0;i<=arr.length-1;i++){
            for(int j=0;j<=arr[i].length-1;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
