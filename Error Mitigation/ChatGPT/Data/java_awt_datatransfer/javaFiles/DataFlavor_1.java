import java.awt.datatransfer.DataFlavor;

public class DataFlavor_1 {
    public static void main(String[] args) {
        DataFlavor dataFlavor = new DataFlavor(String.class, "String");
        Class<?> representationClass = dataFlavor.getRepresentationClass();
        System.out.println("Representation Class: " + representationClass.getName());
    }
}
