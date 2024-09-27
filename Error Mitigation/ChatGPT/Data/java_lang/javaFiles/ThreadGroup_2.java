import java.lang.ThreadGroup;

public class ThreadGroup_2 {
    public static void main(String[] args) {
        ThreadGroup group = new ThreadGroup("ExampleGroup");
        Thread thread1 = new Thread(group, () -> {
            System.out.println("Thread 1 is running");
        });
        Thread thread2 = new Thread(group, () -> {
            System.out.println("Thread 2 is running");
        });
        
        thread1.start();
        thread2.start();
        
        System.out.println("Active thread count: " + group.activeCount());
    }
}
