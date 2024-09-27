import java.io.ByteArrayInputStream;

public class ByteArrayInputStream_5 {
    public static void main(String[] args) {
        byte[] byteArray = {65, 66, 67, 68, 69};
        ByteArrayInputStream bais = new ByteArrayInputStream(byteArray);
        
        // Read bytes from the stream
        int data;
        while ((data = bais.read()) != -1) {
            System.out.print((char) data + " ");
        }
        System.out.println();
        
        // Reset the buffer to the marked position
        bais.reset();
        
        // Read bytes again after reset
        while ((data = bais.read()) != -1) {
            System.out.print((char) data + " ");
        }
    }
}
