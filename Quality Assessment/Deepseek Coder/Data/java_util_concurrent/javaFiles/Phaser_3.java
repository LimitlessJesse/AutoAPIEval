import java.util.concurrent.Phaser;

public class Phaser_3 {
    public static void main(String[] args) {
        Phaser phaser = new Phaser(1); // Initialize a phaser with 1 party

        System.out.println("Unarrived parties: " + phaser.getUnarrivedParties());

        phaser.arriveAndDeregister(); // Arrive and deregister the party

        System.out.println("Unarrived parties: " + phaser.getUnarrivedParties());
    }
}
