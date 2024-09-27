import java.lang.Double;

public class Double_2 {
    public static void main(String[] args) {
        Double num1 = new Double(Double.NaN);
        Double num2 = new Double(10.0);

        System.out.println("Is num1 NaN? " + num1.isNaN()); // Output: true
        System.out.println("Is num2 NaN? " + num2.isNaN()); // Output: false
    }
}
