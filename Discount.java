import java.util.*;
public class Discount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the device you brought:");
        char devchoice = sc.next().charAt(0);
        System.out.println("Enter purchase amount");
        double purchaseAmount = sc.nextDouble();
        double dis = 0; 
        System.out.println("Menu List:");
        System.out.println("1) If value is less than 25k");
        System.out.println("1) If value is b/w 25k and 50k"); 
        System.out.println("1) If value is b/w 50k and 100k");
        System.out.println("1) If value is more than 100k");
        int choice = sc.nextInt();
        
        if(devchoice == 'L'){
            switch(choice){
                case 1:
                     dis=0.0;
                break;
                

                case 2:
                double dis2 = 5.0 ;
                System.out.println("Discount provided = " + dis2);
                double finalvalue2= purchaseAmount + purchaseAmount*dis2;
                System.out.println("Final value = "+ finalvalue2);
                break;

                case 3 :
                double dis3 = 5.0 ;
                System.out.println("Discount provided = " + dis3);
                double finalvalue3= purchaseAmount + purchaseAmount*dis3;
                System.out.println("Final value = "+ finalvalue3);
                break;

                case 4:
                double dis4 = 5.0 ;
                System.out.println("Discount provided = " + dis4);
                double finalvalue4= purchaseAmount + purchaseAmount*dis4;
                System.out.println("Final value = "+ finalvalue4);
                break;


            }


        }
        else if (devchoice =='D'){

        }
        else{
            

        

    }
}}
