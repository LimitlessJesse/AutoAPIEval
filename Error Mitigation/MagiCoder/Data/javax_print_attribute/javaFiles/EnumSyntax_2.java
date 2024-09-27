import javax.print.attribute.EnumSyntax;

public class EnumSyntax_2 {
    public static void main(String[] args) {
        // Create an instance of EnumSyntax
        EnumSyntax enumSyntax = new EnumSyntax() {
            @Override
            public int getValue() {
                return 0;
            }
        };

        // Call the hashCode method
        int hashCode = enumSyntax.hashCode();

        // Print the hashCode
        System.out.println("Hash code: " + hashCode);
    }
}
