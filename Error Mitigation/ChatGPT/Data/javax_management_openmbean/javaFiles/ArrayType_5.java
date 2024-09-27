import javax.management.openmbean.ArrayType;

public class ArrayType_5 {
    public static void main(String[] args) {
        ArrayType arrayType = new ArrayType(1, String.class);
        System.out.println(arrayType.toString());
    }
}
