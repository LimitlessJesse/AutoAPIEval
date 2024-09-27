import java.awt.datatransfer.DataFlavor;

public class DataFlavor_4 {
    public static void main(String[] args) {
        DataFlavor dataFlavor = DataFlavor.stringFlavor;
        int hashCode = dataFlavor.hashCode();
        System.out.println("DataFlavor hashCode: " + hashCode);
    }
}
