import java.lang.Thread;

public class Thread_5 {
    public static void main(String[] args) {
        try {
            System.out.println("Thread is going to sleep");
            Thread.sleep(5000); // Thread will sleep for 5 seconds
            System.out.println("Thread woke up");
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted");
        }
    }
}
