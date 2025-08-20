package dsa.array.BinarySearch;

public class FloorOfANum {
//    floor - smallest num that is greater or equal to target number

    public static int Floor(int nums[],int target){

        int start = 0;
        int end = nums.length;
        if (nums[start]==nums[end]&nums[end]==target){
            return nums[start];
        }
        boolean isAscending = nums[start]<nums[end];
        while(start<=end){
            int middle = start + (end-start)/2;

            if (nums[middle]==target){
                return middle;

            }

            if (isAscending){
                if(nums[middle]<target){
                    end=middle-1;
                }else if(nums[middle]>target) {
                    start = middle+1;
                }

            }



        }



        return end;
    }

    public static void main(String[] args) {
        int nums[] = {1,2,4,5,7,8,9};
        int target = 3;
//        Floor obj = new Floow();
        System.out.println(Floor(nums,target));
    }

}
