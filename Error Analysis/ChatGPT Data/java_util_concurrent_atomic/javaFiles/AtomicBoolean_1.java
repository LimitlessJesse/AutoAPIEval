import java.util.concurrent.atomic.AtomicBoolean;

public class AtomicBoolean_1 {
    public static void main(String[] args) {
        AtomicBoolean flag = new AtomicBoolean(false);
        System.out.println("Initial value: " + flag.get());
        
        flag.set(true);
        System.out.println("New value: " + flag.get());
    }
}
