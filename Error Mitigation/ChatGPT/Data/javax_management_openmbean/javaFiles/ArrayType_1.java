import javax.management.openmbean.ArrayType;

public class ArrayType_1 {
    public static void main(String[] args) {
        ArrayType arrayType = new ArrayType(String.class, false);
        int dimension = arrayType.getDimension();
        System.out.println("Dimension of arrays described by ArrayType instance: " + dimension);
    }
}
