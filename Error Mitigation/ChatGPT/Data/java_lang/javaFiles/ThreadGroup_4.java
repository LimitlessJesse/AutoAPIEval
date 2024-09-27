public class ThreadGroup_4 {
    public static void main(String[] args) {
        ThreadGroup group = new ThreadGroup("ExampleGroup");
        
        Thread thread1 = new Thread(group, () -> {
            while (!Thread.currentThread().isInterrupted()) {
                System.out.println("Thread 1 is running");
            }
        });
        
        Thread thread2 = new Thread(group, () -> {
            while (!Thread.currentThread().isInterrupted()) {
                System.out.println("Thread 2 is running");
            }
        });
        
        thread1.start();
        thread2.start();
        
        group.interrupt();
    }
}
