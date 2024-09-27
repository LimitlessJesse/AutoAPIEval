import java.lang.Thread;
import java.lang.ThreadGroup;

public class ThreadGroup_5 {
    public static void main(String[] args) {
        ThreadGroup tg = new ThreadGroup("ThreadGroup");
        Thread thread = new Thread(tg, "Thread");
        thread.setDaemon(true);
        System.out.println("Is the thread a daemon? " + thread.isDaemon());
    }
}
