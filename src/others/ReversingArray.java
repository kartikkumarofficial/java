package others;

public class ReversingArray {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = new int[arr1.length];

        System.out.println("Old Array");
        for (int i : arr1) {
            System.out.print(i+ " ");
        }

        for(int i = 0; i<=arr2.length-1 ; i++){
            arr2[i] = arr1[arr1.length-1-i];

        }
        System.out.println("New Array");

        for (int i : arr2) {
            System.out.print(i+ " ");
        }


    }
}
