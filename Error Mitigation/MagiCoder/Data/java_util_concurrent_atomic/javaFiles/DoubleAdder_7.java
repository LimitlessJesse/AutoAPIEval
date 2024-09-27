import java.util.concurrent.atomic.DoubleAdder;

public class DoubleAdder_7 {
    public static void main(String[] args) {
        DoubleAdder adder = new DoubleAdder();
        adder.add(10.5);
        float floatValue = adder.floatValue();
        System.out.println(floatValue);
    }
}
