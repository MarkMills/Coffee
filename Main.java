package Coffee;
public class Main {
    public static void main(String[] args) {
        CoffeeDispenser cup1 = new CoffeeDispenser();
        cup1.dispense(400);
        System.out.println("Remaining ounces:" + cup1.returnOuncesRemaining());
        cup1.refillDispenser();
        System.out.println("Remaining ounces:" + cup1.returnOuncesRemaining());
    }
}