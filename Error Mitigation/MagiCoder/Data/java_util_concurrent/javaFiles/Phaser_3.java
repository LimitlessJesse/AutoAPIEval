import java.util.concurrent.Phaser;

public class Phaser_3 {
    public static void main(String[] args) {
        Phaser phaser = new Phaser(1);
        phaser.arriveAndAwaitAdvance();
    }
}
