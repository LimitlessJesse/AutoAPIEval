import javax.imageio.plugins.jpeg.JPEGImageWriteParam;

public class JPEGImageWriteParam_3 {
    public static void main(String[] args) {
        JPEGImageWriteParam param = new JPEGImageWriteParam(null);

        // Setting optimize Huffman tables to true
        param.setOptimizeHuffmanTables(true);

        // Verify the setting
        boolean optimize = param.getOptimizeHuffmanTables();
        System.out.println("Optimize Huffman Tables: " + optimize);
    }
}
