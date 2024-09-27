import java.util.concurrent.Phaser;

public class Phaser_12 {
    public static void main(String[] args) {
        Phaser phaser = new Phaser(1); // Initialize a phaser with 1 participant

        // Register a new participant and print its phase
        int phase = phaser.register();
        System.out.println("Phase: " + phase);

        // Force termination of the phaser
        phaser.forceTermination();

        // Check if the phaser is terminated
        boolean isTerminated = phaser.isTerminated();
        System.out.println("Is terminated: " + isTerminated);
    }
}
