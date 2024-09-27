import java.util.concurrent.Phaser;

public class Phaser_4 {
    public static void main(String[] args) {
        Phaser phaser = new Phaser();
        
        // Registering parties
        phaser.register();
        phaser.register();
        
        // Arrive at this phaser and await others
        int phaseNumber = phaser.arriveAndAwaitAdvance();
        
        System.out.println("Arrived at phase: " + phaseNumber);
    }
}
