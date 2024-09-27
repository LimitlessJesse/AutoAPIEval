import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;

public class DataFlavor_8 {
    public static void main(String[] args) {
        DataFlavor flavor = DataFlavor.stringFlavor;
        try {
            String humanPresentableName = flavor.getHumanPresentableName();
            System.out.println(humanPresentableName);
        } catch (UnsupportedFlavorException e) {
            e.printStackTrace();
        }
    }
}
