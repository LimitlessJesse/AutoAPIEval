import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

public class Executors_3 {
    public static void main(String[] args) {
        ThreadFactory threadFactory = Executors.defaultThreadFactory();
        System.out.println("Thread factory created: " + threadFactory);
    }
}
