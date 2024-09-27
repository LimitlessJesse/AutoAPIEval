import java.util.BitSet;

public class BitSet_4 {
    public static void main(String[] args) {
        BitSet bitSet = new BitSet();
        bitSet.set(0);
        bitSet.set(2);
        bitSet.set(4);
        
        int logicalSize = bitSet.length();
        System.out.println("Logical size of BitSet: " + logicalSize);
    }
}
