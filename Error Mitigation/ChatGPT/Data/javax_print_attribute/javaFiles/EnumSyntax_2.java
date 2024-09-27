import javax.print.attribute.EnumSyntax;

public class EnumSyntax_2 {
    public static void main(String[] args) {
        MyEnum myEnum = MyEnum.VALUE1;
        int hashCode = myEnum.hashCode();
        System.out.println("Hash code for enum value: " + hashCode);
    }

    public enum MyEnum extends EnumSyntax {
        VALUE1,
        VALUE2,
        VALUE3
    }
}
