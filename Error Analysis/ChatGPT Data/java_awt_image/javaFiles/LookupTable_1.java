import java.awt.image.LookupTable;

public class LookupTable_1 {
    public static void main(String[] args) {
        LookupTable lt = new LookupTable(0, 3) {
            @Override
            public int[] lookupPixel(int[] src, int[] dest) {
                return new int[0];
            }

            @Override
            public int getOffset() {
                return 3; // example value, you can change this accordingly
            }
        };

        System.out.println("Offset: " + lt.getOffset());
    }
}
