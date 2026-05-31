package dsa.recursion.arrays;

public class sorted{
    public static void main(String[] args) {
//        System.out.println(sortedd());
        int[] arr = {1,2,3,4};
        System.out.println(sortedd(arr,0));
    }

    private static boolean sortedd(int[] arr , int index) {
        if(index==arr.length-1){
            return true;
        }
        return arr[index]<arr[index+1] && sortedd(arr,index+1);
    }

}