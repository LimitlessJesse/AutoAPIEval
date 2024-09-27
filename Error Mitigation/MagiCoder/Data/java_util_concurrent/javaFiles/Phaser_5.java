import java.util.concurrent.Phaser;

public class Phaser_5 {
    public static void main(String[] args) {
        Phaser phaser = new Phaser(1);
        System.out.println("Initial phase: " + phaser.getPhase());

        phaser.arriveAndAwaitAdvance();
        System.out.println("Phase after first arriveAndAwaitAdvance: " + phaser.getPhase());

        phaser.arriveAndDeregister();
        System.out.println("Phase after deregister: " + phaser.getPhase());
    }
}
