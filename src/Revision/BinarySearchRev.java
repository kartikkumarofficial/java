package Revision;
//will tell the index of the targetted element
public class BinarySearchRev {
    public int BinarySearch(int nums[],int target){
        int start =0;
        int end = nums.length-1;

        while(start<=end){
            int middle = start + (end - start)/2;

            if(nums[middle]==target){
                return middle;
            }else if (target>nums[middle]){
                start=middle+1;
            }else if (target<nums[middle]){
                end=middle-1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,2,3,4,5,6,7,8,9};
        int target = 5;
        BinarySearchRev obj = new BinarySearchRev();
        System.out.println(obj.BinarySearch(nums,target));


    }
}
