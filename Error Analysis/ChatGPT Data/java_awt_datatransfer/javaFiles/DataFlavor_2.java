import java.awt.datatransfer.DataFlavor;

public class DataFlavor_2 {
    public static void main(String[] args) {
        DataFlavor flavor = DataFlavor.stringFlavor;
        Class<?> representationClass = flavor.getRepresentationClass();
        System.out.println("Representation class: " + representationClass.getName());
    }
}
