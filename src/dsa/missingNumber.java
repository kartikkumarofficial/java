package dsa;

public class missingNumber {
    public static int missingNumber(int[] nums){
        int n =nums.length;
        int indexSum = n*(n+1)/2;
        int valSum=0;
        for(int i =0;i<n;i++){
            valSum+=nums[i];
        }
        return indexSum-valSum;
    }
}
