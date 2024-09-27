import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;

public class DataFlavor_9 {
    public static void main(String[] args) {
        DataFlavor flavor1 = DataFlavor.stringFlavor;
        DataFlavor flavor2 = DataFlavor.stringFlavor;

        try {
            boolean isEqual = flavor1.equals(flavor2);
            System.out.println("Are the two flavors equal? " + isEqual);
        } catch (UnsupportedFlavorException e) {
            e.printStackTrace();
        }
    }
}
