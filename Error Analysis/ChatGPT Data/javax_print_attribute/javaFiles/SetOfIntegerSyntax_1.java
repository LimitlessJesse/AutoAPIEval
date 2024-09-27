import javax.print.attribute.SetOfIntegerSyntax;

public class SetOfIntegerSyntax_1 {
    public static void main(String[] args) {
        SetOfIntegerSyntax set = new SetOfIntegerSyntax();
        boolean result = set.contains(5);
        System.out.println(result);
    }
}
