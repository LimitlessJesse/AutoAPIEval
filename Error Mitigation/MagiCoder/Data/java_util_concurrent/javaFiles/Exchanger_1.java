import java.util.concurrent.Exchanger;

public class Exchanger_1 {
    public static void main(String[] args) throws InterruptedException {
        Exchanger<String> exchanger = new Exchanger<>();

        new Thread(() -> {
            try {
                String received = exchanger.exchange("Hello");
                System.out.println("Received: " + received);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();

        String exchanged = exchanger.exchange("World");
        System.out.println("Exchanged: " + exchanged);
    }
}
