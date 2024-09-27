public class Thread_2 {
    public static void main(String[] args) {
        Thread myThread = new Thread() {
            public void run() {
                System.out.println("Thread is running");
            }
        };
        
        myThread.start();
    }
}
