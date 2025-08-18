package dsa.array.BinarySearch;

public class BinarySearch {
    public static int binSearch(int[] nums,int target){
//        sort the array
        int start = 0;
        int end = nums.length-1;

        while(start<=end){
            //find the middle element
//            int mid = (start+end)/2; //since integers in java have limited value and if end exceeds that the code might break here so better way to do that is below
            int mid = start + (end-start)/2;

            if(target<nums[mid]){
                end=mid-1;
            }else if (target> nums[mid]){
                start=mid + 1;
            }else{
                return mid;
            }
        }


        return -1; //will only execute if value not found
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int ans = binSearch(arr,6);
        System.out.println(ans);
//        binary search

    }
}
