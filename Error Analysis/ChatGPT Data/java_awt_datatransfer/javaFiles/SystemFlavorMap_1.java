import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.SystemFlavorMap;

public class SystemFlavorMap_1 {
    public static void main(String[] args) {
        SystemFlavorMap flavorMap = (SystemFlavorMap) SystemFlavorMap.getDefaultFlavorMap();
        flavorMap.addFlavorForUnencodedNative("someNative", DataFlavor.stringFlavor);
    }
}
