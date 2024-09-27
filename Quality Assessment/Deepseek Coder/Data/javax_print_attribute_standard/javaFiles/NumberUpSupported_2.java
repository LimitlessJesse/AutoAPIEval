import javax.print.attribute.standard.NumberUpSupported;

public class NumberUpSupported_2 {
    public static void main(String[] args) {
        NumberUpSupported n1 = new NumberUpSupported(1);
        NumberUpSupported n2 = new NumberUpSupported(1);

        boolean isEqual = n1.equals(n2);

        System.out.println("Are the two NumberUpSupported objects equal? " + isEqual);
    }
}
