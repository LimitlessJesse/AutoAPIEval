import javax.print.attribute.IntegerSyntax;

public class IntegerSyntax_2 {
    public static void main(String[] args) {
        IntegerSyntax int1 = new IntegerSyntax(10);
        IntegerSyntax int2 = new IntegerSyntax(10);

        boolean isEqual = int1.equals(int2);
        System.out.println("Are the IntegerSyntax objects equal? " + isEqual);
    }
}
