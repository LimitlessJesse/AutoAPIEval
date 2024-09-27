import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;

public class DataFlavor_14 {
    public static void main(String[] args) {
        DataFlavor flavor = DataFlavor.stringFlavor;
        try {
            boolean isSerialized = flavor.isSerializedObjectType();
            System.out.println("Is flavor serialized object type: " + isSerialized);
        } catch (UnsupportedFlavorException e) {
            e.printStackTrace();
        }
    }
}
