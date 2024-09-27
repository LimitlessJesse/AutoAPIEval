import java.awt.image.LookupTable;

public class LookupTable_3 {
    public static void main(String[] args) {
        // Create sample source and destination arrays
        int[] src = {100, 200, 150, 50};
        int[] dest = new int[4];
        
        // Create a LookupTable instance using LookupTable's subclass to demonstrate the usage of lookupPixel method
        LookupTable lookupTable = new LookupTable(0, 4) {
            @Override
            public int[] lookupPixel(int[] src, int[] dest) {
                for (int i = 0; i < src.length; i++) {
                    dest[i] = src[i] * 2; // Multiply each pixel value by 2 as an example
                }
                return dest;
            }
        };

        // Apply lookupPixel method to the source array
        int[] result = lookupTable.lookupPixel(src, dest);
        
        // Print the result array
        for (int value : result) {
            System.out.println(value);
        }
    }
}
