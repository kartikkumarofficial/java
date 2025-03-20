 class Calculator {
    int a;
    public int add(int a,int b){
        System.out.println("in add");
        int result = a+b;
        System.out.println(result);

           return 0;
    }

    
}
public class multiclass{
    public static void main(String a[]){
        int num1 = 4;
        int num2 = 5;
        Calculator calc =new Calculator();
    // classname reference_variable= new_keyword method();
        calc.add(num1,num2);
        



    }
}
