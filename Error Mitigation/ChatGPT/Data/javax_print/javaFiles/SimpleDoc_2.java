import javax.print.DocFlavor;
import javax.print.SimpleDoc;

public class SimpleDoc_2 {
    public static void main(String[] args) {
        SimpleDoc doc = new SimpleDoc("Print Data", DocFlavor.STRING.TEXT_PLAIN, null);
        DocFlavor flavor = doc.getDocFlavor();
        System.out.println("Doc Flavor: " + flavor);
    }
}
