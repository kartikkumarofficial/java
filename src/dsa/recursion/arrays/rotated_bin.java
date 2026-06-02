package dsa.recursion.arrays;

public class rotated_bin {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,8,9,1,2,3}; //left sorted
        int[] arr2 ={7,8,9,1,2,3,4,5,6}; //right sorted
        System.out.println(rotated_binary_search(arr,5,0,arr.length-1));
        System.out.println(rotated_binary_search(arr2,5,0,arr.length-1));
    }

    private static int rotated_binary_search(int[] arr,int t,int s,int e) {
//        base case
        if (s>e){
            return -1;
        }
        int mid = s+ (e-s)/2;
        if(arr[mid]==t){
            return mid;
        }
        //left hand sorted
        if(arr[s]<=arr[mid]){
            if (t<arr[mid] && t>=arr[s]){
                return rotated_binary_search(arr,t,s,mid-1);
            }else {
                return rotated_binary_search(arr,t,mid+1,e);
            }
            //right hand sorted
        }else{
            //mid <end
            if (t>arr[mid] && t <= arr[e]){
                return rotated_binary_search(arr , t , mid+1,e);
            }else{
                return rotated_binary_search(arr , t ,s,mid-1);
            }
        }

    }
}
