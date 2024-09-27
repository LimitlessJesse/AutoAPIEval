import java.util.concurrent.Phaser;

public class Phaser_5 {
    public static void main(String[] args) {
        Phaser phaser = new Phaser();
        int phaseNumber = phaser.bulkRegister(3);
        System.out.println("Arrival phase number: " + phaseNumber);
    }
}
