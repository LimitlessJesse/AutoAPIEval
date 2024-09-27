import javax.print.attribute.EnumSyntax;

public class EnumSyntax_4 {
    public static void main(String[] args) {
        EnumSyntax enumSyntax = new EnumSyntax() {
            @Override
            public String toString() {
                return "EnumSyntax toString method implementation";
            }
        };
        
        System.out.println(enumSyntax.toString());
    }
}
