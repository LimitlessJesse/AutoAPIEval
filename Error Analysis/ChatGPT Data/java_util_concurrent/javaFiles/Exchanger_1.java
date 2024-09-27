import java.util.concurrent.Exchanger;

public class Exchanger_1 {
    public static void main(String[] args) {
        Exchanger<String> exchanger = new Exchanger<>();
        
        // Thread 1
        new Thread(() -> {
            try {
                String data1 = "Data from Thread 1";
                System.out.println("Thread 1 has data: " + data1);
                
                String exchangedData = exchanger.exchange(data1);
                
                System.out.println("Thread 1 received: " + exchangedData);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
        
        // Thread 2
        new Thread(() -> {
            try {
                String data2 = "Data from Thread 2";
                System.out.println("Thread 2 has data: " + data2);
                
                String exchangedData = exchanger.exchange(data2);
                
                System.out.println("Thread 2 received: " + exchangedData);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
    }
}
