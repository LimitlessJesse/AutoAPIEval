import java.util.concurrent.Exchanger;

public class Exchanger_1 {
    public static void main(String[] args) {
        Exchanger<String> exchanger = new Exchanger<>();

        new Thread(() -> {
            try {
                String message = exchanger.exchange("Hello from thread 1");
                System.out.println("Thread 1 received: " + message);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();

        new Thread(() -> {
            try {
                String message = exchanger.exchange("Hello from thread 2");
                System.out.println("Thread 2 received: " + message);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
    }
}
