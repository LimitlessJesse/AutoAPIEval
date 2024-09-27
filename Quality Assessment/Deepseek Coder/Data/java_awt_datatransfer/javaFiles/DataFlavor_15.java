import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import java.util.List;

public class DataFlavor_15 {
    public static void main(String[] args) {
        DataFlavor flavor = DataFlavor.javaFileListType;
        try {
            boolean isJavaFileListType = flavor.isFlavorJavaFileListType();
            System.out.println(isJavaFileListType);
        } catch (UnsupportedFlavorException e) {
            e.printStackTrace();
        }
    }
}
