import java.util.*;
public class TempSwitch {
    public static void main(String[] args) {
        double  f=0,c=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Menu List:");
        System.out.println("1) Enter temp in celsius");
        System.out.println("2) Enter temp in fahrenheit");
        int choice = sc.nextInt();
        double inputTemp = sc.nextDouble();
        switch (choice) {
            case 1:
            System.out.println("Temp in celsisus:"+ inputTemp);
            f= (int)((1.8*inputTemp)+32);
            System.out.println("Temp converted into fahrenheit="+f);
            break;

            case 2:
            System.out.println("Temp in fahrenheit:"+ inputTemp);
            c=(5.0/9.0)*(inputTemp-32);
            System.out.println("Temp converted into celsius="+c);
            break;

        }
    }
    
}
