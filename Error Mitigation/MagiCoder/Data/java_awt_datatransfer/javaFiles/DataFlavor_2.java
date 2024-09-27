import java.awt.datatransfer.DataFlavor;

public class DataFlavor_2 {
    public static void main(String[] args) {
        DataFlavor flavor = DataFlavor.stringFlavor;
        String humanPresentableName = flavor.getHumanPresentableName();
        System.out.println(humanPresentableName);
    }
}
