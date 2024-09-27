import java.util.BitSet;

public class BitSet_3 {
    public static void main(String[] args) {
        BitSet bs = new BitSet();
        bs.set(0);
        bs.set(2);
        
        System.out.println("Bit at index 0: " + bs.get(0)); // Output: true
        System.out.println("Bit at index 1: " + bs.get(1)); // Output: false
        System.out.println("Bit at index 2: " + bs.get(2)); // Output: true
    }
}
