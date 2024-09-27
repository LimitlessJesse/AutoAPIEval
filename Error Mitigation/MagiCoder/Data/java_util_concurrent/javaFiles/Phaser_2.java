import java.util.concurrent.Phaser;

public class Phaser_2 {
    public static void main(String[] args) {
        Phaser phaser = new Phaser(1);
        phaser.arrive();
    }
}
