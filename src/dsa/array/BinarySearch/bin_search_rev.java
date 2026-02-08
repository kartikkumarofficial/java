package dsa.array.BinarySearch;

public class bin_search_rev {
    public static int binarySearch(int[] arr,int num){
        int low = 0;
        int high = arr.length-1;

        if(arr[low]<=arr[high]){
        int mid = low + (high-low)/2;
            //ascending
            while(low<=high){
                if(num==arr[mid]){
                    return mid;
                }else if(num<arr[mid]){
                    high=mid-1;

                }else{
                    low=mid+1;
                }

            }


        }
        return -1;



    }

    public static void main(String[] args) {
        int[] arr = {1,3,5,6,10};
        System.out.println( binarySearch(arr,6));
    }
}
