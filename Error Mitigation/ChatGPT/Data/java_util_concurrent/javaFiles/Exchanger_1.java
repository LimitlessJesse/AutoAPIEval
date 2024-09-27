import java.util.concurrent.Exchanger;

public class Exchanger_1 {
    public static void main(String[] args) throws InterruptedException {
        Exchanger<String> exchanger = new Exchanger<>();

        Thread thread1 = new Thread(() -> {
            try {
                String data1 = "Data from Thread 1";
                System.out.println("Thread 1 is waiting to exchange data...");
                String exchangedData = exchanger.exchange(data1);
                System.out.println("Thread 1 received: " + exchangedData);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread thread2 = new Thread(() -> {
            try {
                String data2 = "Data from Thread 2";
                System.out.println("Thread 2 is waiting to exchange data...");
                String exchangedData = exchanger.exchange(data2);
                System.out.println("Thread 2 received: " + exchangedData);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();
    }
}
