import javax.print.attribute.SetOfIntegerSyntax;

public class SetOfIntegerSyntax_3 {
    public static void main(String[] args) {
        SetOfIntegerSyntax set = new SetOfIntegerSyntax();
        set.add(10);
        set.add(20);
        set.add(30);

        boolean contains10 = set.contains(10);
        boolean contains20 = set.contains(20);
        boolean contains40 = set.contains(40);

        System.out.println("Contains 10: " + contains10);
        System.out.println("Contains 20: " + contains20);
        System.out.println("Contains 40: " + contains40);
    }
}
