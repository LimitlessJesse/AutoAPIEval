public class Thread_3 {
    public static void main(String[] args) {
        // Sleep for 2 seconds
        try {
            Thread.sleep(2000);
            System.out.println("Slept for 2 seconds");
        } catch (InterruptedException e) {
            System.out.println("Thread sleep interrupted");
        }
    }
}
