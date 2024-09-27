import java.util.concurrent.atomic.LongAdder;

public class LongAdder_2 {
    public static void main(String[] args) {
        LongAdder longAdder = new LongAdder();
        // Increment the LongAdder value
        longAdder.increment();
        System.out.println("LongAdder value: " + longAdder.sum());
    }
}
