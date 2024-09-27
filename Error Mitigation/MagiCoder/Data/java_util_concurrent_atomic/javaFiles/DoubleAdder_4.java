import java.util.concurrent.atomic.DoubleAdder;

public class DoubleAdder_4 {
    public static void main(String[] args) {
        DoubleAdder adder = new DoubleAdder();
        adder.add(1.2);
        adder.add(3.4);
        System.out.println(adder.doubleValue());
    }
}
