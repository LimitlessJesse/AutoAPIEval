import java.awt.image.DataBuffer;

public class DataBuffer_5 {
    public static void main(String[] args) {
        DataBuffer dataBuffer = new DataBuffer();
        int numBanks = dataBuffer.getNumBanks();
        System.out.println("Number of banks: " + numBanks);
    }
}
