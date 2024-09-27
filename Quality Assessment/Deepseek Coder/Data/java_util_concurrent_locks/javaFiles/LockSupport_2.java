import java.util.concurrent.locks.LockSupport;

public class LockSupport_2 {
    public static void main(String[] args) {
        System.out.println("Before parkNanos");
        LockSupport.parkNanos(1000000000); // Pause for 1 second
        System.out.println("After parkNanos");
    }
}
