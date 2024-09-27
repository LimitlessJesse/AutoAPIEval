import java.util.concurrent.atomic.LongAdder;

public class LongAdder_4 {
    public static void main(String[] args) {
        LongAdder adder = new LongAdder();
        adder.increment();
        adder.increment();
        adder.increment();
        System.out.println("Sum before reset: " + adder.sum());
        adder.reset();
        System.out.println("Sum after reset: " + adder.sum());
    }
}
