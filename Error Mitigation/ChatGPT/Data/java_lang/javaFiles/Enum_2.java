import java.lang.Enum;

public class Enum_2 {
    public enum ExampleEnum {
        FIRST,
        SECOND,
        THIRD
    }

    public static void main(String[] args) {
        ExampleEnum example = ExampleEnum.SECOND;
        System.out.println("Ordinal of SECOND: " + example.ordinal());
    }
}
