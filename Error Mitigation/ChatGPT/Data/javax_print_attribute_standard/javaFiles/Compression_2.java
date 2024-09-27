import javax.print.attribute.standard.Compression;

public class Compression_2 {
    public static void main(String[] args) {
        Compression compression = Compression.COMPRESS;
        Class<? extends Attribute> category = compression.getCategory();
        System.out.println("Category: " + category.getName());
    }
}
