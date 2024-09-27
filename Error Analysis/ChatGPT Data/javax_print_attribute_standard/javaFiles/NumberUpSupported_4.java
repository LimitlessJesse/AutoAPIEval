import javax.print.attribute.standard.NumberUpSupported;

public class NumberUpSupported_4 {
    public static void main(String[] args) {
        NumberUpSupported numUpSupported = new NumberUpSupported(2); // Create a NumberUpSupported object with value 2
        NumberUpSupported numUpSupported2 = new NumberUpSupported(2); // Create another NumberUpSupported object with value 2

        boolean isEqual = numUpSupported.equals(numUpSupported2); // Check if the two objects are equal
        System.out.println("Are the NumberUpSupported objects equal? " + isEqual); // Print the result
    }
}
