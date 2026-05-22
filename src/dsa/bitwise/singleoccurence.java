package dsa.bitwise;

public class singleoccurence {
    public static void main(String[] args) {
        int[] arr = {2,2,3,2,7,7,8,7,8,8};
//        if all occurs twice except one -> use XOR
//        here thrice so

        System.out.println(single(arr));
    }

    private static int single(int[] arr) {
        int result = 0;
        for (int i = 0; i < 32; i++)  {
            int sum = 0;
            for (int j = 0; j < arr.length; j++) {
                if (((arr[j] >> i) & 1) == 1) {
                    sum++;
                }
            }
                if(sum%3!=0){
                    result |= (1<<i);
                }



        }

        return result;
    }
}
