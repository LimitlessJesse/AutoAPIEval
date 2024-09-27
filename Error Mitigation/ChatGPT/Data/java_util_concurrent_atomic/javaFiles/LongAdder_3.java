import java.util.concurrent.atomic.LongAdder;

public class LongAdder_3 {
    public static void main(String[] args) {
        LongAdder longAdder = new LongAdder();
        longAdder.increment();
        longAdder.decrement();
        System.out.println(longAdder.sum());
    }
}
