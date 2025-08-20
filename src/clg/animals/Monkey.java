package clg.animals;

public class Monkey {
    String color;
    int weight;
    int age;

    public Monkey(String color, int weight, int age) {
        this.color = color;
        this.weight = weight;
        this.age = age;
    }

    public boolean isVegetarian() {
        return true;
    }

    public boolean canClimb() {
        return true;
    }

    public String getSound() {
        return "Chatter";
    }

    public void displayDetails() {
        System.out.println("Monkey -> Color: " + color + ", Weight: " + weight + "kg, Age: " + age + " years");
        System.out.println("Vegetarian: " + isVegetarian());
        System.out.println("Can Climb: " + canClimb());
        System.out.println("Sound: " + getSound());
        System.out.println("----------------------------------");
    }
}
