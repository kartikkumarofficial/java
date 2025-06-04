import java.util.*;
public class Sum {
    
    
    public static void main(String[] args) {
        int result = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number till which you want to print sum of :");
        int num = sc.nextInt();
        sc.close();


        for(int i = 1 ; i<=num ; i++ ){
            result+=i;
            

        

        }
        System.out.println(result);
    }
    
}
