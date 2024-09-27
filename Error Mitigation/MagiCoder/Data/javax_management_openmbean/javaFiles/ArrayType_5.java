import javax.management.openmbean.ArrayType;

public class ArrayType_5 {
    public static void main(String[] args) {
        ArrayType arrayType1 = new ArrayType(new int[]{1, 2, 3}, "java.lang.String", true);
        ArrayType arrayType2 = new ArrayType(new int[]{1, 2, 3}, "java.lang.String", true);
        ArrayType arrayType3 = new ArrayType(new int[]{1, 2, 3}, "java.lang.Integer", true);

        System.out.println(arrayType1.equals(arrayType2)); // true
        System.out.println(arrayType1.equals(arrayType3)); // false
    }
}
