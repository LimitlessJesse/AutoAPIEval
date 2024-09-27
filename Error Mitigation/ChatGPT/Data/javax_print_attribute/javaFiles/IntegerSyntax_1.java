import javax.print.attribute.IntegerSyntax;

public class IntegerSyntax_1 {
    public static void main(String[] args) {
        IntegerSyntax integerAttribute = new IntegerSyntax() {
            @Override
            public int getValue() {
                return 10;
            }
        };
        
        System.out.println("Integer value: " + integerAttribute.getValue());
    }
}
