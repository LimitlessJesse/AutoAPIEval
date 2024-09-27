import java.util.concurrent.atomic.LongAdder;

public class LongAdder_3 {
    public static void main(String[] args) {
        LongAdder adder = new LongAdder();
        adder.increment();
        adder.increment();
        adder.increment();
        System.out.println(adder.sum());
    }
}
