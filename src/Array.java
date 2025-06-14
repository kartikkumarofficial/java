import java.util.Arrays;

public class Array {
    public static void main(String[] args){
        int[] arr = new int[5];
        arr[0] = 1;

        int[] arr1 = {1, 5, 3, 2, 1, 66, 5};

        // Traversing arr
        System.out.println("Traversing arr:");
        for (int i : arr) {
            System.out.println(i);
        }

        // Before sorting
        System.out.println("Before sorting:");
        System.out.println(Arrays.toString(arr1));  // properly print array

        // Sorting
        Arrays.sort(arr1);

        // After sorting
        System.out.println("After sorting:");
        System.out.println(Arrays.toString(arr1));  // properly print array

        // Type of array
        System.out.println("Type of array arr1:");
        System.out.println(arr1.getClass().getName());  // prints the type

        // If you want to print "int[]" or "String[]" as a label manually:
        System.out.println("This is an int[] array.");
    }
}
