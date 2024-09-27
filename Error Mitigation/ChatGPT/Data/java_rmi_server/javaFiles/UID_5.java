import java.io.DataInput;
import java.io.DataInputStream;
import java.io.IOException;
import java.rmi.server.UID;

public class UID_5 {
    public static void main(String[] args) {
        try {
            DataInput dataInput = new DataInputStream(System.in);
            UID uid = UID.read(dataInput);
            System.out.println("UID: " + uid);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
