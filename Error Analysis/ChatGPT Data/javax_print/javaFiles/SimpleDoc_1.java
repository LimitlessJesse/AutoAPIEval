import javax.print.DocFlavor;
import javax.print.SimpleDoc;

public class SimpleDoc_1 {
    public static void main(String[] args) {
        SimpleDoc doc = new SimpleDoc("Hello World", DocFlavor.STRING.TEXT_PLAIN, null);
        DocFlavor flavor = doc.getDocFlavor();
        System.out.println(flavor);
    }
}
