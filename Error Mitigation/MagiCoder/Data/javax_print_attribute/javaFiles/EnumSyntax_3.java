import javax.print.attribute.EnumSyntax;

public class EnumSyntax_3 {
    public static void main(String[] args) {
        // Create an instance of EnumSyntax
        EnumSyntax enumSyntax = new EnumSyntax() {
            @Override
            public String toString() {
                return "Example EnumSyntax";
            }
        };

        // Call the toString() method
        String result = enumSyntax.toString();

        // Print the result
        System.out.println(result);
    }
}
