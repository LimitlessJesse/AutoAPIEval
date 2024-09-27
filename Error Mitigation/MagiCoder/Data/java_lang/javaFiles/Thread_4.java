public class Thread_4 {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            while (true) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println("Thread was interrupted");
                    break;
                }
            }
        });

        thread.start();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        thread.interrupt();
    }
}
