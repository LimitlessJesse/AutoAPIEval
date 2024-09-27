import javax.print.attribute.IntegerSyntax;

public class IntegerSyntax_1 {
    public static void main(String[] args) {
        IntegerSyntax syntax = new IntegerSyntax(10);
        int value = syntax.getValue();
        System.out.println("Value: " + value);
    }
}
