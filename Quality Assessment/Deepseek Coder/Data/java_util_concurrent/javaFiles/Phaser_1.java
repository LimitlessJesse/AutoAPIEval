import java.util.concurrent.Phaser;

public class Phaser_1 {
    public static void main(String[] args) {
        Phaser phaser = new Phaser(1); // Initialize a phaser with 1 participant

        System.out.println("Phase: " + phaser.getPhase()); // Prints 0

        phaser.arriveAndAwaitAdvance(); // Participant arrives and waits for next phase

        System.out.println("Phase: " + phaser.getPhase()); // Prints 1
    }
}
