import java.lang.Thread.UncaughtExceptionHandler;

public class ThreadGroup_2 {
    public static void main(String[] args) {
        ThreadGroup group = new ThreadGroup("Group");
        UncaughtExceptionHandler handler = new UncaughtExceptionHandler() {
            @Override
            public void uncaughtException(Thread t, Throwable e) {
                System.out.println(t.getName() + " throws exception: " + e.getMessage());
            }
        };

        group.setUncaughtExceptionHandler(handler);

        Thread thread = new Thread(group, new Runnable() {
            @Override
            public void run() {
                throw new RuntimeException("Uncaught Exception");
            }
        });

        thread.start();
    }
}
