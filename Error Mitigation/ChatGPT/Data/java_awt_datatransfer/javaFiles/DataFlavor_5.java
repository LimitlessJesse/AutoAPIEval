import java.awt.datatransfer.DataFlavor;

public class DataFlavor_5 {
    public static void main(String[] args) {
        DataFlavor dataFlavor = new DataFlavor(String.class, "text/plain");
        boolean isSerializedObject = dataFlavor.isMimeTypeSerializedObject();
        System.out.println("Is Serialized Object: " + isSerializedObject);
    }
}
