import java.awt.datatransfer.DataFlavor;

public class DataFlavor_4 {
    public static void main(String[] args) {
        DataFlavor dataFlavor = new DataFlavor(String.class, "String");
        boolean isSerialized = dataFlavor.isFlavorSerializedObjectType();
        System.out.println("Is flavor serialized object? " + isSerialized);
    }
}
