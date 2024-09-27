import java.lang.Thread;

public class Thread_4 {
    public static void main(String[] args) {
        Thread thread = new Thread();
        
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
