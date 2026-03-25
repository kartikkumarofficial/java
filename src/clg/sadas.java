package clg;

// Define a class
class Student {

    String name;
    int age;


    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class sadas {
    public static void main(String[] args) {

        Student s1 = new Student();


        s1.name = "Kartik";
        s1.age = 20;


        s1.displayInfo();
    }
}