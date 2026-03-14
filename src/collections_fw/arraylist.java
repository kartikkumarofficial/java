package collections_fw;
import java.util.*;
public class arraylist {
    public static void main(String[] args) {
        int[] arr = new int[5];
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);

        System.out.println(list.get(1) );
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }
    }
}

