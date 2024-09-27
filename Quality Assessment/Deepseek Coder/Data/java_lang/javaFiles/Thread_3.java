public class Thread_3 {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            for(int i = 0; i < 10; i++) {
                System.out.println(i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        thread.start();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        thread.stop();
    }
}
