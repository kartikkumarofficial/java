import java.util.*;
public class CarDiscount {
    public static void main(String args[]){
        double r = 0.0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter showroom price:");
        int showroomPrice = sc.nextInt();
        System.out.print("Enter number of years used:");
        int yearsUsed = sc.nextInt();
        sc.close();
        switch(yearsUsed){
            case 1:
            r = 0.1;
            System.out.println("Rate of depreciation ="+r );
            break;

            case 2:
            r = 0.2;
            System.out.println("Rate of depreciation ="+r );
            break;

            case 3:
            r = 0.3;
            System.out.println("Rate of depreciation ="+r );
            break;

            case 4:
            r = 0.5;
            System.out.println("Rate of depreciation ="+r );
            break;

            default:
            r = 0.6;
            System.out.println("Rate of depreciation ="+r );
            break;

        }

        System.out.println("Depreciated Value = " + (showroomPrice - (showroomPrice*r) ));

    }
}