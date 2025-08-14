package clg;
//i love coding
//coding love i
public class ilovecoding {
    public static void main(String[] args) {
        String string = "i love coding";
        System.out.println("original = "+ string);
        String[] words = string.split(" ");
        StringBuilder reversed = new StringBuilder();
        for (int i = words.length-1;i>=0;i--){
            reversed.append(words[i]);
            if ( i !=0){
                reversed.append(" ");
            }

        }
        System.out.println("Reversed: "+  reversed.toString());
    }
}
