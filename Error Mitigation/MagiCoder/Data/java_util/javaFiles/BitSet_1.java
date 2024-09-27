import java.util.BitSet;

public class BitSet_1 {
    public static void main(String[] args) {
        BitSet bitSet = new BitSet();
        bitSet.set(0);
        bitSet.set(1);
        bitSet.set(2);

        System.out.println(bitSet.get(0)); // Output: true
        System.out.println(bitSet.get(1)); // Output: true
        System.out.println(bitSet.get(2)); // Output: true
        System.out.println(bitSet.get(3)); // Output: false
    }
}
