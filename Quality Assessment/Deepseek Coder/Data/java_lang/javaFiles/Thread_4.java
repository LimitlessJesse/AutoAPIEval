import java.lang.Thread;

public class Thread_4 {
    public static void main(String[] args) {
        System.out.println("Starting the program");
        try {
            Thread.sleep(5000); // Pause the program for 5 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Ending the program");
    }
}
