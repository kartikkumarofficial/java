package dsa.conditionals;

public class reversingnum {
    public static void main(String[] args) {
        int num = 1755555;
        int newNum = 0;
        while (num>0){
            int rem = num%10;
            newNum = newNum * 10 + rem;
            num/=10;

        }
        System.out.println(newNum);
    }
}
