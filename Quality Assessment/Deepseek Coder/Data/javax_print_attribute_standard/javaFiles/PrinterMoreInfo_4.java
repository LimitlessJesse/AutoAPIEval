import javax.print.attribute.standard.PrinterMoreInfo;

public class PrinterMoreInfo_4 {
    public static void main(String[] args) {
        PrinterMoreInfo info1 = new PrinterMoreInfo("key", "value", "en");
        PrinterMoreInfo info2 = new PrinterMoreInfo("key", "value", "en");

        boolean isEqual = info1.equals(info2);

        System.out.println("Are the two PrinterMoreInfo objects equal? " + isEqual);
    }
}
