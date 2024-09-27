import java.util.concurrent.Phaser;

public class Phaser_4 {
    public static void main(String[] args) {
        Phaser phaser = new Phaser(1); // Initialize a phaser with 1 participant

        // Register a new participant
        int phase = phaser.register();

        System.out.println("Phase: " + phase);
        System.out.println("Is terminated: " + phaser.isTerminated());

        // Arrive and await advance
        phaser.arriveAndAwaitAdvance();

        System.out.println("Is terminated: " + phaser.isTerminated());
    }
}
