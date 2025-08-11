package dsa.array;

public class LinearSearch2dArray {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3,4},
                {5,6,7},
                {8,9}
        };
        int target = 5;
        search2d(arr,target);


    }
    public static void search2d(int[][] arr , int target ){
        for (int i = 0; i < arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if (arr[i][j]==target) System.out.println("target found at "+ (i+1) +" row & " + (j+1)+  " column");
            }
        }
    }
}
