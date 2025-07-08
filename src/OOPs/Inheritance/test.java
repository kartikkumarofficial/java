package OOPs.Inheritance;

public class test {


    public static void main(String[] args) {
        Dog dog =new Dog();
        Cat cat = new Cat();
        dog.makeSound();
        System.out.println(dog.name);
        cat.makeSound();
        System.out.println(cat.name );
    }
}
