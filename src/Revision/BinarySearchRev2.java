package Revision;

public class BinarySearchRev2 {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int target =2;
        System.out.println(binarySearch(arr,target));
    }
    public static int binarySearch(int[] nums,int target){
        int start = 0;
        int end = nums.length-1;
        boolean isAsc = nums[start]<nums[end]; //making it order agnostic

            while(start<=end){
                int middle = start + (end-start)/2 ;
                if(target==nums[middle])
                    return middle;

                if(isAsc){
                    if(target>nums[middle]) start = middle+1;
                    if(target<nums[middle]) end = middle-1;
                }else {
                    if(target>nums[middle]) end = middle-1;
                    if(target<nums[middle]) start = middle+1;
                }
            }

        return -1; // if not found
    }
}
//order of series!? condition
//middle
//if small - lower than middle
//if big - higher than middle