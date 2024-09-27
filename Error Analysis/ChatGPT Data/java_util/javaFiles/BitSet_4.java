import java.util.BitSet;

public class BitSet_4 {
    public static void main(String[] args) {
        BitSet bitSet = new BitSet(10);
        bitSet.set(0);
        bitSet.set(2);
        bitSet.set(4);
        
        System.out.println("BitSet length: " + bitSet.length());
    }
}
