import java.awt.image.DataBuffer;

public class DataBuffer_3 {
    public static void main(String[] args) {
        DataBuffer dataBuffer = new DataBuffer(...); // initialize DataBuffer object
        int bankIndex = 0; // specify bank index
        int elementIndex = 2; // specify element index
        int element = dataBuffer.getElem(bankIndex, elementIndex); // get element from specified bank and index
        System.out.println("Element at bank " + bankIndex + " and index " + elementIndex + " is: " + element);
    }
}
