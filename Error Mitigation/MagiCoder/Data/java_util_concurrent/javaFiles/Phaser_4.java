import java.util.concurrent.Phaser;

public class Phaser_4 {
    public static void main(String[] args) {
        Phaser phaser = new Phaser(1);
        phaser.arriveAndDeregister();
    }
}
