import java.io.*;

public class ObjectInputStream_4 {
    public static void main(String[] args) {
        try {
            boolean myBool = true;
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(baos);
            oos.writeBoolean(myBool);

            byte[] bytes = baos.toByteArray();

            ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
            ObjectInputStream ois = new ObjectInputStream(bais);

            boolean readBool = ois.readBoolean();
            System.out.println("Read boolean value: " + readBool);

            oos.close();
            ois.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
