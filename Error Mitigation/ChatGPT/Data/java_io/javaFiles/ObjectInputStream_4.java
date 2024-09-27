import java.io.*;

public class ObjectInputStream_4 {
    public static void main(String[] args) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            objectOutputStream.writeUTF("Hello, World!");

            byte[] byteArray = byteArrayOutputStream.toByteArray();
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArray);
            ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);

            String message = objectInputStream.readUTF();
            System.out.println(message);

            objectOutputStream.close();
            objectInputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
