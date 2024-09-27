import java.util.concurrent.atomic.DoubleAdder;

public class DoubleAdder_5 {
    public static void main(String[] args) {
        DoubleAdder doubleAdder = new DoubleAdder();
        doubleAdder.add(10.5);
        System.out.println("Sum before reset: " + doubleAdder.sum());
        
        doubleAdder.reset();
        System.out.println("Sum after reset: " + doubleAdder.sum());
    }
}
