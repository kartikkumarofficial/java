package dsa.array;
//start>end==descending
//end>start==ascending
public class OrderAgnosticBinarySearch {
    public static int BinarySearch(int[] nums, int target){
        int start = 0;
        int end =nums.length-1;

        if (nums[start]>nums[end]){//descending
            while (start<=end){
                int middle = start + (end-start)/2;

                if(target==nums[middle]){
                    return middle;
                } else if (target>nums[middle]) {
                    end=middle-1;

                }else if (target<nums[middle]){
                    start=middle+1;
                }
            }
        }else if (nums[start]<nums[end]){
            while (start<=end){
                int middle = start + (end-start)/2;

                if(target==nums[middle]){
                    return middle;
                } else if (target>nums[middle]) {
                    start=middle+1;

                }else if (target<nums[middle]){
                    end=middle-1;
                }
            }
        }
        return -1;


    }

    public static void main(String[] args) {
        int[] nums = {7,6,3,2,1};
        int target = 3;
        System.out.println(BinarySearch(nums,target));

    }
}
