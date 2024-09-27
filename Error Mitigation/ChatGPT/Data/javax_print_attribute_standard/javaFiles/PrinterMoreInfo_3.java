import javax.print.attribute.standard.PrinterMoreInfo;

public class PrinterMoreInfo_3 {
    public static void main(String[] args) {
        PrinterMoreInfo printerMoreInfo1 = new PrinterMoreInfo("http://printer1info.com");
        PrinterMoreInfo printerMoreInfo2 = new PrinterMoreInfo("http://printer2info.com");

        System.out.println("Are printerMoreInfo1 and printerMoreInfo2 equal? " + printerMoreInfo1.equals(printerMoreInfo2));
    }
}
