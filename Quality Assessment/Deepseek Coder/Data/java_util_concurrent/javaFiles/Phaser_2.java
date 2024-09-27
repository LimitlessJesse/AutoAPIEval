import java.util.concurrent.Phaser;

public class Phaser_2 {
    public static void main(String[] args) {
        Phaser phaser = new Phaser(1); // Initialize a phaser with 1 party
        System.out.println("Initial number of registered parties: " + phaser.getRegisteredParties());

        phaser.register(); // Register another party
        System.out.println("Number of registered parties after registering another: " + phaser.getRegisteredParties());

        phaser.arriveAndDeregister(); // Arrive and deregister the current party
        System.out.println("Number of registered parties after deregistering: " + phaser.getRegisteredParties());
    }
}
