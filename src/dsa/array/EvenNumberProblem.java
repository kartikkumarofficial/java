package dsa.array;

public class EvenNumberProblem {
    public int findNumbers(int[] num) {

            int[] nums = {12, 345, 2, 6, 7896};
            int even = 0;
            for (int i = 0; i < nums.length; i++) {
                int temp = nums[i];
                int count = 0;
                while (temp > 0) {
                    count += 1;
                    temp = temp / 10;
                }
                if (count % 2 == 0) {
                    even += 1;
                }
            }
            return even;
        }

    public static void main(String[] args) {
        EvenNumberProblem obj = new EvenNumberProblem();
        int[] nums = {12, 345, 2, 6, 7896};
        System.out.println(obj.findNumbers(nums));

    }


}