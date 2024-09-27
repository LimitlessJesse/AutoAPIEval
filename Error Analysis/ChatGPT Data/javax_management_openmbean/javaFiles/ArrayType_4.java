import javax.management.openmbean.ArrayType;

public class ArrayType_4 {
    public static void main(String[] args) {
        ArrayType arrayType = new ArrayType(1);
        int dimension = arrayType.getDimension();
        System.out.println("Array dimension: " + dimension);
    }
}
