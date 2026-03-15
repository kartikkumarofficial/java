package Revision;

public class Dog  implements revise_interface {
    @Override
    public void make_sound() {
        System.out.println("woof");
    }

    public static void main(String[] args) {
        Dog dog = new Dog();
//        System.out.println(dog);
    dog.make_sound();
        System.out.println(dog.name);
    }
}

