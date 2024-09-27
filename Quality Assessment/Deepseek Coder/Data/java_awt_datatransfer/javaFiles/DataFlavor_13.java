import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;

public class DataFlavor_13 {
    public static void main(String[] args) {
        DataFlavor dataFlavor = DataFlavor.stringFlavor;
        try {
            Class<?> representationClass = dataFlavor.getRepresentationClass();
            System.out.println(representationClass.getName());
        } catch (UnsupportedFlavorException e) {
            e.printStackTrace();
        }
    }
}
