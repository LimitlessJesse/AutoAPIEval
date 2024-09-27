public class Thread_2 {
    public static void main(String[] args) {
        Thread thread = new Thread(new MyRunnable());
        thread.start();
    }

    static class MyRunnable implements Runnable {
        @Override
        public void run() {
            System.out.println("This is a separate thread");
        }
    }
}
