import java.util.concurrent.atomic.LongAdder;

public class LongAdder_2 {
    public static void main(String[] args) {
        LongAdder adder = new LongAdder();
        adder.add(5);
        System.out.println(adder.longValue());
    }
}
