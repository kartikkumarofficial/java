import java.util.*;
public class fibonacci {
    public static void main(String[] args) {
        //Program to print fibonacci sequence
        int i=1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. till which you want to see fibonacci seq:");
        int num = sc.nextInt();
        sc.close();
        int a = 0;
        int b = 1;
        int c = 0;
        while (i<=num){
            System.out.println(a);
            c = a;
            a = b;
            b = a+c;
            i++;
            
        }




    }
    
}
