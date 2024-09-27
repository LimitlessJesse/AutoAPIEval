import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.SystemFlavorMap;

public class SystemFlavorMap_2 {
    public static void main(String[] args) {
        SystemFlavorMap flavorMap = (SystemFlavorMap) SystemFlavorMap.getDefaultFlavorMap();
        DataFlavor flavor = DataFlavor.stringFlavor;
        String nativeValue = "text/plain";
        
        flavorMap.addUnencodedNativeForFlavor(flavor, nativeValue);
    }
}
