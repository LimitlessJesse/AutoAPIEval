import java.io.*;

public class ObjectOutputStream_3 {
    public static void main(String[] args) {
        try {
            FileOutputStream fileOut = new FileOutputStream("output.txt");
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
            
            String str = "Hello, World!";
            objectOut.writeUTF(str);
            
            objectOut.close();
            fileOut.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
