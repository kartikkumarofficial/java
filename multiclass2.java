class math {
    
        public int add( int  n1, int  n2){
            System.out.println("In add");
            int result = n1+n2;
            System.out.println(result);
            return 0;

        }
        
    
}

class multiclass2 {
    public static void main(String a[]){
        int num1=5;
        int num2=10;
        math calc = new math();
        calc.add(num1,num2);
        
    }
}