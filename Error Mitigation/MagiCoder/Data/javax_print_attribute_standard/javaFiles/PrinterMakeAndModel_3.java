import javax.print.attribute.standard.PrinterMakeAndModel;

public class PrinterMakeAndModel_3 {
    public static void main(String[] args) {
        PrinterMakeAndModel makeAndModel1 = new PrinterMakeAndModel("Printer1", "Model1");
        PrinterMakeAndModel makeAndModel2 = new PrinterMakeAndModel("Printer2", "Model2");
        PrinterMakeAndModel makeAndModel3 = new PrinterMakeAndModel("Printer1", "Model1");

        System.out.println(makeAndModel1.equals(makeAndModel2)); // false
        System.out.println(makeAndModel1.equals(makeAndModel3)); // true
    }
}
