package clg;


class Restaurant {
    public void prepareFood(String item) {
        System.out.println("Preparing " + item);
    }
}

class Payment {
    public void makePayment(int amount) {
        System.out.println("Payment of ₹" + amount + " successful");
    }
}

class Delivery {
    public void assignDelivery(String address) {
        System.out.println("Delivery assigned to " + address);
    }
}


class FoodOrderFacade {
    private Restaurant restaurant;
    private Payment payment;
    private Delivery delivery;

    public FoodOrderFacade() {
        restaurant = new Restaurant();
        payment = new Payment();
        delivery = new Delivery();
    }

    // Simple method that hides all complexity
    public void placeOrder(String item, int amount, String address) {
        System.out.println("\n--- Placing Order ---");
        restaurant.prepareFood(item);
        payment.makePayment(amount);
        delivery.assignDelivery(address);
        System.out.println("Order placed successfully!\n");
    }
}


public class facade {
    public static void main(String[] args) {
        FoodOrderFacade orderFacade = new FoodOrderFacade();

        // Client interacts ONLY with facade
        orderFacade.placeOrder("Pizza", 500, "Dehradun");
        orderFacade.placeOrder("Burger", 200, "Delhi");
    }
}