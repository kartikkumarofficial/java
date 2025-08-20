package clg.zoo;

import clg.animals.Lion;
import clg.animals.Monkey;
import clg.animals.Elephant;

public class VandalurZoo {
    public static void main(String[] args) {
        Lion lion = new Lion("Golden", 190, 8);
        Monkey monkey = new Monkey("Brown", 35, 5);
        Elephant elephant = new Elephant("Grey", 5000, 25);

        System.out.println("===== Vandalur Zoo Animals =====");
        lion.displayDetails();
        monkey.displayDetails();
        elephant.displayDetails();
    }
}
