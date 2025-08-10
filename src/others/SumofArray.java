package others;

public class SumofArray {
    public static void main(String[] args) {
        //program to get sum of all elements of array
        int[] arr = {1,2,3,4,5,6};
        int sum = 0;
        for(int i=0;i<=arr.length-1;i++){
            sum+=arr[i];
        }
        System.out.println("sum of all elements of array is "+ sum);
    }
}
