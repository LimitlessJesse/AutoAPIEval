public class Thread_4 {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            System.out.println("Thread is running");
        });
        
        thread.start();
        
        try {
            thread.join();
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted");
        }
        
        System.out.println("Main thread finished");
    }
}
