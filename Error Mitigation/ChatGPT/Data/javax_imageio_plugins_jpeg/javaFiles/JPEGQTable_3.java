import javax.imageio.plugins.jpeg.JPEGQTable;

public class JPEGQTable_3 {
    public static void main(String[] args) {
        JPEGQTable jpegQTable = new JPEGQTable();
        int[] quantizationTable = jpegQTable.getTable();
        
        // Print the quantization table
        for (int i = 0; i < quantizationTable.length; i++) {
            System.out.print(quantizationTable[i] + " ");
        }
    }
}
