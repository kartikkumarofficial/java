package dsa.array.BinarySearch;

public class CeilingOfANumber {
//    cieling number = smallest element in array , greater or equal to the target element
//    in= [1,2,3,4,5,7,8,9];target = 6;
//    out = [7];

    public static int Ceiling(int[] nums, int target){
        int start = 0;
        int end = nums.length-1;
        boolean isAsc = nums[start]<nums[end];

        while(start<=end){
            int mid = start + (end-start)/2;

            if(isAsc){
                if(target==nums[mid]){
                    return nums[mid];
                }else if (target <nums[mid]){
                    end=mid-1;
                }else if (target>nums[mid]){
                    start=mid+1;
                }
            }
        }
        if(start==nums.length)return -1;
        return nums[start];

    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,7,8,9};
        int target = 6;
        System.out.println(Ceiling(nums,target));
    }

}
