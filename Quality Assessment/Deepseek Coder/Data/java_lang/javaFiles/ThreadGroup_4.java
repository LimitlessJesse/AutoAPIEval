import java.lang.Thread;
import java.lang.ThreadGroup;

public class ThreadGroup_4 {
    public static void main(String[] args) {
        ThreadGroup tg = new ThreadGroup("ThreadGroup");
        Thread thread = new Thread(tg, "Thread");
        thread.start();

        boolean isDaemon = thread.isDaemon();
        System.out.println("Is the thread a daemon? " + isDaemon);
    }
}
