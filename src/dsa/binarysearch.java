package dsa;

public class binarysearch {



    public int binarySearch(int[] arr, int target) {
        if (arr == null || arr.length == 0) {
            return -1;
        }

        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        binarysearch bs = new binarysearch();
        int[] sortedArray = {2, 5, 8, 12, 16, 23, 38, 56, 72, 91};
        int targetValue1 = 23;
        int targetValue2 = 15;

        int result1 = bs.binarySearch(sortedArray, targetValue1);
        if (result1 != -1) {
            System.out.println("Target " + targetValue1 + " found at index: " + result1);
        } else {
            System.out.println("Target " + targetValue1 + " not found in the array.");
        }

        int result2 = bs.binarySearch(sortedArray, targetValue2);
        if (result2 != -1) {
            System.out.println("Target " + targetValue2 + " found at index: " + result2);
        } else {
            System.out.println("Target " + targetValue2 + " not found in the array.");
        }
    }
}
