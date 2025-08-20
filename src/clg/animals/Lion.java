package clg.animals;

public class Lion {
    String color;
    int weight;
    int age;

    public Lion(String color, int weight, int age) {
        this.color = color;
        this.weight = weight;
        this.age = age;
    }

    public boolean isVegetarian() {
        return false;
    }

    public boolean canClimb() {
        return false;
    }

    public String getSound() {
        return "Roar";
    }

    public void displayDetails() {
        System.out.println("Lion -> Color: " + color + ", Weight: " + weight + "kg, Age: " + age + " years");
        System.out.println("Vegetarian: " + isVegetarian());
        System.out.println("Can Climb: " + canClimb());
        System.out.println("Sound: " + getSound());
        System.out.println("----------------------------------");
    }
}
