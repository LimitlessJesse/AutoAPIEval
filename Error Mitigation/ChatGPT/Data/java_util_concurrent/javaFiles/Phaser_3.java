import java.util.concurrent.Phaser;

public class Phaser_3 {
    public static void main(String[] args) {
        Phaser phaser = new Phaser();
        int phaseNumber = phaser.arriveAndDeregister();
        System.out.println("Arrival phase number: " + phaseNumber);
    }
}
