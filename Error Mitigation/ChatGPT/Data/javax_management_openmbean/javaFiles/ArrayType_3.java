import javax.management.openmbean.ArrayType;

public class ArrayType_3 {
    public static void main(String[] args) {
        ArrayType arrayType = new ArrayType(String.class, false);
        boolean isPrimitiveArray = arrayType.isPrimitiveArray();
        System.out.println("Is primitive array: " + isPrimitiveArray);
    }
}
