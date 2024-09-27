import java.util.concurrent.atomic.DoubleAdder;

public class DoubleAdder_4 {
    public static void main(String[] args) {
        DoubleAdder adder = new DoubleAdder();
        adder.add(5.5);
        adder.add(3.3);
        System.out.println(adder.sum());  // prints 8.8
        System.out.println(adder.doubleValue());  // prints 8.8
        adder.add(2.2);
        System.out.println(adder.doubleValue());  // prints 10.8
    }
}
