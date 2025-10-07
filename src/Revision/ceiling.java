package Revision;

//ceiling - find the smallest number in this array that is greater than or equal to target number
public class ceiling {
    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,16,18};
        int target = 15;
        ceilingg(arr,target);

    }

    public static void ceilingg(int[] nums , int target){
        int start =0;
        int end = nums.length-1;

        if(target> nums[end]) System.out.println("out of bounds");;
        while(start<=end){
            int middle = start + (end - start)/2;
            if (target==nums[middle]) System.out.println(middle);

            if(target<nums[middle]) {
                end = middle -1;
            }else if (target>nums[middle]){
                start = middle+1;
            }

        }
        System.out.println("Number: " + nums[start] +" at index: "+ start );
//        return nums[start];

    }
}
