package Coffee;
public class CoffeeDispenser {
    private int ouncesRemaining = 128;
    private int ouncesUsed;
    public void dispense(int ouncesUsed) {
        this.ouncesUsed = ouncesUsed;
        if (this.ouncesUsed > this.ouncesRemaining) {
            System.out.println("No coffee dispensed. Invalid amount.");
        } else {
            this.ouncesRemaining -= this.ouncesUsed;
            System.out.println(this.ouncesUsed+" oz have been poured.");
        }
    }
    public void refillDispenser() {
        this.ouncesRemaining = 128;
        System.out.println("Dispenser has been refilled.");
    }
    public int returnOuncesRemaining() {
        return this.ouncesRemaining;
    }
}
