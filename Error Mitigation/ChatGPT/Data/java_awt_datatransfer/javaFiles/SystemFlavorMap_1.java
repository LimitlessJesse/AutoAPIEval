import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.SystemFlavorMap;

public class SystemFlavorMap_1 {
    public static void main(String[] args) {
        SystemFlavorMap flavorMap = (SystemFlavorMap) SystemFlavorMap.getDefaultFlavorMap();
        String nativeKey = "text/plain";
        DataFlavor dataFlavor = DataFlavor.stringFlavor;
        
        flavorMap.addFlavorForUnencodedNative(nativeKey, dataFlavor);
    }
}
