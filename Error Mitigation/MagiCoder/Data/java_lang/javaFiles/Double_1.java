import java.lang.Double;

public class Double_1 {
    public static void main(String[] args) {
        try {
            String s = "123.456";
            double d = Double.parseDouble(s);
            System.out.println(d);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException: " + e.getMessage());
        }
    }
}
