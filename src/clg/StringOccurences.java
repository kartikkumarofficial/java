package clg;
//aaabbc
//a3b2c1

public class StringOccurences {
    public static void main(String[] args) {
        int count =0;
        String string = "aaabbc";
        for (int i =0 ; i<string.length();i++){

            try{
                if((i+1)==i){
                    count+=1;


                }
            }catch(ArrayIndexOutOfBoundsException e){}
        }


    }
}
