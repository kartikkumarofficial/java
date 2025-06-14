public class LargestValueinArray {
    public static void main(String[] args) {
        int[] arr = {1,2,51,11,-1,91};
        int lowest_val = Integer.MIN_VALUE;
        for(int i : arr){
            if(i>lowest_val){
                lowest_val=i;
                System.out.println("value reassigned of lowest_val to "+ lowest_val);
            }
        }
        System.out.println("Lowest value in array is:"+ lowest_val);

            }
}
