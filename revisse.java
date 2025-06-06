class calculator{
    public int add(int a , int b){
        int result = a+b;
        System.out.println(result);
        return 0;
    }

}
public class revisse{
    public static void main(String[] args) {
        int num1 =4;
        int num2 = 6;
        calculator calc = new calculator();
        calc.add(num1, num2);
    }
}