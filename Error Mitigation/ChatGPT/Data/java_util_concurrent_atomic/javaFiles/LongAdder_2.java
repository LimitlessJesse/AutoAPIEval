import java.util.concurrent.atomic.LongAdder;

public class LongAdder_2 {
    public static void main(String[] args) {
        LongAdder longAdder = new LongAdder();
        longAdder.increment();
        System.out.println("Value after increment: " + longAdder.sum());
    }
}
