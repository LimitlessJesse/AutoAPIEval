import java.util.concurrent.Phaser;

public class Phaser_1 {
    public static void main(String[] args) {
        Phaser phaser = new Phaser();
        int phaseNumber = phaser.register();
        System.out.println("Arrival phase number: " + phaseNumber);
    }
}
