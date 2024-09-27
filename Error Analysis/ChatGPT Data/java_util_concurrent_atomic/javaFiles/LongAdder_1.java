import java.util.concurrent.atomic.LongAdder;

public class LongAdder_1 {
    public static void main(String[] args) {
        LongAdder adder = new LongAdder();
        adder.add(10);
        System.out.println(adder.sum());
    }
}
