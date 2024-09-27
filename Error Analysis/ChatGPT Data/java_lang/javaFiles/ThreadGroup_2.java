public class ThreadGroup_2 {
    public static void main(String[] args) {
        ThreadGroup threadGroup = new ThreadGroup("exampleGroup");
        Thread thread = new Thread(threadGroup, new MyRunnable());
        
        // Setting the thread as a daemon
        thread.setDaemon(true);
        
        thread.start();
    }

    static class MyRunnable implements Runnable {
        @Override
        public void run() {
            System.out.println("Thread is running");
        }
    }
}
