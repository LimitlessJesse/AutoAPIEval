import java.lang.Thread;
import java.lang.ThreadGroup;

public class ThreadGroup_3 {
    public static void main(String[] args) {
        ThreadGroup threadGroup = new ThreadGroup("ThreadGroup");
        Thread thread = new Thread(threadGroup, "Thread");

        thread.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        threadGroup.interrupt();
    }
}
