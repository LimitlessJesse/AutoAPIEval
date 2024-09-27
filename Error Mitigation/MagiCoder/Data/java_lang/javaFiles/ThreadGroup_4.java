import java.lang.ThreadGroup;

public class ThreadGroup_4 {
    public static void main(String[] args) {
        ThreadGroup tg = new ThreadGroup("MyThreadGroup");
        Thread t1 = new Thread(tg, "Thread1");
        Thread t2 = new Thread(tg, "Thread2");

        t1.start();
        t2.start();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        tg.interrupt();
    }
}
