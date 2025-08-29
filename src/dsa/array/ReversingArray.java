package dsa.array;

public class ReversingArray {
//    public static void reverse(int[] arr){
//        int start = 0;
//       int end = arr.length-1;
////       int temp = 0;
//       while(start<end){
//           int temp = arr[start];
//           arr[start] = arr[end];
//           arr[end] = temp;
//           start++;
//           end--;
//       }
//    }
public static void reverse(int[] arr) {
    for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
        arr[i]+=arr[j];
        arr[j]=arr[i]-arr[j];
        arr[i]=arr[i]-arr[j];

    }
}

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        reverse(arr);
        for (int i = 0; i<=arr.length-1;i++){
            System.out.print(arr[i]+ " ");
        }


    }
}
