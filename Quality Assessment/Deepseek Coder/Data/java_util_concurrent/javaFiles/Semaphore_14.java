import java.util.concurrent.Semaphore;
import java.util.Collection;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

public class Semaphore_14 {
    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(1);
        ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newFixedThreadPool(2, new ThreadFactory() {
            private final AtomicInteger id = new AtomicInteger(0);

            @Override
            public Thread newThread(Runnable r) {
                Thread t = new Thread(r);
                t.setName("Thread-" + id.getAndIncrement());
                return t;
            }
        });

        executor.execute(new Runnable() {
            @Override
            public void run() {
                try {
                    semaphore.acquire();
                    System.out.println(Thread.currentThread().getName() + " acquired semaphore");
                    Thread.sleep(1000);
                    semaphore.release();
                    System.out.println(Thread.currentThread().getName() + " released semaphore");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        executor.execute(new Runnable() {
            @Override
            public void run() {
                try {
                    semaphore.acquire();
                    System.out.println(Thread.currentThread().getName() + " acquired semaphore");
                    semaphore.release();
                    System.out.println(Thread.currentThread().getName() + " released semaphore");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        executor.shutdown();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Collection<Thread> queuedThreads = semaphore.getQueuedThreads();
        System.out.println("Queued threads:");
        for (Thread thread : queuedThreads) {
            System.out.println(thread.getName());
        }
    }
}
