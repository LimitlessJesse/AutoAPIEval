import java.lang.Thread;
import java.lang.ThreadGroup;

public class ThreadGroup_3 {
    public static void main(String[] args) {
        ThreadGroup group = new ThreadGroup("MyGroup") {
            @Override
            public void uncaughtException(Thread t, Throwable e) {
                System.out.println("Thread " + t.getName() + " threw an exception: " + e.getMessage());
            }
        };

        Thread thread = new Thread(group, new Runnable() {
            @Override
            public void run() {
                throw new RuntimeException("Uncaught exception");
            }
        });

        thread.start();
    }
}
