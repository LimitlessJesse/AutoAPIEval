import java.util.concurrent.Phaser;

public class Phaser_2 {
    public static void main(String[] args) {
        Phaser phaser = new Phaser();
        int phaseNumber = phaser.arrive();
        System.out.println("Arrival phase number: " + phaseNumber);
    }
}
