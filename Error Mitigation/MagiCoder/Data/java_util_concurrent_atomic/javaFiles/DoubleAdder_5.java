import java.util.concurrent.atomic.DoubleAdder;

public class DoubleAdder_5 {
    public static void main(String[] args) {
        DoubleAdder adder = new DoubleAdder();
        adder.add(10.5);
        System.out.println(adder.longValue());
    }
}
