import java.util.concurrent.Exchanger;
import java.util.concurrent.TimeUnit;

public class Exchanger_2 {
    public static void main(String[] args) throws InterruptedException {
        Exchanger<String> exchanger = new Exchanger<>();

        new Thread(() -> {
            try {
                String received = exchanger.exchange("Hello", 1, TimeUnit.SECONDS);
                System.out.println("Received: " + received);
            } catch (InterruptedException | TimeoutException e) {
                e.printStackTrace();
            }
        }).start();

        String exchanged = exchanger.exchange("World", 1, TimeUnit.SECONDS);
        System.out.println("Exchanged: " + exchanged);
    }
}
