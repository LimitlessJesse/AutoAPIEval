import javax.print.attribute.EnumSyntax;

public class EnumSyntax_5 {
    public static void main(String[] args) {
        MyEnum myEnum = new MyEnum();
        System.out.println(myEnum.getValue());
    }

    static class MyEnum extends EnumSyntax {
        @Override
        public int getValue() {
            return 10;
        }
    }
}
