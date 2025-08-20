package clg.animals;

public class Elephant {
    String color;
    int weight;
    int age;

    public Elephant(String color, int weight, int age) {
        this.color = color;
        this.weight = weight;
        this.age = age;
    }

    public boolean isVegetarian() {
        return true;
    }

    public boolean canClimb() {
        return false;
    }

    public String getSound() {
        return "Trumpet";
    }

    public void displayDetails() {
        System.out.println("Elephant -> Color: " + color + ", Weight: " + weight + "kg, Age: " + age + " years");
        System.out.println("Vegetarian: " + isVegetarian());
        System.out.println("Can Climb: " + canClimb());
        System.out.println("Sound: " + getSound());
        System.out.println("----------------------------------");
    }
}
