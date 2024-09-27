import java.awt.datatransfer.DataFlavor;

public class DataFlavor_5 {
    public static void main(String[] args) {
        DataFlavor flavor1 = new DataFlavor(String.class, "String Flavor");
        DataFlavor flavor2 = new DataFlavor(String.class, "String Flavor");
        
        boolean isEqual = flavor1.equals(flavor2);
        System.out.println("Are the DataFlavors equal? " + isEqual);
    }
}
