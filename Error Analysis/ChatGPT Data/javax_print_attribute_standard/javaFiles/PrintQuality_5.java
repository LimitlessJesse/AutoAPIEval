import javax.print.attribute.standard.PrintQuality;

public class PrintQuality_5 {
    public static void main(String[] args) {
        PrintQuality quality = PrintQuality.DRAFT;
        String name = quality.getName();
        System.out.println("Print Quality Name: " + name);
    }
}
