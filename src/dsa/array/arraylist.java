package dsa.array;

import java.util.ArrayList;

public class arraylist {
    public static void main(String[] args) {
//        ArrayList<Integer> arrayList = new ArrayList<>(10);
//        arrayList.add(5);
//        arrayList.add(5);
//        arrayList.add(5);
//        arrayList.add(5);
//        System.out.println(arrayList);
//        System.out.println( arrayList.get(2));
        ArrayList arrayList = new ArrayList(10);
        arrayList.add(5);
        arrayList.add(5);
        arrayList.add("Hello");
        for (int i = 0 ; i<arrayList.toArray().length;i++){
            System.out.print(arrayList.get(i)+ " ");
        }
        System.out.println();
        System.out.println(arrayList); //prints the values in the form of a list

    }
}
