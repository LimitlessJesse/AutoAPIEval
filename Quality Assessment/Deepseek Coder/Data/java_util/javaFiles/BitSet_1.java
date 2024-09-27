import java.util.BitSet;

public class BitSet_1 {
    public static void main(String[] args) {
        BitSet bitSet = new BitSet();
        bitSet.set(0);
        bitSet.set(1);
        bitSet.set(2);

        boolean value = bitSet.get(1);
        System.out.println(value);  // Output: true
    }
}
