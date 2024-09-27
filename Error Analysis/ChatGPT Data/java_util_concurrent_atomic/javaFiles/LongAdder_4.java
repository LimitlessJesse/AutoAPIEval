import java.util.concurrent.atomic.LongAdder;

public class LongAdder_4 {
    public static void main(String[] args) {
        LongAdder longAdder = new LongAdder();
        
        longAdder.add(10);
        longAdder.add(20);
        longAdder.add(30);
        
        long sum = longAdder.sum();
        System.out.println("Sum: " + sum);
    }
}
