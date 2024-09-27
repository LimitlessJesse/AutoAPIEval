import java.lang.Double;

public class Double_1 {
    public static void main(String[] args) {
        Double num1 = 10.5;
        Double num2 = 5.5;

        int result = num1.compareTo(num2);

        if (result == 0) {
            System.out.println("num1 is equal to num2");
        } else if (result < 0) {
            System.out.println("num1 is less than num2");
        } else {
            System.out.println("num1 is greater than num2");
        }
    }
}
