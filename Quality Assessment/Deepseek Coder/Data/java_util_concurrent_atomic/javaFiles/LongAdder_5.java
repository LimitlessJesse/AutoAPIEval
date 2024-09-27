import java.util.concurrent.atomic.LongAdder;

public class LongAdder_5 {
    public static void main(String[] args) {
        LongAdder adder = new LongAdder();
        adder.increment();
        long value = adder.longValue();
        System.out.println(value);
    }
}
