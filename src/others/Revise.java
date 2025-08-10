package others;

public class Revise{
    public static class Calc {
        int add(int a , int b){
            return a+b;
        }
    }
    public static void main(String[] args) {
        Calc calc = new Calc();
        int sum = calc.add(5,6);
        System.out.println(sum );


    }
    public class Dawg{
        String name;
        int age;
        Dawg(String n , int a){
            name = n;
            age = a;
        }
    }

}

