import java.lang.Thread;

public class Thread_3 {
    public static void main(String[] args) {
        try {
            System.out.println("Thread is going to sleep for 2 seconds");
            Thread.sleep(2000);
            System.out.println("Thread woke up after sleeping for 2 seconds");
        } catch (InterruptedException e) {
            System.out.println("Thread was interrupted while sleeping");
        }
    }
}
