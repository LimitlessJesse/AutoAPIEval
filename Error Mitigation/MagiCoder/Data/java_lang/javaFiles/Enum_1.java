import java.lang.Enum;

public class Enum_1 {
    public static void main(String[] args) {
        // Assume we have an enum named 'MyEnum' with constants 'A', 'B', and 'C'
        MyEnum myEnum1 = MyEnum.A;
        MyEnum myEnum2 = MyEnum.B;

        // Compare'myEnum1' with'myEnum2'
        int result = myEnum1.compareTo(myEnum2);

        // Print the result
        System.out.println(result);
    }
}

enum MyEnum {
    A, B, C;
}
