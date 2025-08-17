package dsa.array;

public class OrderAgnosticBinarySearch {
    public static int BinarySearch(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        // handle array with all equal elements
        if (nums[start] == nums[end]) {
            if (nums[start] == target) return start;
            return -1;
        }

        boolean isAscending = nums[start] < nums[end]; // order detection

        while (start <= end) {
            int middle = start + (end - start) / 2;

            if (nums[middle] == target) {
                return middle;
            }

            if (isAscending) { // ascending case
                if (target < nums[middle]) {
                    end = middle - 1;
                } else {
                    start = middle + 1;
                }
            } else { // descending case
                if (target > nums[middle]) {
                    end = middle - 1;
                } else {
                    start = middle + 1;
                }
            }
        }
        return -1; // not found
    }

    public static void main(String[] args) {
        int[] nums1 = {7, 6, 3, 2, 1}; // descending
        int target1 = 3;
        System.out.println(BinarySearch(nums1, target1)); // 2

        int[] nums2 = {1, 2, 3, 4, 5}; // ascending
        int target2 = 4;
        System.out.println(BinarySearch(nums2, target2)); // 3

        int[] nums3 = {2, 2, 2, 2}; // all equal
        int target3 = 2;
        System.out.println(BinarySearch(nums3, target3)); // 0
    }
}
