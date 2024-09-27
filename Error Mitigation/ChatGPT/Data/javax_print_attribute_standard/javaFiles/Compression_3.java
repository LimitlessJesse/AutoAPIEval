import javax.print.attribute.standard.Compression;

public class Compression_3 {
    public static void main(String[] args) {
        Compression compression = Compression.COMPRESS;
        String categoryName = compression.getName();
        System.out.println("Category Name: " + categoryName);
    }
}
