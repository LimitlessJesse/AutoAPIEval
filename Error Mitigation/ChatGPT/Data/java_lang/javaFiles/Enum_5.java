import java.util.Arrays;

public class Enum_5 {
    public enum ExampleEnum {
        FIRST, SECOND, THIRD
    }

    public static void main(String[] args) {
        ExampleEnum first = ExampleEnum.FIRST;
        ExampleEnum second = ExampleEnum.SECOND;

        int result = first.compareTo(second);
        System.out.println(result); // Output: -1
    }
}
