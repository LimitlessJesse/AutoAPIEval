import javax.print.attribute.standard.PrinterMakeAndModel;

public class PrinterMakeAndModel_3 {
    public static void main(String[] args) {
        PrinterMakeAndModel makeAndModel1 = new PrinterMakeAndModel("Printer1", "Model1");
        PrinterMakeAndModel makeAndModel2 = new PrinterMakeAndModel("Printer2", "Model2");

        boolean isEqual = makeAndModel1.equals(makeAndModel2);
        System.out.println("Are the two PrinterMakeAndModel objects equal? " + isEqual);
    }
}
