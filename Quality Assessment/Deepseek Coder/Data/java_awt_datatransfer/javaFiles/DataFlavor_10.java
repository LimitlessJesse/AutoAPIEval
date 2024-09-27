import java.awt.datatransfer.DataFlavor;

public class DataFlavor_10 {
    public static void main(String[] args) {
        DataFlavor flavor = DataFlavor.stringFlavor;
        int hashCode = flavor.hashCode();
        System.out.println("Hash code of the data flavor: " + hashCode);
    }
}
