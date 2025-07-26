package others;
public class Factorial {
    static int factorial(int num){
        if (num ==0 || num ==1){
            System.out.println(1);
        }else{
            num*=  factorial(num-1);

        }
    return num;
    }
    public static void main(String[] args) {
        System.out.println(factorial(5));

//        while(i<=num){
//            factorial*=i;
//            i++;



    }
    
}
